import java.util.Scanner;

class evenodd {
    public static void main(String[] args) {
        // Create a Scanner instance to read input from the console
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberremainder = number % 2;
        switch(numberremainder){
            case 0:
            
            System.out.println(" the number is even");
            break;
            
            case 1:
            
                System.out.println("the number is odd");
            break;
            default:
            
                System.out.println("you gave an invalid input");
                break;
            }
        }
    }
}


       
        