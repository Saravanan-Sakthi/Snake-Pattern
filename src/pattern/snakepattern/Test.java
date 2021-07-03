package pattern.snakepattern;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row= s.nextInt();
        System.out.print("Enter the number of columns: ");
        int col= s.nextInt();
        int [][]snake= new int[row][col];
        System.out.println("Enter the elements: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                snake[i][j]=s.nextInt();
            }
        }
        new SnakePattern(snake).printPattern();
    }
}
