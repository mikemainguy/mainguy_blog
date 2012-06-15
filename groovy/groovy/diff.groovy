assert "AA" < "BB"
assert "BB" > "AA"
fname1 = "file1.txt"
fname2 = "file2.txt"

def f1 = new File(fname1).readLines() as Set
def f2 = new File(fname2).readLines() as Set

def matched = new HashSet()
def onlyInLeft = new HashSet()
def onlyInRight = new HashSet()
def combined = new TreeSet()


f1.each {
  if (f2.contains(it)) {
    matched.add(it)
  } else {
    onlyInLeft.add(it)
  }
  combined.add(it)
}

f2.each {
  if (!matched.contains(it)) {
    onlyInRight.add(it)
    combined.add(it)
  }
}
def builder = new StringBuilder()
combined.each {
  if (matched.contains(it)) {
    builder <<  "<tr class='match'><td colspan=2>${it}</td></tr>"
  } else if (onlyInLeft.contains(it)) {
    builder << "<tr class='left'><td class='left'>${it}</td><td>&nbsp;</td></tr>"
  } else if (onlyInRight.contains(it)) {
    builder << "<tr class='right'><td>&nbsp;</td><td class='right'>${it}</td></tr>"
  } else {
    builder << "<tr class='error'><td colspan=2>${it}</td></tr>"
  }
}

def output = new File("output.html")
style = """
<style>
  .match {background: #3F3}
  table {border: solid 1px #ccc; width: 100%}
  td {border: solid 1px #ccc; margin: 0}
</style>
"""
output.write "<html><head>${style}</head><body><table>${builder}</table></body></html>"