import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        System.out.println("Enter your choice:");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                try {
                    int a = 100 / 0;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
                break;
            case 2:
                try {
                    String s = null;
                    System.out.println(s.length());
                } catch (NullPointerException e) {
                    System.out.println(e);
                }
                break;
            case 3:
                try {
                    String m = "abc";
                    int i = Integer.parseInt(m);
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
                break;
            case 4:
                try {
                    int a[] = new int[5];
                    a[10] = 50;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}

