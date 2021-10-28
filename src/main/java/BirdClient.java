import java.util.Scanner;
public class BirdClient {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your bird's name?");
        String name = scan.nextLine();
        Bird Bird1 = new Bird(name, 0, "color");
        Bird1.setAge(3);
        System.out.println(Bird1.getAge());
        Bird1.grow();
        System.out.println(Bird1.getAge());
        System.out.println(Bird1.getName());
        Bird1.setNewName("idk");
        System.out.println(Bird1.getName());
        System.out.println(Bird1.getColor());
        Bird1.paintColor("Blue");
        System.out.println(Bird1.getColor());
        System.out.println(Bird1.getBirdInfo());
    }
}


