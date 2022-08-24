package junit;

import java.util.stream.DoubleStream;

public class C01_Calculator {

    static double add(double... numbers){
        return DoubleStream.of(numbers).sum();
    }

    static double multiplex(double... numbers){
        return DoubleStream.of(numbers).reduce(1,(a,b)-> a*b);
    }



}
