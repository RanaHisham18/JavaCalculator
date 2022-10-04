import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalc {
    private char math_operator;
    private JPanel JavaCalc;
    private JTextField textField1;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnDecimal;
    private JButton btnFive;
    private JButton btntwo;
    private JButton btnequals;
    private JButton btnminus;
    private JButton btnEight;
    private JButton btnmultiply;
    private JButton btnclear;
    private JButton btndivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnzero;
    private JButton btnplus;
    private  double total1 = 0.0;
    private double total2 = 0.0;


    private void  getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public JavaCalc() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = textField1.getText() + btnOne.getText( );
                textField1.setText(btnOneText);
            }
        });
        btntwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = textField1.getText() + btntwo.getText( );
                textField1.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = textField1.getText() + btnThree.getText( );
                textField1.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = textField1.getText() + btnFour.getText( );
                textField1.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = textField1.getText() + btnFive.getText( );
                textField1.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = textField1.getText() + btnSix.getText( );
                textField1.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = textField1.getText() + btnSeven.getText( );
                textField1.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = textField1.getText() + btnEight.getText( );
                textField1.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = textField1.getText() + btnNine.getText( );
                textField1.setText(btnNineText);
            }
        });
        btnzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnzeroText = textField1.getText() + btnzero.getText( );
                textField1.setText(btnzeroText);
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btndecText = textField1.getText()+ btnDecimal.getText( ) ;
                textField1.setText(btndecText);
            }
        });
        btnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnplus.getText();
                getOperator(button_text);
            }
        });
        btnequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch ( math_operator ) {
                    case '+': total2 = total1 + Double.parseDouble(textField1.getText( ) );
                        break;
                    case '-': total2 = total1 -Double.parseDouble(textField1.getText( ) );
                        break;
                    case '/': total2 = total1 /Double.parseDouble(textField1.getText( ) );
                        break;
                    case '*': total2 = total1 * Double.parseDouble(textField1.getText( ) );
                        break;
                }

                textField1.setText( Double.toString(total2) );
                total1 = 0;
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                textField1.setText("");
            }
        });
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnminus.getText();
                getOperator(button_text);
            }
        });
        btndivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btndivide.getText();
                getOperator(button_text);
            }
        });
        btnmultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnmultiply.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalc");
        frame.setContentPane(new JavaCalc().JavaCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

  /*  private void createUIComponents() {
        // TODO: place custom component creation code here
    }*/
}
