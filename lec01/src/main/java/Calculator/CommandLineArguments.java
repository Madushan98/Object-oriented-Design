package Calculator;


import java.util.ArrayList;
import java.util.List;

class CommandLineArguments implements Arguments {

    private String[] args;

    CommandLineArguments(String[] args) {
        this.args = args;
    }

    @Override
    public String getOperator() {
        return args[0];
    }

    @Override
    public List<Double> getOperands() {

        List<Double> operands = new ArrayList<Double>();

        for (int i = 1; i < args.length; i++) {
            operands.add(Double.parseDouble(args[i]));
        }
        return operands;
    }

}
