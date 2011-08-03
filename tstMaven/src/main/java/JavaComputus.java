import java.util.ArrayList;

public class JavaComputus {
    
    
  public static void main(String[] args) {
    Long start = System.currentTimeMillis();
    ArrayList list = new ArrayList<String>();

    for (long i = 2000; i < 1000000; i++) {
       list.add(pretty_computus(i));
    }
    System.out.println(System.currentTimeMillis()-start);
  }

  public static Long golden(Long year) {
    return year % 19 + 1;
  }

  public static Long century(Long year) {
    return (year / 100)  +1;
  }

  public static Long  solar(Long year) {
     return (3 * (century(year) /4) ) -12;
  }

  public static Long  lunar(Long year) {
     return ((8 * century(year) +5) / 25) - 5;
  }

  public static Long  letter(Long year) {
    return 5 * year / 4 - solar(year) - 10;
  }

  public static Long  epact(Long year) {
    return (11 * golden(year) + 20 +lunar(year) - solar(year)) %30;
  }

  public static Long  correct_9006(Long year) {
    Long  epact_val = epact(year);
    if (epact_val < 0) {
      return epact_val + 30;
    } else {
      return epact_val;
    }
  }

  public static Long  correct_epact(Long year) {
    Long epact_val = correct_9006(year);
    if (((epact_val ==25) && (golden(year) > 11)) || (epact_val ==24)) {
      return epact_val + 1;
    } else {
      return epact_val;
    }
  }

  public static Long  n_whatever(Long year) {
    return 44- correct_epact(year);
  }

  public static Long  fix_n(Long year) {
    Long n=n_whatever(year);
    if (n<21){
      return n + 30;
    } else {
      return n;
    }
  }

  public static Long  computus(Long year) {
    return fix_n(year) + 7 -((letter(year)+fix_n(year))%7);
  }

  public static String pretty_computus(Long year) {
    Long day_of_march = computus(year);
    if (day_of_march>31) {
      return "April " + ((Long)(day_of_march -31)).toString();
    } else {
      return "March " + day_of_march.toString();
    }
  }

}
