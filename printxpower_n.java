public class printxpower_n {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==1)
        {
            return 0;

        }
        int xPownm1 =calcpower(x, n-1);
        int xpow=x*xPownm1;
        return xpow;

    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcpower(x, n);
        System.out.println(ans);
    }
    
}
