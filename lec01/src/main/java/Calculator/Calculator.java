package Calculator;

public class Calculator {

    public static void main(String[] args) {



        UIFactory uiFactory = new UIFactory();

        UI ui = uiFactory.getUI(args);
        ui.show();

    }

}

