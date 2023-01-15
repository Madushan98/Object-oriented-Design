package Calculator;

import java.util.List;

public interface Calc {
    double execute();
}
class SumCalc implements Calc {

    protected List<Double> args;

    public SumCalc(List<Double> args) {
        this.args = args;
    }

    @Override
    public double execute() {
        double result = 0;
        for (double arg : args) {
            result += arg;
        }
        return result;
    }
}

class AverageCalc extends SumCalc {
    @Override
    public double execute() {
        double sum = super.execute();
        return sum / args.size();
    }


    public AverageCalc(List<Double> args) {
        super(args);
    }
}

class MinCalc implements Calc {

    protected List<Double> args;

    public MinCalc(List<Double> args) {
        this.args = args;
    }

    @Override
    public double execute() {
        double min = args.get(0);
        for (double arg : args) {
            if (arg < min) {
                min = arg;
            }
        }
        return min;
    }
}

class MaxCalc implements Calc {

    protected List<Double> args;

    public MaxCalc(List<Double> args) {
        this.args = args;
    }

    @Override
    public double execute() {
        double max = args.get(0);
        for (double arg : args) {
            if (arg > max) {
                max = arg;
            }
        }
        return max;
    }
}

