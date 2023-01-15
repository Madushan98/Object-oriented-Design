package Calculator;

import javax.swing.*;

class GUI implements UI {

    public void show() {
        System.out.println("GUI IS LOADING....");
        JFrame frame = new JFrame("Simple Swing Application");

        // Set the size of the frame
        frame.setSize(300, 150);

        // Terminate the program when the user closes the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add the button to the frame
        frame.add(button);

        // Display the frame
        frame.setVisible(true);
    }
}