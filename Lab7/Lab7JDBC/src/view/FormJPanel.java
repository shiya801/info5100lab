/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;

/**
 *
 * @author sheha
 */
public class FormJPanel extends javax.swing.JPanel {

   ImageIcon profilePicture;
   JPanel bottomjPanel;

    /**
     * Creates new form FormJPanel
     */
    public FormJPanel(JPanel bottomjPanel){
        this.bottomjPanel = bottomjPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titlejLabel = new javax.swing.JLabel();
        jLabelFirstname = new javax.swing.JLabel();
        jTextFieldFirstname = new javax.swing.JTextField();
        jLabelLastname = new javax.swing.JLabel();
        jTextFieldLastname = new javax.swing.JTextField();
        jLabelgender = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelPhonenumber = new javax.swing.JLabel();
        jTextFieldPhonenumber = new javax.swing.JTextField();
        jLabelEmailID = new javax.swing.JLabel();
        jTextFieldEmailID = new javax.swing.JTextField();
        patientTypejLabel1 = new javax.swing.JLabel();
        patientTypejComboBox = new javax.swing.JComboBox<>();
        imagejLabel = new javax.swing.JLabel();
        imagejButton = new javax.swing.JButton();
        messagejLabel = new javax.swing.JLabel();
        messagejTextField = new javax.swing.JTextField();
        imgjLabel = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        titlejLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titlejLabel.setText("Patient Registration Form");

        jLabelFirstname.setText("First Name:");

        jLabelLastname.setText("Last Name:");

        jTextFieldLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastnameActionPerformed(evt);
            }
        });

        jLabelgender.setText("Gender");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setActionCommand("M");

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setActionCommand("F");

        jLabelAge.setText("Age:");

        jLabelPhonenumber.setText("Phone Number:");

        jLabelEmailID.setText("Email ID:");

        patientTypejLabel1.setText("Patient Type");

        patientTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Walk In", "Appointment" }));
        patientTypejComboBox.setSelectedIndex(-1);

        imagejLabel.setText("Select Image");

        imagejButton.setText("Select Image File");
        imagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagejButtonActionPerformed(evt);
            }
        });

        messagejLabel.setText("Message");

        jButtonSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstname)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelPhonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jLabelEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imagejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(messagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientTypejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPhonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jTextFieldAge)
                            .addComponent(jTextFieldFirstname)
                            .addComponent(jRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(imgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imagejButton)
                            .addComponent(patientTypejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLastname)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButtonSubmit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(titlejLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titlejLabel)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstname)
                    .addComponent(jLabelLastname)
                    .addComponent(jTextFieldFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelgender)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAge))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhonenumber)
                    .addComponent(jTextFieldPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailID)
                    .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientTypejLabel1)
                    .addComponent(patientTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagejLabel)
                    .addComponent(imagejButton))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(messagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(messagejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSubmit)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastnameActionPerformed

    private void imagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagejButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if(file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            try{
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60,80,Image.SCALE_SMOOTH);

                if (edited_image != null) {
                    //this.imgjLabel.setText(file.getSelectedFile().getAbsolutePath());
                    //this.imgjLabel.setIcon((Icon)edited_image);
                    this.imgjLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                    //this.userInfo.setPic(new ImageIcon(edited_image));
                }
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                //ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_imagejButtonActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:

                try{
        String firstname = this.jTextFieldFirstname.getText();
        String lastname = this.jTextFieldLastname.getText();
       // String gender = (this.buttonGroupGender.getSelection().getActionCommand() != null) ? this.buttonGroupGender.getSelection().getActionCommand() : "";
        String gender = this.buttonGroupGender.getSelection().getActionCommand();
        String age = this.jTextFieldAge.getText();
        String phonenumber = this.jTextFieldPhonenumber.getText();
        String email = this.jTextFieldEmailID.getText();
        String patientType = this.patientTypejComboBox.getSelectedItem().toString();
        String message = this.messagejTextField.getText();
        String displayMessage;   
        
        if(firstname.equals("")|| lastname.equals("")|| age.equals("")|| phonenumber.equals("") || email.equals("") || patientType.equals("")){
           
            displayMessage = "May be you forget to enter some details!";
        }
        else{
             
            displayMessage = "Firstname: "+ firstname +" Lastname: "+ lastname +" Gender: "+ gender +" Age: "+ age +" Phonenumber: "+ phonenumber +" Email: " + email +" Patienttype: "+ patientType +" Message: "+ message ;
 
        }
        
        System.out.println(this.jTextFieldFirstname.getText());
        System.out.println(this.jTextFieldLastname.getText());
        System.out.println(this.jTextFieldAge.getText());
        System.out.println(this.jTextFieldPhonenumber.getText());
        System.out.println(this.jTextFieldEmailID.getText());
        System.out.println(this.patientTypejComboBox.getSelectedItem().toString());
        System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
        System.out.println(this.messagejTextField.getText());

        //JOptionPane.showConfirmDialog(this, displayMessage);
       JOptionPane.showMessageDialog(this, displayMessage, "SUCCESS", HEIGHT, this.profilePicture);
        
            Patient p1 = new Patient();
            p1.setFirstname(firstname);
            p1.setLastname(lastname);
            p1.setGender(gender);
            p1.setAge(age);
            p1.setPhonenumber(phonenumber);
            p1.setEmail(email);
            p1.setPatientType(patientType);
            p1.setMessage(message);
            p1.setProfilePicture(profilePicture);
            
            ViewJPanel newViewJPanel = new ViewJPanel(p1);
            this.bottomjPanel.add(newViewJPanel);
            CardLayout layout = (CardLayout)this.bottomjPanel.getLayout();
            layout.next(bottomjPanel);

        } 
          //catch(NullPointerException ne){
          //String errorMessage = "You must enter values in all fields";
          //JOptionPane.showConfirmDialog(this, errorMessage);
        catch (NullPointerException ne) {
        System.out.println("NullPointerException caught: " + ne.getMessage());
        String errorMessage = "You must enter values in all fields";
        JOptionPane.showConfirmDialog(this, errorMessage);
   
        }
        
        
        catch(Exception e){
            
        System.out.println("Error Occured");
        System.out.println(e);

}
                

        //</editor-fold>
    }//GEN-LAST:event_jButtonSubmitActionPerformed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton imagejButton;
    private javax.swing.JLabel imagejLabel;
    private javax.swing.JLabel imgjLabel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelFirstname;
    private javax.swing.JLabel jLabelLastname;
    private javax.swing.JLabel jLabelPhonenumber;
    private javax.swing.JLabel jLabelgender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldPhonenumber;
    private javax.swing.JLabel messagejLabel;
    private javax.swing.JTextField messagejTextField;
    private javax.swing.JComboBox<String> patientTypejComboBox;
    private javax.swing.JLabel patientTypejLabel1;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables
}
