public class placetotaltiles {
    
    public static int placetiles(int n,int m)
    {
        if(n==m)
    {
        return 2;
    }
    if(n<m)
    {
        return 1;
    }
       //vertically
       int verticalplacements=placetiles(n-m, m);

       //horizontally
       int horizontplacements=placetiles(n-1, m);

       return  verticalplacements+horizontplacements;
    }
    public static void main(String[] args) {
       int n=4,m=2;
       System.out.println(placetiles(n, m)); 
    }
}
