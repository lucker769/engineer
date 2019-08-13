package com.java8.test;


import org.apache.commons.lang.StringUtils;

import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.LongPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

/**
 * Hello world!
 *
 */
public class Test {
    final Map<String,Integer> numberOfNodes = new HashMap<>();
    public static void main( String[] args ){
        //Integer[] a = {1, 4, 9};
        ////List<Integer> a = Arrays.asList({1, 4, 9});
        //List<List<Integer>> subsets = subsets(Arrays.asList(a));
        //System.out.println(subsets);
        //numberOfNodes.computeIfAbsent("aaa", () -> 2);

        //String a = null;
        //String[] split = a.split(",");
        //List<String> list = Arrays.asList(split);
        //list.add("123");
        //System.out.println(list);

        //System.out.println(StringUtils.INDEX_NOT_FOUND);
        //System.out.println(StringUtils.isNumeric("abc"));

        //List<Long> names = new ArrayList<>();
        //names.add(1L);
        //names.add(2L);
        //names.add(3L);
        //names.add(null);
        //System.out.println(String.join("-", names.stream().filter(Objects::nonNull).map(String::valueOf).collect(toList())));

        StringBuffer sb = new StringBuffer();
        sb.append("helloworld");
        System.out.println(sb.toString());
        sb.setLength(0);
        sb.append("java");
        System.out.println(sb.toString());

    }

    public static int getAsc(String st) {
        //byte[] gc = st.getBytes();
        //return (int) gc[0];
        //return st.getBytes()[0];

        return Integer.parseInt(st);
    }

    private static List<List<Integer>> subsets(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1,list.size());
        List<List<Integer>> subans = subsets(rest);
        List<List<Integer>> subans2 = insertAll(first, subans);
        return concat(subans, subans2);
    }

    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> lists) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> list : lists) {
            List<Integer> copyList = new ArrayList<>();
            copyList.add(first);
            copyList.addAll(list);
            result.add(copyList);
        }
        return result;
    }

    private static List<List<Integer>> concat(List<List<Integer>> a, List<List<Integer>> b) {
        List<List<Integer>> r = new ArrayList<>(a);
        r.addAll(b);
        return r;
    }

    private static <T> Optional<T> resolve(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        } catch (NullPointerException e) {
            return Optional.empty();
        }
    }

    private static List<Trader> sort(List<Trader> traders){
        return traders.stream().sorted(comparing(Trader::getAge)).collect(toList());
    }

    private static String formatNumber(long number, int digits) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumIntegerDigits(digits);
        nf.setMinimumIntegerDigits(digits);
        nf.setGroupingUsed(false);
        return nf.format(number);
    }

    private static Supplier<String> getName(){
        return () -> null;
    }


    private static Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            futurePrice.complete(100d);
        }).start();
        return futurePrice;
    }

    private static Double isBlank(){
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Double> future1 = executor.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 5000d;
        });
        Future<Double> future2 = executor.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1000d;
        });
        System.out.println("doSomethingElse()");
        try {
            Double result1 = future1.get(4, TimeUnit.SECONDS);
            Double result2 = future2.get(4, TimeUnit.SECONDS);
            return result1 + result2;
        } catch (ExecutionException ee) {
            ee.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (TimeoutException te) {
            te.printStackTrace();
        }
        return 0d;
    }

    private static LongPredicate pricePredicate(){
        return p -> p < 30L || p > 9999900L;
    }

    private static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(
                        partitioningBy(candidate -> isPrime(candidate)));
    }

    private static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        System.out.println(candidateRoot);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }


}
