
public class Square{

private float side=4.0f;
private float area ;
private float perimeter;
void calculate_area()
{
area = (float)(side*side) ;
}
void calculate_perimeter()
{
perimeter=(float) (4* side)  ;
}
void display()
{
System.out.println("Area: "+ area);
System.out.println("Perimeter: "+ perimeter);
}

public static void main(String[] args){
Square s=new Square();
s.calculate_area();
s.calculate_perimeter();
s.display();
}
}