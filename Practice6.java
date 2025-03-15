public class Practice6{
    public static void main(String[] args)
    {
        //practice problem 1
         /* 
        float []marks={45.3f,52.1f,42.1f,95.4f,65.6f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("the value of sum is "+sum);
        
   //practice problem 2
   
        //practice problem 1
        float []marks={45.3f,52.1f,42.1f,95.4f,65.6f};
        float num=45.2f;
        boolean isInArray =false;
        for(float element:marks)
        {
            if(num==element)
    {
        isInArray=true;
        break;
    }
            
        }
        if(isInArray)
        {
            System.out.println("the value is present in array");

        }else{
            System.out.println("the value is not present in the array" );

        }
        

float []marks={45.3f,52.1f,42.1f,95.4f,65.6f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("the value of average marks is "+sum/marks.length);
        
*/
int [] arr={1,56,87,98,106,85};
int max=0;
for(int element:arr)
{
    if(element>max)
    {
        max=element;
    }
}
System.out.println("maximum is "+max);

    }
}