package com.kuranege;

import java.util.Scanner;

public class PartDetector {

    public static void main(String[] args) {
//        A detector compares the size of parts produced by a machine with the reference standard.
//
//                If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
//        If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
//        If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
//
//        Write a program, which takes the number of parts n as input, and then the sequence of detector prints. The program should output numbers in a single line containing the number of parts ready to be shipped, the number of parts to be fixed, and the number of rejects.
//
//        Sample Input 1:
//
//        10
//        1
//       -1
//        1
//        1
//        1
//        1
//       -1
//       -1
//        1
//       -1
//        Sample Output 1:
//
//        0 6 4

        Scanner scan = new Scanner(System.in);
        int partNumber = scan.nextInt();
        int countOne = 0,countZero = 0, countMinOne = 0;
        for(int i = 0; i < partNumber; i++){
            int number = scan.nextInt();
            if(1 == number) {
                countOne++;
            }
            if(0 == number){
                countZero++;
            }
            if(-1 == number){
                countMinOne++;
            }
        }
        System.out.println(countZero + " " + countOne + " " + countMinOne);



    }
}
