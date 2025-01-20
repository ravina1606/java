
public class Circle{

private float radius=4.0f;
private float area ;
private float circumference;
void calculate_area()
{
area = (float)(3.14 * (radius *radius)) ;
}
void calculate_circumference()
{
 circumference=(float) (2 *3.14 *radius)  ;
}
void display()
{
System.out.println("Area: "+ area);
System.out.println("Circumference: "+ circumference);
}

public static void main(String[] args){
Circle c=new Circle();
c.calculate_area();
c.calculate_circumference();
c.display();
}
}

