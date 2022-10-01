import java.math.BigInteger;
import java.util.Scanner;

public class BinaryToNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger input = BigInteger.ZERO;
        BigInteger output = BigInteger.ZERO;

        try{
            input = sc.nextBigInteger();
        } catch(Exception ignored){}

        String intString = input.toString(10);

        int[] binaryNum = new int[intString.length()];

        for(int i = 0; i < intString.length(); i++){
            binaryNum[i] = intString.charAt(i) - '0';
        }

        for(int i = 0; i < binaryNum.length / 2; i++) {
            int temp = binaryNum[i];
            binaryNum[i] = binaryNum[binaryNum.length - i - 1];
            binaryNum[binaryNum.length - i - 1] = temp;
        }

        for(int i = 0; i < binaryNum.length; i++){
            output = output.add(BigInteger.valueOf((long) (Math.pow(2, i) * binaryNum[i])));
        }

        System.out.println(output);
    }
}
