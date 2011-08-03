public class StringJava {
    public static void main(String[] args){
        System.out.println(printComma("test1","test2","Test3"));
        System.out.println(printComma("test1",null,"Test3","Test4"));
    }
    public static String printComma(String... names) {
        StringBuffer buff = new StringBuffer();
        boolean first = true;
        for (String str: names) {
            if (str != null) {
               if (first) {
                   buff.append(str);
                   first = false;
               } else {
                   buff.append(','+str);
               }
            }
        }
        return buff.toString();
    }
}
