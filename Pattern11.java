public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++)
        
        {
            int spaces=n-i;
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
System.out.println();
        }





    }
}
