package com.company;


import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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



long currentTime = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
        System.out.println(currentTime);
        long years = currentTime/1000/60/60/24/365;

        System.out.println(years);

        long minutes = currentTime;












        














    }
}
