package com.company;


import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1 pack Variables

        // 2 uzduotis
//
//        int a = (int) (Math.random()*5);
//        int b = (int) (Math.random()*5);
//
//        System.out.println(a +" "+b);
//
//        if(a == 0 || b == 0) {
//        System.out.println("vienas yra 0");
//        }
//        if(a!=0 && b!=0) {
//            if (a > b) {
//                System.out.println( Math.round( (double) a/b*100.0)/100.0 );
//            }
//            if (a < b) {
//                System.out.println(  Math.round( (double) b/a*100.0)/100.0 );
//            }
//        }
//        if(a==b) {
//            System.out.println("equals");
//        }
//
        // 3 uzduotis

//        double a = Math.random()*26;
//        double b = Math.random()*26;
//        double c = Math.random()*26;
//        System.out.println(a+" "+b+" "+c);
//
//        if(a == b || b == c || a == c) {
//            System.out.println("err");
//        }
//
//        if((a<b&&b<c) || (a>b&&b>c)) {
//            System.out.println(b);
//        }
//
//
//        if((b<a&&b<c) || (b>a&&a>c)) {
//            System.out.println(a);
//        }
//        if((b<c&&c<a) || (b>c&&c>a)) {
//            System.out.println(c);
//        }

        // 4 uzduotis

//        int a = (int) (1+(Math.random()*10));
//        System.out.println(a);

        // 5
//
//        int a = (int) (Math.random()*3);
//        int b = (int) (Math.random()*3);
//        int c = (int) (Math.random()*3);
//        int d = (int) (Math.random()*3);
//        System.out.println(a+""+b+""+c+""+d);
//
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//
//        if(a==0) {
//            zeros++;
//        }
//        if(a==1) {
//            ones++;
//        }
//        if(a==2) {
//            twos++;
//        }
//        if(b==0) {
//            zeros++;
//        }
//        if(b==1) {
//            ones++;
//        }
//        if(b==2) {
//            twos++;
//        }
//        if(c==0) {
//            zeros++;
//        }
//        if(c==1) {
//            ones++;
//        }
//        if(c==2) {
//            twos++;
//        }
//        if(d==0) {
//            zeros++;
//        }
//        if(d==1) {
//            ones++;
//        }
//        if(d==2) {
//            twos++;
//        }
//
//        System.out.println("Zeroes: "+zeros+" Ones: "+ones+" Twos: "+twos);


        // 6




        // 9 uzduotis
//
//        int hours = (int) (Math.random()*24);
//        int minutes = (int) (Math.random()*60);
//        int seconds = (int) (Math.random()*60);
//
//        String hString = String.valueOf(hours);
//        String mString = String.valueOf(minutes);
//        String sString = String.valueOf(seconds);
//
//        if(hours<10) {
//            hString = "0"+hString;
//        }
//        if(minutes<10) {
//            mString = "0"+mString;
//        }
//        if(seconds<10) {
//            sString = "0"+sString;
//        }
//
//        System.out.println("Generated time: "+hString+":"+mString+":"+sString);
//
//        int addSec = (int) (Math.random()*301);
//        System.out.println("Seconds to add: "+addSec);
//        int  newSec = seconds + addSec;
////        System.out.println(newSec);
//        if(newSec>59) {
//            int addMin = newSec/60;
//            newSec -= addMin*60;
////            System.out.println(addMin);
////            System.out.println(newSec);
//            minutes+= addMin;
////            System.out.println(minutes);
//                if(minutes>=60) {
//                    hours++;
//                    minutes -= 60;
//                    if(hours>=24) {
//                        hours=0;
//                    }
//                    hString = String.valueOf(hours);
//                }
//            mString = String.valueOf(minutes);
//            sString = String.valueOf(newSec);
//
//            if(hString.length()<2) {
//                hString = "0"+hString;
//            }
//            if(mString.length()<2) {
//                mString = "0"+mString;
//            }
//            if(sString.length()<2) {
//                sString = "0"+sString;
//            }
//            System.out.println("New time: "+hString+":"+mString+":"+sString);
//
//        } else if(newSec<=59) {
//            sString = String.valueOf(newSec);
//            if(hString.length()<2) {
//                hString = "0"+hString;
//            }
//            if(mString.length()<2) {
//                mString = "0"+mString;
//            }
//            if(sString.length()<2) {
//                sString = "0"+sString;
//            }
//            System.out.println("New time: "+hString+":"+mString+":"+sString);
//        }


//        Užduotys 2 Stringai

     // 1
