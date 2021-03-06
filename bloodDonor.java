package bloodDonation;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;





public class bloodDonor extends JFrame {
    private ImageIcon icon,logo ;
    private Container container;
    private JLabel titleLabel,taglineLabel,logoLabel,headerLabel,idLabel,nameLabel,emailLabel,phoneLabel,addressLabel,ageLabel,bloodGroupLabel,enquiryLabel;
    private JTextField idTextField,nameTextField,emailTextField,phoneTextField,addressTextField,ageTextField;
    private JRadioButton yes,no;
    private JComboBox bloodGroupType;
    private JButton submitButton,clearButton,showButton;
    
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    
    private String[] bloodGroups = {"O+","O-","A+","A-","B+","B-","AB+","AB-","Not Known"}; 
    private String[] columns ={"ID","Name","Age","Blood Group","Email","Phone","Address"}; 
    private String[] rows = new String[7];
    
    
    
       
 
   
              
    
 
    
    //constructor
    bloodDonor(){
        initializeComponents();
         
    }
    
     public void initializeComponents(){
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(1300,700);
         setLocationRelativeTo(null);
         setTitle("Blood Bank Management System");
         
         icon = new ImageIcon(getClass().getResource("titleIcon.png"));
         this.setIconImage(icon.getImage());
         
         
         container = this.getContentPane();
         container.setLayout(null);
         container.setBackground(new Color(217, 199, 186));
         
         Font font = new Font("Arial",Font.BOLD,14);
         Font titleFont = new Font("Arial",Font.BOLD,26);
         Font headerFont = new Font("Arial",Font.BOLD,20);
         Font buttonFont = new Font("Arial",Font.BOLD,16);
         
         //logo
         logo = new ImageIcon(getClass().getResource("Logo.png"));
         logoLabel = new JLabel(logo);
         logoLabel.setBounds(20,5,180,110);
         container.add(logoLabel);
         
         //title
        titleLabel = new JLabel("Life Care Blood Bank");
        titleLabel.setBounds(450,30,350,40);
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(new Color(105, 35, 45));
        container.add(titleLabel);
        
         //tagline
        taglineLabel = new JLabel("Your blood can give a life to someone");
        taglineLabel.setBounds(450,60,600,40);
        taglineLabel.setFont(font);
        //taglineLabel.setForeground(new Color(105, 35, 45));
        container.add(taglineLabel);
         
         //header
        headerLabel = new JLabel("Blood Donor Registration");
        headerLabel.setBounds(10,120,250,40);
        headerLabel.setFont(headerFont);
        headerLabel.setForeground(Color.BLACK);
        container.add(headerLabel);
        
        
         //id
         //id Label
        idLabel = new JLabel("Donor ID: ");
        idLabel.setBounds(10,170,95,25);
        idLabel.setFont(font);
        idLabel.setForeground(Color.BLUE);
        container.add(idLabel);
        //id text field
        idTextField = new JTextField();
        idTextField.setBounds(90,170,50,25);
        //idTextField.setFont{font);
        container.add(idTextField);
        
        
        //donor name
        //name label
        nameLabel = new JLabel("Name ");
        nameLabel.setBounds(10,210,100,30);
        nameLabel.setFont(font);
        container.add(nameLabel);
        //name text field
        nameTextField = new JTextField();
        nameTextField.setBounds(10,235,240,25);
        //nameTextField.setFont{font);
        container.add(nameTextField);
        
         //age
        //agelabel
        ageLabel = new JLabel("Age");
        ageLabel.setBounds(305,210,100,30);
        ageLabel.setFont(font);
        container.add(ageLabel);
         //age text field
        ageTextField = new JTextField();
        ageTextField.setBounds(295,235,50,25);
        //ageTextField.setFont{font);
        container.add(ageTextField);
        
         //Blood Group label
        bloodGroupLabel = new JLabel("Blood Group");
        bloodGroupLabel.setBounds(390,210,90,30);
        bloodGroupLabel.setFont(font);
        container.add(bloodGroupLabel);
        
        bloodGroupType = new JComboBox(bloodGroups);
        bloodGroupType.setSelectedIndex(-1);
        bloodGroupType.setBounds(390,235,90,25);
        bloodGroupType.setBackground(Color.WHITE);
        bloodGroupType.setEditable(true);
        container.add(bloodGroupType);
        
  
        //email
         //email label
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(10,280,80,20);
        emailLabel.setFont(font);
        container.add(emailLabel);
        //emailtext field
        emailTextField = new JTextField();
        emailTextField.setBounds(10,300,240,25);
        //emailTextField.setFont{font);
        container.add(emailTextField);
        
        
        //phone  number
         //phone number label
        phoneLabel = new JLabel("Phone Number");
        phoneLabel.setBounds(280,280,160,20);
        phoneLabel.setFont(font);
        container.add(phoneLabel);
        //phone number text field
        phoneTextField = new JTextField();
        phoneTextField.setBounds(280,300,240,25);
        //phoneTextField.setFont{font);
        container.add(phoneTextField);
        
        //address
         //address label
        addressLabel = new JLabel("Address");
        addressLabel.setBounds(10,345,160,20);
        addressLabel.setFont(font);
        container.add(addressLabel);
        //address text field
        addressTextField = new JTextField();
        addressTextField.setBounds(10,365,510,40);
        //addressTextField.setFont{font);
        container.add(addressTextField);
        
        //enquirylabel
        enquiryLabel = new JLabel("Have you ever donated blood before?");
        enquiryLabel.setBounds(10,420,500,20);
        enquiryLabel.setFont(font);
        container.add(enquiryLabel);
        
        yes= new JRadioButton("Yes");
        yes.setBounds(70,450,60,30);
        yes.setFont(font);
        yes.setBackground(Color.LIGHT_GRAY);
        container.add(yes);
        
        no= new JRadioButton("No");
        no.setBounds(150,450,60,30);
        no.setFont(font);
        no.setBackground(Color.LIGHT_GRAY);
        container.add(no);
        
        //submit button
        submitButton = new JButton("Submit");
        submitButton.setBounds(140,520,90,30);
        submitButton.setFont(buttonFont);
        submitButton.setBackground(new Color(47, 27, 59));
        submitButton.setForeground(Color.WHITE);
        container.add(submitButton);
        
        
        SubmitButton handler = new SubmitButton();
        submitButton.addActionListener(handler);
        
        
        //clear button
        clearButton = new JButton("clear");
        clearButton.setBounds(260,520,90,30);
        clearButton.setFont(buttonFont);
        clearButton.setBackground(new Color(105, 35, 45));
        clearButton.setForeground(Color.WHITE);
        container.add(clearButton);
        
           
        ClearButton clear = new ClearButton();
        clearButton.addActionListener(clear);
        
         //show button
        showButton = new JButton("Show Data");
        showButton.setBounds(140,570,210,30);
        showButton.setFont(buttonFont);
        showButton.setBackground(new Color(29, 74, 70));
        showButton.setForeground(Color.WHITE);
        container.add(showButton);
     
        
        //table
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        table.setBackground(Color.WHITE);
        table.setRowHeight(70);
        
        scroll = new JScrollPane(scroll);
        scroll.setBounds(540,150,730,450);
        container.add(scroll);
        
        
        
//        String id = idTextField.getText();
//        String name = nameTextField.getText();
//        String age = ageTextField.getText();
//        String bloodGroup = bloodGroupType.getSelectedItem().toString();
//        String email = emailTextField.getText();
//        String phone = phoneTextField.getText();
//        String address = addressTextField.getText();
        
        
//        try {
//                      if(id.equals("") || name.equals("") || age.equals("") || bloodGroup.equals("") || email.equals("") || phone.equals("") || address.equals("")) {
//                              JOptionPane.showMessageDialog(null, "All fields are required","warning",JOptionPane.WARNING_MESSAGE);
//                      }
//                        
//                        
//                      else {
//                              FileWriter writer = new FileWriter("bloodDonorInfo.txt", true);
//                              writer.write(id+"//"+name+"//"+age+"//"+bloodGroup+"//"+email+"//"+phone+"//"+address);
//                              writer.write(System.getProperty("line.separator"));
//                              writer.close();
//                              JOptionPane.showMessageDialog(null, "Successfuly added");
//
//                                
//                                
//                              DefaultTableModel model = (DefaultTableModel)table.getModel();
//                      }
//              }
//              catch(Exception e) {
//                        
//                      JOptionPane.showMessageDialog(null, "Error");
//                        
//              }

         
     }
     
     
     
