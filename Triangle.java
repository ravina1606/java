import java.util.Scanner;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    
    Triangle() {
        this.side1 = 1;
        this.side2 = 2;
        this.side3 = 3;
    }

  
    public void setside1(int side1) {
        this.side1 = side1;
    }

    public void setside2(int side2) {
        this.side2 = side2;
    }

    public void setside3(int side3) {
        this.side3 = side3;
    }


    public int getside1() {
        return side1;
    }

    public int getside2() {
        return side2;
    }

    public int getside3() {
        return side3;
    }


    public int calperi() {
        return side1 + side2 + side3;
    }

   
    public boolean isValid() {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return true;
        } else {
            return false;
        }
    }


    public void display() {
        System.out.println("Side1: " + side1);
        System.out.println("Side2: " + side2);
        System.out.println("Side3: " + side3);
    }


    public void accept(Scanner scanner) {
        System.out.print("Enter side 1: ");
        this.side1 = scanner.nextInt();
        System.out.print("Enter side 2: ");
        this.side2 = scanner.nextInt();
        System.out.print("Enter side 3: ");
        this.side3 = scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                Triangle[] triangles = new Triangle[4];

        
        for (int i = 0; i < 4; i++) {
            triangles[i] = new Triangle();            
 System.out.println("Enter sides for Triangle " + (i + 1) + ":");
            triangles[i].accept(scanner);            
 triangles[i].display();  
            if (triangles[i].isValid()) {
                System.out.println("Perimeter: " + triangles[i].calperi());
System.out.println("valid Triangle"); 
            } else {
                System.out.println("Not a valid Triangle");
            }
            System.out.println();         }


    }
}

