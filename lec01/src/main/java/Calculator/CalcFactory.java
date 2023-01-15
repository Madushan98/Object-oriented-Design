package Calculator;

import java.util.List;

public class CalcFactory {
    public static Calc getCalc(String operation, List<Double> args) {
        switch (operation) {
            case "Sum":
                return new SumCalc(args);
            case "Average":
                return new AverageCalc(args);
            case "Min":
                return new MinCalc(args);
            case "Max":
                return new MaxCalc(args);
            default:
                return new SumCalc(args);
        }
    }

}
