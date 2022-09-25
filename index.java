import java.util.*;

class index{
    public static void main(String[] args) {
        System.out.print("\nhello guys.");
        Scanner input = new Scanner(System.in);


        System.out.print("\nKoi bhi number dal do : ");
        String num=input.nextLine();
        System.out.print("\n    Num + 10 : "+(num+10));

        input.close();
    }
}