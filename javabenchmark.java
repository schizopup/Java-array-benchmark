import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.io.*;

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  System.out.println("This program is meant to benchmark your system as well as the speed of the java language, please keep this in mind while we continue");
  System.out.println("");
  System.out.println("This is a random number generator that will then place these random results in order in an array, for this next section please input the amount of numbers to generate (Reccomended : 100000000)");
  System.out.println("");
  
  int n = sc.nextInt();
  sc.close();

  System.out.println("this may take a moment, please be patient");

  long startT = System.nanoTime();
  benchmark(n);
  long endT = System.nanoTime();
  long execT = (endT - startT) / 1000000;
  
  System.out.println("");
  System.out.println("Execution to generate and order took " + execT + "ms");
  System.out.println("");
  System.out.println("2025 - schizopup carrie / cyberfuck inc");

}

public static void benchmark(int n) {

  long[] x = new long[n];

  for (int i = 0; i != n; i++) {
    x[i] = (long) (Math.random() * 1000000 + 1);
  };

  Arrays.sort(x);

}
