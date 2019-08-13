package com.java8.test.test1;

/**
 * @description:
 * @author: zhiyun.yu
 * @create: 2019-06-26 14:43
 **/
public class Test {
    public static void main(String[] args) {
        LazyList<Integer> numbers = from(2);
        System.out.println(numbers);

        int two = numbers.head();
        int three = numbers.tail().head();
        int four = numbers.tail().tail().head();
        System.out.println(two + " " + three + " " + four);

        int five = primes(numbers).tail().tail().head();
        System.out.println(two + " " + three + " " + five);
    }

    private static LazyList<Integer> from(int n) {
        return new LazyList<>(n, () -> from(n + 1));
    }

    private static MyList<Integer> primes(MyList<Integer> numbers) {
        return new LazyList<>(
                numbers.head(), () -> primes(numbers.tail().filter(n -> n % numbers.head() != 0))
        );
    }

}
