package recursion.backtracking;

import java.util.Arrays;

public class BinaryString {
    int[] A;

    public BinaryString(int n){
        A = new int[n];
    }

    public void binary(int n){
        if(n<=0){
            System.out.println(Arrays.toString(A));
        } else {
            A[n-1]=0;
            binary(n-1);
            A[n-1]=1;
            binary(n-1);
        }
    }

    public static void main(String[] args){
        BinaryString binaryString = new BinaryString(2);
        binaryString.binary(2);
    }
}


//OUTPUT
//        [0, 0, 0]
//        [1, 0, 0]
//        [0, 1, 0]
//        [1, 1, 0]
//        [0, 0, 1]
//        [1, 0, 1]
//        [0, 1, 1]
//        [1, 1, 1]