public class Complex{
public double real;
public double img; 
void init(double real, double img)
{
this.real=real;
this.img=img;
System.out.println("Complex number: "+ real + "+" + img);
}
public static void main(String[] args)
{
Complex c=new Complex();

double real = Double.parseDouble(args[0]);
  double img = Double.parseDouble(args[0]);


c.init(real,img);
}
}