         public class SubmitButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                String id = idTextField.getText();
                String name = nameTextField.getText();
                String age = ageTextField.getText();
                String bloodGroup = bloodGroupType.getSelectedItem().toString();
                String email = emailTextField.getText();
                String phone = phoneTextField.getText();
                String address = addressTextField.getText();
                
                
                try {
                    
                    FileWriter writer = new FileWriter("bloodDonorInfo.txt", true);
                                writer.write(id+"//"+name+"//"+age+"//"+bloodGroup+"//"+email+"//"+phone+"//"+address);
                                writer.write(System.getProperty("line.separator"));
                                writer.close();
                                JOptionPane.showMessageDialog(null, "Successfuly added");
                         
                                
                                DefaultTableModel dt = (DefaultTableModel)table.getModel();
                }
                
                catch(Exception e) {
                    System.err.println(e);
                }
            }
        }
     
     
     
     public class ClearButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                idTextField.setText(null);
                nameTextField.setText(null);
                ageTextField.setText(null);
                bloodGroupType.setSelectedItem(null);
                emailTextField.setText(null);
                phoneTextField.setText(null);
                addressTextField.setText(null);
                
            }
        }
     
     
        
    
            
     public static void main(String[] args) {
         bloodDonor frame = new bloodDonor();
         frame.setVisible(true);
        
        
        
    }

   

    
}
