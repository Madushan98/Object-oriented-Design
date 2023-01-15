package Calculator;

class CommandLineUI implements UI {

    private String[] args;

    CommandLineUI(String[] args) {
        this.args = args;
    }

    public void show() {
        Arguments arguments = new CommandLineArguments(args);
        Calc operation = CalcFactory.getCalc(arguments.getOperator(), arguments.getOperands());
        Double result = operation.execute();
        System.out.println(arguments.getOperator() + " = " + result);
    }

}