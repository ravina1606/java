public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        StringBuilder sb1=new StringBuilder("h");
        System.out.println(sb);

        //chae at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');

        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(3,'n');
        System.out.println(sb);
        //delete the extra n
        sb.delete(3, 4);
        System.out.println(sb);


sb1.append("e");
sb1.append("l");
sb1.append("l");
sb1.append("o");
System.out.println(sb1);
System.out.println(sb.length());
    }
    
}
