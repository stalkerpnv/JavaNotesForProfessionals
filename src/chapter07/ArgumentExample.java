package chapter07;

import java.util.Arrays;

/*Java main method accepts a single argument of type String array.
Each string in the array is a command line argument.
You can use command line arguments to affect the operation of the program,
or to pass information to the program, at runtime. The following example code
shows how to print the command line arguments that you enter when you run the program:
When you compile the program and then run it with a few command line arguments separated by spaces,
the arguments get printed in the terminal:
*/
public class ArgumentExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        for(String s : args){
            System.out.println(s);
        }
    }
}
