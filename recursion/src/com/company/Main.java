package com.company;

import org.w3c.dom.Node;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        System.out.println(methodA(-3));

//        System.out.println(methodB("hello there",'h'));

        int[] arr = {1, 4, 6, 3, 2, 7, 8, 0};
//        System.out.println(countEvens(arr));

//        recMethod(arr, 3, 2);
//        System.out.println("Arr: " + arr);

//        infiniteRecursion(4);
//        secretMethod(3, 3);

//        System.out.println(method1(2));
//        System.out.println(method2(2));

//        System.out.println(countOdds(arr));

//        System.out.println(evenPosZero(-1));

//        System.out.println(countZeros(arr));
//        System.out.println(count(3));

//        System.out.println("SUM : " + sum( 3));

        System.out.println(qNotFollowedByU("nonequuaqJ"));
    }


    public static int methodA(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return 1 + methodA(n - 1);
        } else {
            return 1 + methodA(n + 1);
        }
    }

    public static int methodB(String s, char c) {
        if (s.length() == 0) {
            return 0;
        } else {
            return (s.charAt(0) == c ? 1 : 0) + methodB(s.substring(1), c);
        }
    }

    public static int countEvens(int[] array) {
        return countEvensHelper(array, 0, array.length);
    }

    private static int countEvensHelper(int[] array, int start, int stop) {
        int count = 0;
        if (start == stop) {
            return count;
        } else {
            if (array[start] % 2 == 0) {
                count = 1 + countEvensHelper(array, start + 1, stop);
            }
            return count;
        }
    }

    public static void recMethod(int[] array, int start, int end) {
        if (start < end) {
            System.out.println(Arrays.toString(array));
            array[start] = array[start] * 2;
            recMethod(array, start + 1, end);
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Done");
        }
    }

    public static void infiniteRecursion(int n) {
        if (n > 0) {
            System.out.println("here");
            infiniteRecursion(n - 1);
        } else if (n < 0) {
            System.out.println("here");
            infiniteRecursion(n + 1);
        } else {
            System.out.println("here");
        }
    }

//    public static int secretMethod(int x, int y) {
//        if (x == y) {
//            return 1;
//        } else {
//            return secretMethod(x-1, y) + 1;
//        }
//    }

    public static int method1(int x) {
        if (x > 0) {
            return method1(x - 1) + 1;
        } else {
            return 0;
        }
    }

    public static int method2(int x) {
        if (x <= 0) {
            return 0;
        } else {
            return 1 + method2(x - 1);
        }
    }

    public static int countOdds(int[] array) {
        return countOddsHelper(array, 0, array.length);
    }

    private static int countOddsHelper(int[] array, int start, int stop) {
        int count = 0;
        if (start < stop) {
            if (array[start] % 2 == 1) {
                count++;
            }
            countOddsHelper(array, start + 1, stop);
        }
        return count;
    }

    public static boolean evenPosZero(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        } else {
            return evenPosZero(x - 2);
        }

    }

    public static int countZeros(int[] array) {
        return countZerosHelper(array, 0, array.length, 0);
    }

    private static int countZerosHelper(int[] array, int start, int stop, int count) {
        System.out.println(count);
        if (start < stop) {
            if (array[start] == 0) {
                count++;
            }
            countZerosHelper(array, start + 1, stop, count);
        }
        return count;
    }

    public static int count(int n) {
        if (n > 0) {
            return n + count(n - 1);
        } else {
            return n;
        }
    }

    public static int sum(int n) {
        int s = 0;
        if (n == 1) {
            s = 1;
        } else {
            s = n + sum(n - 1);
        }
        return s;
    }

    public static boolean qNotFollowedByU(String word) {
        String lowerCaseWord = word.toLowerCase();
        return qNotFollowedByUHelper(lowerCaseWord, 0, true);
    }

    public static boolean qNotFollowedByUHelper(String word, int i, Boolean isNotFollowed) {
        if (i >= word.length() - 1) {
            return isNotFollowed;
        } else if (word.charAt(i) == 'q') {
            String chars = word.charAt(i) + "" + word.charAt(i + 1);
            if (chars.equals("qu")) {
                return qNotFollowedByUHelper(word, i + 1, false);
            } else {
                return qNotFollowedByUHelper(word, i + 1, true);
            }
        } else {
            return qNotFollowedByUHelper(word, i + 1, isNotFollowed);
        }
    }


//        if (i <= word.length() - 2) {
//            String s = word.charAt(i) + "" + word.charAt(i+1);
//            if (s.equals("qu")) {
//                return false;
//            } else {
//                return qNotFollowedByUHelper(word, i + 1);
//            }
//        } else {
//            return true;
//        }
//}

}
