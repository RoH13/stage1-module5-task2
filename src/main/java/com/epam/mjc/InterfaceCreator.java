package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> op = (List<Integer> arg) -> {
            List<Integer> res = new ArrayList<Integer>(); 
            for (Integer x : arg) {
                if (divider.intValue() != 0)
                    res.add(x.intValue() / divider.intValue());
            }
            return res;
        };
        return op;
        // throw new UnsupportedOperationException("You should implement this method.");
    }
   /*  public static void main(String[] args) {
        System.out.println(divideBy(2).apply(List.of(2,4,6)));
    }*/
}