//    String a = "Mackenzie";
//    String b = "Davis";
//
//     if (a.length()>b.length()) {
//         System.out.println(b);
//     } else {
//         System.out.println(a);
//     }
//
//     //2
//    System.out.println(a.toUpperCase());
//    System.out.println(b.toLowerCase());
//
//    //3
//    char c = a.charAt(0);
//    char d = b.charAt(0);
//    System.out.println(c+""+d);
//
//    //4
//
//        String e = (a.substring(a.length()-3)) + (b.substring(b.length()-3));
//        System.out.println(e);
//
//    //5
//
//    String american = "An American in Paris";
////    american = american.replace("a", "*");
////    american = american.replace("A", "*");
////        System.out.println(american);
//
//
//    //6
//    american = american.replaceAll("[AaEeIiOoUu]","");
//        System.out.println(american);
//
//
//    //7
//    String gen = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(gen);
//        gen = gen.replaceAll("[^0-9]+", " ");
//        System.out.println(Arrays.asList(gen.trim().split(" ")));
//
//
    //8
//
//    String str = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
//    String[] arr = str.split(" ");
//    int i = 0;
//    for(String s: arr) {
//        if(s.length()<6) {
//            i++;
//        }
//    }
//    System.out.println(i);
//






// Scanner
////
//    Scanner scanner = new Scanner(System.in);
////    System.out.println("Įvest vardą");
////    String name = scanner.nextLine();
////    System.out.println("Reversed: "+new StringBuilder(name).reverse().toString());
////
////
//
//
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Surname: ");
//        String surname = scanner.nextLine();
//        System.out.print("Age: ");
//        try {
//            scanner.nextInt();
//            System.out.println("number");
//        } catch (Exception e) {
//            System.out.println("not a number");
//        }
//        int age = 10;
//
//        System.out.print("Do you study programming: Yes/No?");
//        String study = scanner.nextLine();
//        System.out.println("Name: "+name+" Surname: "+surname+" Age: "+age+" Studies programming: "+study);
//


//
//long currentTime = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
//        System.out.println(currentTime);
//        long years = currentTime/1000/60/60/24/365;
//
//        System.out.println(years);
//
//        long minutes = currentTime;


// LOOPS

        //1
//    int count = 0;
//    for(int i = 0; i<301; i++) {
//        int a = (int) (Math.random()*300);
//        if(a>150) {
//            count++;
//        }
//        if(a>275) {
//            System.out.print("["+a+"] ");
//        } else {
//            System.out.print(a+" ");
//        }
//    }
//    System.out.println("\nLarger than 150: "+count);
//

    //2
//    String comma = "";
//    for(int i = 0; i<3001; i++) {
//        if(i%77==0) {
//            System.out.print(comma+i);
//            comma = ",";
//        }
//    }

    //3, 4
    int countRed = 0;
    int countRed2 = 100;

    for (int i = 0; i<101; i++) {
        System.out.println("");
        for (int y = 0; y<101; y++) {
            if(countRed==y || countRed2==y) {
                System.out.print("0");

            } else {
                System.out.print("*");
            }
        }
        countRed++;
        countRed2--;
    }


    // 5


//        int r = -1;
//        int i = 0;
//
//        while(i<3) {
//            r = (int) (Math.random() * 2);
//            System.out.println(r);
//            if(r==0) {
//                i++;
//            }
//        }

//        int r = -1;
//        int i = 0;
//
//        while(i<3) {
//            r = (int) (Math.random() * 2);
//            System.out.println(r);
//            if(r==0) {
//                i++;
//            } else {
//                i=0;
//            }
//        }

    //6

//    int p = 0;
//    int k = 0;
//
//    while(p<222 && k<222) {
//        p += (int) (10+(Math.random()*(20-10)));
//        k += (int) (5+(Math.random()*(25-5)));
//    }
//
//    System.out.println("Petras surinko "+p+" taškų; Kazys surinko "+k+" taškų.");
//    if(p>k) {
//        System.out.println("Partiją laimėjo: Petras");
//    } else if (k>p) {
//        System.out.println("Partiją laimėjo: Kazys");
//    } else {
//        System.out.println("Lygiosios!");
//    }
//
    //7

        int lines = 21;

        for (int i = 0; i<lines; i++) {
            System.out.println("");
            if (i<=(lines/2)) {
                for (int c = 0; c < lines; c++) {
                    if (c == (lines / 2) || (c <= (lines / 2 + i) && c >= (lines / 2 - i))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (i>(lines/2)){
                for (int c = 0; c < lines; c++) {
                    if (c == (lines / 2) || ((c <= lines-(i-(lines/2-1))) && (c >= (i-lines/2)) )) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }


























        














    }
}
