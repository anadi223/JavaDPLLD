package lambdas;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//public static void q4(){}
public class Java8InterviewQuestions {

    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //QQ();
        //q4();
        //q5();
        //q6();
        //q7();
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
    }

    public static void q1(){
        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(i -> i%2 == 0).forEach(System.out::println);
    }
    public static void q2(){
        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
    }
    public static void q3(){
        //How to find distinct elements in a given integers list in java using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().forEach(System.out::println);
    }

    public static void QQ(){
        //How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter((e ->e.getValue()>1)).map(Map.Entry::getKey).forEach(System.out::println);
    }
    public static void q4(){
        //Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);
    }
    public static void q5(){
        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().count());
    }
    public static void q6(){
        //Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    public static void q7(){
        HashSet<Integer> seen = new HashSet<>();
        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        List<Integer> myList = Arrays.asList(10,15);
        System.out.println(myList.stream().anyMatch(num ->
        {
            if(seen.contains(num))
        {
            return true;
        }else{
            seen.add(num);
            return false;
        }}));
    }
}
