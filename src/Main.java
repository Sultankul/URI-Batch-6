import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1,x2,y1,y2;
        while ((x1 = scanner.nextInt()) !=0 && (x2 = scanner.nextInt())!=0 && (y1 = scanner.nextInt()) !=0 && (y2= scanner.nextInt()) !=0){
            int x = Math.abs(x1-x2);
            int y = Math.abs(y1-y2);
            if (x1 == x2 && y1==y2){
                System.out.println(0);

            }else if (x1==x2 || y1==y2 || x==y){
                System.out.println(1);
            }else {
                System.out.println(2);
            }

        }
    }
}
