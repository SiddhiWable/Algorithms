package recursion;

public class Factorial {
    public long factorial(long n){
        if(n<1)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String args[]){
        Factorial obj = new Factorial();
        for(int i =0; i<=10; i++){
            System.out.println("Factorial of "+i+" = "+obj.factorial(i));
        }
    }
}

/*
* OUTPUT
* Factorial of 0 = 1
Factorial of 1 = 1
Factorial of 2 = 2
Factorial of 3 = 6
Factorial of 4 = 24
Factorial of 5 = 120
Factorial of 6 = 720
Factorial of 7 = 5040
Factorial of 8 = 40320
Factorial of 9 = 362880
Factorial of 10 = 3628800
* */
