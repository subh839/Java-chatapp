import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


public class MainFrame extends JFrame {

    final private Font mainFont = new Font("seoge print", Font.BOLD,18);
    JTextField tfFirstName,tfLastName;
    JLabel lbWelcome;
    public void initialize(){


        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

         tfFirstName=new JTextField();
         tfFirstName.setFont(mainFont);

        
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);


        
        tfLastName=new JTextField();
        tfLastName.setFont(mainFont);

       

        
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(lbFirstName);
        formPanel.add(lbFirstName);
        formPanel.add(lbLastName);
        formPanel.add(lbLastName);



        lbWelcome= new JLabel();
        lbWelcome.setFont(mainFont);

        JButton btnOK = new JButton();
        btnOK.setFont(mainFont);
          
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            String firstName= tfFirstName.getText();
            String lastName = tfLastName.getText();
            lbWelcome.setText("HII" + firstName +" "+ lastName);
                
            }
            
        });


        JButton btnClear = new JButton("clear");
        btnClear.setFont(mainFont);
          
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            tfFirstName.setText("");
            tfLastName.setText("");
            lbWelcome.setText("");
                
            }
            
        });
        

        JPanel buttonsPanel= new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));


        JPanel mainPanel= new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground((new Color (128,128,255)));
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
        mainPanel.add(buttonsPanel,BorderLayout.SOUTH);

        add(mainPanel);
        setTitle("Hello!");
        setSize(400,500);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame= new MainFrame();
        myFrame.initialize();
        
    }


}


