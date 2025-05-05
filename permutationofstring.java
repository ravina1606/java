public class permutationofstring {
    
    public static void printpermutations(String str,String permutation)
    {
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currchar=str.charAt(i);
            String newStr=str.substring(0,i )+str.substring(i+1);
            printpermutations(newStr, permutation+currchar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        //time complexity=O(n!)
        printpermutations(str, "");


        /*Start: ("abc", "")
   Pick 'a' -> ("bc", "a")
       Pick 'b' -> ("c", "ab")
           Pick 'c' -> ("", "abc") => Print "abc"
       Pick 'c' -> ("b", "ac")
           Pick 'b' -> ("", "acb") => Print "acb"
   Pick 'b' -> ("ac", "b")
       Pick 'a' -> ("c", "ba")
           Pick 'c' -> ("", "bac") => Print "bac"
       Pick 'c' -> ("a", "bc")
           Pick 'a' -> ("", "bca") => Print "bca"
   Pick 'c' -> ("ab", "c")
       Pick 'a' -> ("b", "ca")
           Pick 'b' -> ("", "cab") => Print "cab"
       Pick 'b' -> ("a", "cb")
           Pick 'a' -> ("", "cba") => Print "cba"
 */
    }
}
