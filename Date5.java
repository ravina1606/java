public class Date5 {

        public static void main(String[] args) {
            int dd = Integer.parseInt(args[0]);
            int mm = Integer.parseInt(args[1]);
            int yy = Integer.parseInt(args[2]);
    
            int passday = dd;
            int monthday[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
            // Adjust for leap year
            if (yy % 4 == 0 && (yy % 100 != 0 || yy % 400 == 0)) {
                monthday[2] = 29; // February has 29 days in a leap year
            }
    
            for (int i = 1; i < mm; i++) {
                passday += monthday[i];
            }
    
            // Leap year adjustment
            if (mm > 2 && yy % 4 == 0 && (yy % 100 != 0 || yy % 400 == 0)) {
                passday++;
            }
    
            yy -= 1;
    
            // Calculate total number of days since 1/1/0001
            int leapYears = yy / 4 - yy / 100 + yy / 400;
            int ordinaryYears = yy - leapYears;
    
            int total_day = passday + (ordinaryYears * 1) + (leapYears * 2);
            int oddday = total_day % 7;
    
            // Print day of the week
            switch (oddday) {
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
            }
        }
    }
    
    

