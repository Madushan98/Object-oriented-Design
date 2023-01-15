package Calculator;

class UIFactory {

    public UI getUI(String[] args) {

        if (args.length == 0) {
            return new GUI();
        } else {
            return new CommandLineUI(args);
        }
    }
}