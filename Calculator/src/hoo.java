import javax.swing.*;

import javax.swing.border.LineBorder;

import java.awt.*;

import java.awt.event.*;


public class hoo implements ActionListener{



    JFrame frame;

    JTextField textfield;

    JButton[] numberButtons = new JButton[10];

    JButton[] functionButtons = new JButton[24];

    JButton addButton,subButton,mulButton,divButton,log10Button,powButton,piButton,eButton;

    JButton decButton, equButton, delButton, clrButton, negButton,nthRootButton;

    JButton sinButton, cosButton, tanButton,sqrtButton,cbrtButton,factorialButton,modButton,lnButton,cubeButton,squareButton;


    JPanel panel;



    Font myFont = new Font("Amasis MT Pro Light",Font.BOLD,30);



    double num1=0,num2=0,result=0;

    char operator;


    hoo(){



        frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(570, 600);

        frame.setLayout(null);

        frame.getContentPane().setBackground(Color.BLACK);



        textfield = new JTextField();

        textfield.setBounds(50, 25, 400, 50);

        textfield.setFont(myFont);

        textfield.setEditable(false);

        textfield.setBackground(Color.DARK_GRAY);

        textfield.setForeground(Color.WHITE);

        textfield.setBorder(new LineBorder(Color.BLACK));





        addButton = new JButton("+");

        subButton = new JButton("-");

        mulButton = new JButton("X");

        divButton = new JButton("/");

        decButton = new JButton(".");

        equButton = new JButton("=");

        delButton = new JButton("Del");

        clrButton = new JButton("Clr");

        negButton = new JButton("(-)");

        powButton =new JButton("^");

        log10Button =new JButton("log");

        piButton =new JButton("\u03C0");

        eButton =new JButton("e");

        sinButton = new JButton("sin");

        cosButton = new JButton("cos");

        tanButton = new JButton("tan");

        sqrtButton = new JButton("\u221A");

        cbrtButton = new JButton("\u221B");

        lnButton = new JButton("ln");

        factorialButton = new JButton("!");

        squareButton = new JButton("x^2");

        cubeButton = new JButton("x^3");

        nthRootButton = new JButton("√n");

        modButton = new JButton("%");



        functionButtons[0] = addButton;

        functionButtons[1] = subButton;

        functionButtons[2] = mulButton;

        functionButtons[3] = divButton;

        functionButtons[4] = decButton;

        functionButtons[5] = equButton;

        functionButtons[6] = delButton;

        functionButtons[7] = clrButton;

        functionButtons[8] = negButton;

        functionButtons[9]=log10Button;

        functionButtons[10]=powButton;

        functionButtons[11]=piButton;

        functionButtons[12]=eButton;

        functionButtons[13] = sinButton;

        functionButtons[14] = cosButton;

        functionButtons[15] = tanButton;

        functionButtons[16] = sqrtButton;

        functionButtons[17] = cbrtButton;

        functionButtons[18] = factorialButton;

        functionButtons[19] = lnButton;

        functionButtons[20] = modButton;

        functionButtons[21] = cubeButton;

        functionButtons[22] = squareButton;

        functionButtons[23] = nthRootButton;


        for(int i =0;i<24;i++) {

            functionButtons[i].addActionListener(this);

            functionButtons[i].setFont(myFont);

            functionButtons[i].setBackground(Color.DARK_GRAY);

            functionButtons[i].setForeground(Color.WHITE);

            functionButtons[i].setBorder(new LineBorder(Color.BLACK));

            functionButtons[i].setFocusable(false);

        }
        functionButtons[0].setBackground(Color.ORANGE);

        functionButtons[1].setBackground(Color.ORANGE);

        functionButtons[2].setBackground(Color.ORANGE);

        functionButtons[3].setBackground(Color.ORANGE);



        for(int i =0;i<10;i++) {


            numberButtons[i] = new JButton(String.valueOf(i));

            numberButtons[i].addActionListener(this);

            numberButtons[i].setBackground(Color.GRAY);

            numberButtons[i].setForeground(Color.WHITE);

            numberButtons[i].setBorder(new LineBorder(Color.BLACK));


            numberButtons[i].setFont(myFont);

            numberButtons[i].setFocusable(false);

        }



        negButton.setBounds(50,490,100,50);

        delButton.setBounds(150,490,100,50);

        clrButton.setBounds(250,490,100,50);




        panel = new JPanel();

        panel.setBounds(50, 100, 400, 300);

        panel.setLayout(new GridLayout(5,10,1,1));

        panel.setBackground(Color.BLACK);



        panel.add(numberButtons[1]);

        panel.add(numberButtons[2]);

        panel.add(numberButtons[3]);

        panel.add(numberButtons[4]);

        panel.add(addButton);

        panel.add(numberButtons[5]);

        panel.add(numberButtons[6]);

        panel.add(numberButtons[7]);

        panel.add(numberButtons[8]);

        panel.add(subButton);

        panel.add(numberButtons[9]);

        panel.add(mulButton);

        panel.add(decButton);

        panel.add(numberButtons[0]);

        panel.add(equButton);

        panel.add(divButton);

        panel.add(log10Button);

        panel.add(powButton);

        panel.add(piButton);

        panel.add(eButton);

        panel.add(sinButton);

        panel.add(cosButton);

        panel.add(tanButton);

        panel.add(sqrtButton);

        panel.add(cbrtButton);

        panel.add(cubeButton);

        panel.add(squareButton);

        panel.add(modButton);

        panel.add(lnButton);

        panel.add(factorialButton);



        frame.add(panel);

        frame.add(negButton);

        frame.add(delButton);

        frame.add(clrButton);

        frame.add(textfield);

        frame.setVisible(true);

    }



