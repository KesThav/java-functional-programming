package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args){
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(4);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer,Integer> addBy1AndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndMultiplyBy10.apply(32));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(1,32));
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = (number1, number2) -> (number1 + 1) * number2;

    static int increment(int number){
        return number + 1;
    }
}
