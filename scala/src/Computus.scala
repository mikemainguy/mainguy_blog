import collection.mutable.ListBuffer

object Computus {
  def main(args: Array[String]) {
    val start = System.currentTimeMillis()
    var list =  ListBuffer[String]()
    for (year <- 2000.until(1000000)) {
      list  += pretty_computus(year)
    }
    println(System.currentTimeMillis()-start)
  }

  def golden(year:Long):Long = {
    year % 19 + 1
  }

  def century(year:Long):Long = {
    (year / 100)  +1
  }

  def  solar(year:Long):Long = {
     (3 * (century(year) /4) ) -12
  }

  def  lunar(year:Long):Long = {
     ((8 * century(year) +5) / 25) - 5
  }

  def  letter(year:Long):Long = {
    5 * year / 4 - solar(year) - 10
  }

  def  epact(year:Long):Long = {
    (11 * golden(year) + 20 +lunar(year) - solar(year)) %30
  }

  def  correct_9006(year:Long):Long = {
    val epact_val = epact(year)
    if (epact_val < 0) {
      epact_val + 30
    } else {
      epact_val
    }
  }

  def  correct_epact(year:Long):Long = {
    val epact_val = correct_9006(year)
    if (((epact_val ==25) && (golden(year) > 11)) || (epact_val ==24)) {
      epact_val + 1
    } else {
      epact_val
    }
  }

  def  n_whatever(year:Long):Long = {
    44- correct_epact(year)
  }

  def  fix_n(year:Long):Long = {
    val n=n_whatever(year)
    if (n<21){
      n + 30
    } else {
      n
    }
  }

  def  computus(year:Long):Long = {
    fix_n(year) + 7 -((letter(year)+fix_n(year))%7)
  }

  def pretty_computus(year:Long):String = {
    val day_of_march = computus(year)
    if (day_of_march>31) {
      "April " + (day_of_march -31).toString()
    } else {
      "March " + day_of_march.toString()
    }
  }
}

/**
 var g, c, x, z, d, e, n
  g = YR % 19 + 1		// Golden
  c = ((YR/100)|0) + 1		// Century
  x = ((3*c/4)|0) - 12		// Solar
  z = (((8*c+5)/25)|0) - 5	// Lunar
  d = ((5*YR/4)|0) - x - 10	// Letter ?
  e = (11*g + 20 + z - x) % 30 	// Epact
  if (e<0) e += 30		// Fix 9006 problem
  if ( ( (e==25) && (g>11) ) || (e==24) ) e++
  n = 44 - e
  if (n<21) n += 30		// PFM
  return n + 7 - ((d+n)%7)

 */