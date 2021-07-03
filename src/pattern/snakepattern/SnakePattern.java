package pattern.snakepattern;
public class SnakePattern {
    int [][] snake;
    int row;
    int col;
    int i ,j;
    SnakePattern(int [][] snake){
        this.snake=snake;
        row=snake.length-1;
        col=snake[0].length-1;
        i =0;
        j=col;
    }
    void left(){
        System.out.print(snake[i][--j]+" ");
    }
    void down(){
        System.out.print(snake[++i][j]+" ");
    }
    void downRight(){
        while(true){
            if (i==row || j==col) break;
            System.out.print(snake[++i][++j]+" ");
        }
    }
    void upLeft(){
        while(j!=0 || i!=0){
            if (i==0 || j==0) break;
            System.out.print(snake[--i][--j]+" ");
        }
    }
    void printPattern(){
        System.out.println("The output is:");
        System.out.print(snake[i][j]+" ");
        while(true){
            if (i==row && j==0) break;
            if (i==0){
                if (j!=0)left();
                else down();
                downRight();
            }
            else if (i==row){
                left();
                upLeft();
            }
            else if (j==col){
                if (i!=row)down();
                else left();
                upLeft();
            }
            else if (j==0){
                down();
                downRight();
            }
        }
    }
}
