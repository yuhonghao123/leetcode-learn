package com.yhh.leetcode;

public interface Fibnacci {

    long fib(int n);

    public static void main(String[] args) {
        int loop = 100_000;

        {
            long t1 = System.currentTimeMillis();
            Fibnacci fib = new xx();
            long x = 0;
            for (int i = 0; i < loop; i++) {
                x += fib.fib(i);
            }
            long t2 = System.currentTimeMillis();
            System.out.println("x =" + x + "  time:" + (t2 - t1));
        }
        {
            long t1 = System.currentTimeMillis();
            Fibnacci fib = new LoopFibnacci();
            long x = 0;
            for (int i = 0; i < loop; i++) {
                x += fib.fib(i);
            }
            long t2 = System.currentTimeMillis();
            System.out.println("x =" + x + "  time:" + (t2 - t1));
        }
    }

    class RecursiveFibnacci implements Fibnacci {

        @Override
        public long fib(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("n should > 0");
            }

            if (n==0){
                return 0;
            }

            if (n==1){
                return 1;
            }

            return fib(n-1)+fib(n-2);

        }
    }

    class xx implements Fibnacci {
        public long fib(int n) {
            return (long) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
        }
    }

    class LoopFibnacci implements Fibnacci {

        @Override
        public long fib(int n) {

            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return  1;
            } else {
                long n_1 = 1;
                long n_2 = 0;
                long n_0 = 0;
                for (int i = 1; i < n; i ++) {
                    n_0 = n_1 + n_2;
                    n_2 = n_1;
                    n_1 = n_0;
                }

                return n_0;
            }


        }
    }

}
