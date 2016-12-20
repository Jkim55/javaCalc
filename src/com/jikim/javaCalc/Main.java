package com.jikim.javaCalc;

public class Main {
    public static void main(String[] args) {
        double[] nums1 = {40, 22, 2, 8};
        double[] nums2= {2, 45, 15, 4};
        char[] operationSyms = {'+', '-', '*', '/'};
        double[] results = new double[operationSyms.length];

        for (int i = 0; i <operationSyms.length; i++ ){
            switch (operationSyms[i]){
                case '+':
                    results[i] = nums1[i] + nums2[i];
                    break;
                case '-':
                    results[i] = nums1[i] - nums2[i];
                    break;
                case '*':
                    results[i] = nums1[i] * nums2[i];
                    break;
                case '/':
                    results[i] = nums1[i] != 0.0d ? nums1[i]/nums2[i] : 0.0d;
                    break;
                default:
                    System.out.println("Error in calculating.");
                    results[i] = 0.0d;
                    break;
            }
        }
        for (double theResult: results) {
            System.out.println(theResult);
        }
    }
}
