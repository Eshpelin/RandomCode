/*
 
 You are given a number N. Print the factorial of the number.
 
 N! = N * (N-1) * (N-2) * ... * 3*2*1
 
Input 
 
Input consists of a single integer N, where 1<= N <= 100

Output 
Print the factorial of N.

Example 
For an input of 25, you would print 15511210043330985984000000.
For an input of 250, you would print 3232856260909107732320814552024368470994843717673780666747942427112823747555111209488817915371028199450928507353189432926730931712808990822791030279071281921676527240189264733218041186261006832925365133678939089569935713530175040513178760077247933065402339006164825552248819436572586057399222641254832982204849137721776650641276858807153128978777672951913990844377478702589172973255150283241787320658188482062478582659808848825548800000000000000000000000000000000000000000000000000000000000000 

Note: Factorials of N>20 can't be stored even in a 64 bit long long variable.
Big integers must be used for such calculations. 
Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.
 
 
 
 */
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class HandlingExtraLongFactorialsInJava {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(extraLongFactorial(25));
        System.out.println(extraLongFactorial(250));
    }
    
    public static BigInteger extraLongFactorial(int number) {
        if (number == 0 || number == 1)
            return new BigInteger("1");
        return new BigInteger(String.valueOf(number)).multiply(new BigInteger(String.valueOf(extraLongFactorial(number - 1))));
    }
}