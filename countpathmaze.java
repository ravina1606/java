public class countpathmaze {

public static int countPaths(int i,int j,int n,int m)
{
    if(i==n || j==m){
        return 0;
    }
    if(i==n-1&&j==m-1)
    {
        return 1;
    }
    //move downwards
    int downPtahs=countPaths(i+1,j,n,m);

    //move rightPaths 
    int rightPaths=countPaths(i,j+1,n ,m);
    return downPtahs + rightPaths;
}
    public static void main(String[] args) {
      
        //two movements possible 1.right 2.down
      int n=3,m=3;
      int totalPaths= countPaths(0, 0, n, m);
      System.out.println(totalPaths);
    }
}
