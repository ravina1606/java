public class Recursion7 {
    
    public static void subsequences(String str,int idx,String newString)
    {
if(idx==str.length())
{
    System.out.println(newString);
    return;

}
        char currchar=str.charAt(idx);
        //to be
        subsequences(str, idx+1, newString+currchar);

        //or not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        //time complexity =O(2^n)
        subsequences(str, 0, "");
    }
}