    public static void main(String[] args) {



        Calculator calc = new Calculator();

    }



    @Override

    public void actionPerformed(ActionEvent e) {



        for(int i=0;i<10;i++) {

            if(e.getSource() == numberButtons[i]) {

                textfield.setText(textfield.getText().concat(String.valueOf(i)));

            }

        }

        if(e.getSource()==decButton) {

            textfield.setText(textfield.getText().concat("."));

        }



        if(e.getSource()==addButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator ='+';

            textfield.setText("");

        }

        if(e.getSource()==subButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator ='-';

            textfield.setText("");

        }
        if(e.getSource()==powButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator ='^';

            textfield.setText("");

        }

        if(e.getSource()==mulButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator ='X';

            textfield.setText("");

        }

        if(e.getSource()==divButton) {

            num1 = Double.parseDouble(textfield.getText());

            operator ='/';

            textfield.setText("");

        }

        if(e.getSource()==equButton) {

            num2=Double.parseDouble(textfield.getText());



            switch(operator) {

                case'+':

                    result=num1+num2;

                    break;

                case'-':

                    result=num1-num2;

                    break;

                case'X':

                    result=num1*num2;

                    break;

                case'/':

                    result=num1/num2;

                    break;

                case'^':

                    result = Math.pow(num1, num2);

                    break;


            }

            textfield.setText(String.valueOf(result));

            num1=result;

        }

        if(e.getSource()==clrButton) {

            textfield.setText("");

        }
        if (e.getSource() == piButton) {
            textfield.setText(String.valueOf(Math.PI));
        }

        if (e.getSource() == eButton) {
            textfield.setText(String.valueOf(Math.E));
        }
        if (e.getSource() == sinButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.sin(Math.toRadians(value));
            textfield.setText(String.valueOf(Math.toDegrees(result)) );
        }
        if (e.getSource() == sqrtButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.sqrt(value);
            textfield.setText(String.valueOf(result));
        }
        if (e.getSource() == squareButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.pow(value, 3);
            textfield.setText(String.valueOf(result));
        }

        if (e.getSource() == cubeButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.pow(value, 3);
            textfield.setText(String.valueOf(result));
        }

        if (e.getSource() == lnButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.log(value);
            textfield.setText(String.valueOf(result));
        }

        if (e.getSource() == nthRootButton) {
            double value = Double.parseDouble(textfield.getText());

            double result = Math.pow(value, 1.0 / value);
            textfield.setText(String.valueOf(result));
        }

        if (e.getSource() == modButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '%';
            textfield.setText("");
        }


        if (e.getSource() == cbrtButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.cbrt(value);
            textfield.setText(String.valueOf(result));
        }

        if (e.getSource() == cosButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.cos(Math.toRadians(value));
            textfield.setText(String.valueOf(Math.toDegrees(result)) );
        }

        if (e.getSource() == tanButton) {
            double value = Double.parseDouble(textfield.getText());
            double result = Math.tan(Math.toRadians(value));
            textfield.setText(String.valueOf(Math.toDegrees(result)) );
        }


        if(e.getSource()==delButton) {

            String string = textfield.getText();

            textfield.setText("");

            for(int i=0;i<string.length()-1;i++) {

                textfield.setText(textfield.getText()+string.charAt(i));

            }

        }

        if(e.getSource()==negButton) {

            double temp = Double.parseDouble(textfield.getText());

            temp*=-1;

            textfield.setText(String.valueOf(temp));

        }

    }

}

