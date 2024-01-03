
    import java.util.Scanner;
/**
 * info
 */
public class info {

    public static void main(String[] args) {
        java.util.Scanner enter=new Scanner(System.in);
        int x;
        String name;
        System.out.println("enter you name:");
        name=enter.nextLine();
        System.out.println("enter your lucky number");
        x=enter.nextInt();
        System.out.println("HI"+" "+name);
        System.out.println("based on your lucky number:"+"#"+x+" "+"YOU ARE AWESOME!");
    }
}

