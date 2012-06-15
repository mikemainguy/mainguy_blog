
def a = new BigDecimal(10)
def b = new BigDecimal("10")
def c = new BigDecimal("10.0")
def e = new BigDecimal(10.0)

def f = new BigDecimal(0.1)
def g = new BigDecimal("0.1")

assert a.equals(b)
assert b.equals(e)

assert !b.equals(c)
assert !c.equals(a)
assert !c.equals(e)

assert !f.equals(g)


