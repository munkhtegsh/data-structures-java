package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RecursiveMethodTrace {

    public static void main(String[] args) {
//		int x = 1;
//		Student s = new Student("Jess", 1);
//		System.out.println("in main at the start\t\t\t\tx=" + x + "  id=" + s.getId());
//		method(x, s, 1, 3);
//		System.out.println("in main at the end\t\t\t\tx=" + x + "  id=" + s.getId());

//		fib(4);

//        System.out.println(printStr("Hello"));

//		System.out.println(sum(3));

//		System.out.println(readUserInput(1,10));
//        System.out.println(countChar("Hello", 'l', 0));

        int[] arr = {1, 2, 3, 4};
//		System.out.println(sumArray(arr, 0, 0));

//		System.out.println(fibo(10));

        String str = "Hello";
//		System.out.println(reverseStr(str, str.length() - 1));

//		System.out.println(palindrom("oll", 0, 2));

//		System.out.println(exponent(3, 2));

//        System.out.println(Arrays.toString(arr));
//        reverseArr(arr);
//        System.out.println(Arrays.toString(arr));


        System.out.println(qNotFollowedByU("q."));
    }


    private static void method(int x, Student s, int incValue, int maxInc) {
        if (incValue <= maxInc) { // recursive case
            System.out.println("in method incVal=" + incValue + " at the start\t\t\tx=" + x + "  id=" + s.getId());
            int newX = x + incValue;
            x = newX;
            s.setId(x);
            System.out.println("in method incVal=" + incValue + " before recursive call\tx=" + x + "  id=" + s.getId());
            method(x, s, incValue + 1, maxInc); // recursive method call
            System.out.println("in method incVal=" + incValue + " after recursive call\t\tx=" + x + "  id=" + s.getId());
            x = x + incValue;
            s.setId(s.getId() + 1);
            System.out.println("in method incVal=" + incValue + " at the end\t\t\tx=" + x + "  id=" + s.getId());
        } else { // base case
            System.out.println("Recursion done.");
        }
    }
	
	/* with a helper method would look something like this
	public static void method(int x, Student s) {
		helperMethod(x, sc);
	}
	*/

    public static void fib(int n) {
        if (n == 1) {
            System.out.println("DONE");
        } else {
            System.out.println("BEFORE recursion: " + n);
            fib(n - 1);
            System.out.println("AFTER recursion: " + n);
        }
    }

    public static String printStr(String str) {
        if (str.length() == 1) {
            return String.valueOf(str.charAt(0));
        } else {
            System.out.println(str.charAt(0));
            return printStr(String.valueOf(str.substring(1, str.length())));
        }
    }

    public static int sum(int n) {
        if (n >= 1) {
            return n + sum(n - 1);
        }

        return n;
    }

    public static int readUserInput(int lower, int upper) {
        System.out.println("Enter a number betwen" + lower + " and " + upper);
        Scanner scan = new Scanner(System.in);
        int userNumber = Integer.parseInt(scan.nextLine());
        if (userNumber < lower || userNumber > upper) {
            System.out.println("Input out of range. Try again");
            readUserInput(lower, upper);
        }

        return userNumber;
    }

    public static int countChar(String s, char c, int idx) {
        if (idx < s.length()) {
            if (s.charAt(idx) == c) {
                return 1 + countChar(s, c, idx + 1);
            } else {
                return countChar(s, c, idx + 1);
            }
        } else {
            return 0;
        }

        // uses local vars
//		int count = 0;
//		if (idx < s.length()) {
//			if (s.charAt(idx) == c) {
//				count++;
//			}
//			return count + countChar(s, c, idx + 1);
//		}
//
//		return count;

    }

    public static int sumArray(int[] arr, int i, int acc) {
        if (arr.length > i) {
            return acc + sumArray(arr, i + 1, acc + arr[i]);
        } else {
            return 0;
        }
//		if (arr.length > i) {
//			return arr[i] + sumArray(arr, i + 1);
//		} else {
//			return 0;
//		}
    }

    public static int fibo(int num) {

        if (num >= 2) {
            return fibo(num - 1) + fibo(num - 2);
        } else {
            return num;
        }
    }

    public static String reverseStr(String str, int i) {
//	    if (i >= 0) {
//	    	String c = "" + str.charAt(i);
//	    	return c + reverseStr(str, i - 1);
//		} else {
//	    	return "";
//		}


        if (i >= 0) {
            return reverseStr(str, i - 1) + str.charAt(i); // other way to reverse, gotta start beginning of the str, i = 0
        } else {
            return "";
        }

//		String s = "";
//
//		if (i >= 0) {
//		    s += str.charAt(i);
//			return s + reverseStr(str, i - 1);
//		}
//		return s;

    }

    public static boolean palindrom(String str, int beginIdx, int endIdx) {
        if (endIdx < 0) {
            return true;
        }
        if (str.charAt(beginIdx) == str.charAt(endIdx)) {
            return palindrom(str, beginIdx + 1, endIdx - 1);
        } else {
            return false;
        }
    }

    //	public static int exponent(int base, int power) {
//
//		if (power > 1) {
//			return base * exponent(base, power - 1);
//		} else if(power == 0) {
//			return 1;
//		} else {
//			if (power < -1) {
//				return base / exponent(base, power + 1);
//			} else {
//				return base;
//			}
//		}
//	}
    public static int exponent(int base, int power) {
        if (power >= 1) {
            return base * exponent(base, power - 1);
        } else {
            return 1;
        }
    }

    public static void reverseArr(int[] arr) {
        reverseArrHelper(arr, 0, arr.length - 1);
    }

    public static int[] reverseArrHelper(int[] arr, int beginIdx, int lastIdx) {
        if (lastIdx >= 0 && beginIdx < lastIdx) {
            int temp = arr[beginIdx];
            arr[beginIdx] = arr[lastIdx];
            arr[lastIdx] = temp;
            return reverseArrHelper(arr, beginIdx + 1, lastIdx - 1);
        } else {
            return arr;
        }
    }

    public static boolean qNotFollowedByU(String word) {
        return qNotFollowedByUHelper(word, 0);
    }

    public static boolean qNotFollowedByUHelper(String word, int i) {
        if (i <= word.length() - 2) {
            String s = word.charAt(i) + "" + word.charAt(i+1);
            if (s.equals("qu")) {
                return false;
            } else {
                return qNotFollowedByUHelper(word, i + 1);
            }
        } else {
            return true;
        }
    }
}
