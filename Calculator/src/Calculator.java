import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame implements ActionListener{

    private String[] functionsLabels = {
            "(", ")", "mc", "m+", "m-", "mr", "C", "+/-", "%", "÷",
            "2ⁿᵈ", "x²", "x³", "xʸ", "eˣ", "10ˣ", "7", "8", "9", "x",
            "1/x", "²√x", "³√x", "ʸ√x", "ln", "log₁₀", "4", "5", "6", "-",
            "x!", "sin", "cos", "tan", "e", "EE", "1", "2", "3", "+",
            "Rad", "sinh", "cosh", "tanh", "π", "Rand", "0", ".","Del", "=",
    };



    private int operator = 0;
    private JPanel panel = new JPanel(new BorderLayout(5, 5));
    private JPanel functionsPanel = new JPanel(new GridLayout(5, 10, 2, 2));
    private JButton[] functions = new JButton[50];
    private JTextArea textfield = new JTextArea(5, 40);
    private double Num1 = 0, Num2 = 0;


    public Calculator() {
        init();
    }

    private void init() {
        textfield.setFont(new Font("Times New Roman", Font.BOLD, 30));
        setTitle("Calculator");
        textfield.setBackground(Color.BLACK);
        panel.setBackground(Color.BLACK);
        functionsPanel.setBackground(Color.BLACK);
        textfield.setForeground(Color.WHITE);

        for (int i = 0; i < functions.length; i++) {
            functions[i] = new JButton(functionsLabels[i]);


            functions[i].setOpaque(true);
            functions[i].setBorder(new LineBorder(Color.BLUE));
            functions[i].setBorderPainted(false);
            functions[i].setBackground(Color.darkGray);
            functions[i].setForeground(Color.WHITE);
            functions[i].addActionListener(this);
            functionsPanel.add(functions[i]);
        }

        int[] specificButtonIndices = {9, 19, 29, 39, 49};


        for (int i : specificButtonIndices) {
            functions[i].setBackground(Color.ORANGE);
        }

        int[] numberButtons = {16,17,18,26,27,28,36,37,38,46,47,48};


        for (int i : numberButtons) {
            functions[i].setBackground(Color.lightGray);
        }




        panel.add(functionsPanel, BorderLayout.CENTER);
        panel.add(textfield, BorderLayout.NORTH);
        textfield.setEditable(false);
        add(panel);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String cmd = e.getActionCommand().toString();


            switch (cmd) {
                case ".":
                    if (!textfield.getText().contains(".")) {
                        textfield.setText(textfield.getText() + ".");
                    }
                    break;
                case "0":
                    textfield.setText(textfield.getText() + "0");
                    break;
                case "1":
                    textfield.setText(textfield.getText() + "1");
                    break;
                case "2":
                    textfield.setText(textfield.getText() + "2");
                    break;
                case "3":
                    textfield.setText(textfield.getText() + "3");
                    break;
                case "4":
                    textfield.setText(textfield.getText() + "4");
                    break;
                case "5":
                    textfield.setText(textfield.getText() + "5");
                    break;
                case "6":
                    textfield.setText(textfield.getText() + "6");
                    break;
                case "7":
                    textfield.setText(textfield.getText() + "7");
                    break;
                case "8":
                    textfield.setText(textfield.getText() + "8");
                    break;
                case "9":
                    textfield.setText(textfield.getText() + "9");
                    break;
                case "(":
                    textfield.setText(textfield.getText() + "(");
                    break;
                case ")":
                    textfield.setText(textfield.getText() + ")");
                    break;

                case "π":
                    textfield.setText(textfield.getText() + Math.PI);
                    break;
                case "e":
                    textfield.setText(textfield.getText() + Math.exp(1));
                    break;
                case "Rand":
                    textfield.setText(textfield.getText() + Math.random());
                    break;

                case "+":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 1;
                        textfield.setText("");
                    }
                    break;
                case "-":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 2;
                        textfield.setText("");
                    }
                    break;
                case "x":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 3;
                        textfield.setText("");
                    }
                    break;

                case "÷":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 4;
                        textfield.setText("");
                    }
                    break;
                case "xʸ":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 5;
                        textfield.setText("");
                    }
                    break;
                case "ʸ√x":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 6;
                        textfield.setText("");
                    }
                    break;

                case "%":
                    if (!textfield.getText().isEmpty()) {
                        Num1 = Double.parseDouble(textfield.getText().toString());
                        operator = 7;
                        textfield.setText("");
                    }
                    break;
                case "+/-":
                    double neg = Double.parseDouble(textfield.getText().toString());
                    neg *= -1;
                    textfield.setText(String.valueOf(neg));
                    break;
                case "x!":
                    double currentInput = Double.parseDouble(textfield.getText().toString());
                    int fact = 1;
                    for(int i=1;i<=currentInput;i++){
                        fact = fact*i;
                    }
                    textfield.setText(String.valueOf(fact));
                    break;
                case "C":
                    textfield.setText("");
                    break;

                case "Del":
                    if(!textfield.getText().isEmpty()) {

                        String string = textfield.getText();

                        textfield.setText("");

                        for(int i=0;i<string.length()-1;i++) {

                            textfield.setText(textfield.getText()+string.charAt(i));

                        }
                    }
                    break;



                case "sin", "cos", "tan", "²√x", "x²", "x³", "³√x", "10ˣ", "1/x",
                        "log₁₀", "ln", "eˣ", "sinh", "cosh", "tanh":
                    specialFunctions(cmd);
                    break;

                default:
            }

            if (cmd.equalsIgnoreCase("=")) {

                if (!textfield.getText().isEmpty()) {

                    Num2 = Double.parseDouble(textfield.getText().toString());

                    switch (operator) {
                        case 1: // addition
                            textfield.setText(String.valueOf(Num1 + Num2));
                            break;
                        case 2: // subtraction
                            textfield.setText(String.valueOf(Num1 - Num2));
                            break;
                        case 3: // multiplication
                            textfield.setText(String.valueOf(Num1 * Num2));
                            break;
                        case 4: // division
                            if (Num2 != 0){
                                textfield.setText(String.valueOf(Num1 / Num2));
                            }else {
                                throw new ArithmeticException("Cannot divide by zero");
                            }
                            break;
                        case 5: // xʸ
                            textfield.setText(String.valueOf(Math.pow(Num1, Num2)));
                            break;
                        case 6: // ʸ√x
                            textfield.setText(String.valueOf(Math.pow(Num1, (1 / Num2))));
                            break;

                        case 7: // Modulo
                            textfield.setText(String.valueOf(Num1 % Num2));
                            break;
                        default:
                    }
                }
            }
        }catch (NumberFormatException e1){
            textfield.setText("Error: Invalid input");
        }catch (ArithmeticException e2){
            textfield.setText("Error: " + e2.getMessage());
        }
    }

    private void specialFunctions(String operation) {
        try {
            if (!textfield.getText().isEmpty()) {
                double currentInput = Double.parseDouble(textfield.getText().toString());
                double result = 0;
                double radian = (currentInput * (Math.PI / 180));

                switch (operation) {
                    case "sin":
                        result = Math.sin(radian);
                        break;
                    case "cos":
                        result = Math.cos(radian);
                        break;
                    case "tan":
                        result = Math.tan(radian);
                        break;
                    case "x²":
                        result = Math.pow(currentInput, 2);
                        break;
                    case "²√x":
                        result = Math.sqrt(currentInput);
                        break;
                    case "x³":
                        result = Math.pow(currentInput, 3);
                        break;
                    case "³√x":
                        result = Math.cbrt(currentInput);
                        break;
                    case "10ˣ":
                        result = Math.pow(10, currentInput);
                        break;
                    case "eˣ":
                        result = Math.exp(currentInput);
                        break;
                    case "1/x":
                        if (currentInput != 0){
                            result = 1 / currentInput;
                        }else {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        break;
                    case "log₁₀":
                        result = Math.log10(currentInput);
                        break;
                    case "ln":
                        result = Math.log(currentInput);
                        break;
                    case "sinh":
                        result = Math.sinh(currentInput);
                        break;
                    case "cosh":
                        result = Math.cosh(currentInput);
                        break;
                    case "tanh":
                        result = Math.tanh(currentInput);
                        break;

                }
                textfield.setText(String.valueOf(result));
            }
        }catch (NumberFormatException e1){
            textfield.setText("Error: Invalid input");
        }catch (ArithmeticException e2){
            textfield.setText("Error:" + e2.getMessage());
        }
    }

}