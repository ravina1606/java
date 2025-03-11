public class Date4 {    public static void main(String[] args) {
    String str=args[0];
    int dd=Integer.parseInt(args[0]);
    int mm=Integer.parseInt(args[1]);
    int yy=Integer.parseInt(args[2]);
    int passday=dd;
    int monthday[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    for(int i=0;i<mm;i++)
    {
        passday=passday+monthday[i];
    }
    if(yy%4==0&&mm>2)
    {
        dd++;
    }
    //System.out.println(passday);

    yy=yy-1;
    int x=yy/400;
    int y=yy%400;
    int w=y/100;
    int z=y%100;

    int startyear=(yy-z+1);
    int ly=0;
    int i;
    for(i=startyear;i<=yy;i++)
    {
        if((i%4==0)&&(i%100!=0))
        {
            ly++;
        }
        else if((i%400==0)&&(i%100==0))
        {
            ly++;
        }
    }
    int oy=z-ly;
    int total_day=passday+(w*5)+oy+(ly*2);
    int oddday=total_day%7;
    System.out.println(oddday);
    switch (oddday) {
        case 0:
          System.out.println("day");
          break;
        case 1:
      System.out.println("Tuesday");
          break;
        case 2:
          System.out.println("Wednesday");
          break;
        case 3:
          System.out.println("Thusrday");
          break;
        case 4:
          System.out.println("Friday");
          break;
        case 5:
          System.out.println("Saturday");
          break;
        case 6:
          System.out.println("Sunday");
          break;
      }

}
}

    

