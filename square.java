import java.util.Scanner; 

public class square {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter an integer for the size of the square: ");

        
        int size = input.nextInt();

        
        if (size <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Generating a square pattern of size " + size + ":");

            
            for (int i = 0; i < size; i++) {
                
                for (int j = 0; j < size; j++) {
                    System.out.print("* "); 
                }
                System.out.println(); 
            }
        }

        
        input.close();
    }
}
