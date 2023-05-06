package Algorithms.Sort;

public class Recursion {

    public static void main(String[]args){
        System.out.println( iterativeFactorial(5));
        System.out.println( recursiveFactorial(5));
        //The below call will give stack overflow error not because base condition is missing but stack is full
//        System.out.println( recursiveFactorial(598789079));

    }

    public static int recursiveFactorial(int num){
        if(num==0)
            return 1;

        return num * recursiveFactorial(num-1);
    }

    public static int iterativeFactorial(int num){

        if(num==0)
            return 1;

        int factorial=1;

        for(int i =num; i>=1;i--)
        {
            factorial*=i;
        }
        return factorial;

    }

}

/* NOTES
1. Recursion is a way for a method to call itself
2. Base Condition is a requirement for a recursion so that it can unwind and end
3. Not having a base condition or having a lot of recursive calls will give Stack Overflow Error
4. Iterative Calls are faster because recursion involves overhead of pushing calls to stack and stack takes memory
5. Recursion code is simpler and easier to understand as compared to the iterative code.

 */