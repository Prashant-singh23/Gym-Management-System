import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Frame;

public class GymGUI

{
    JFrame newFrame=new JFrame("new frame");
    ArrayList<GymMember> memberList = new ArrayList<GymMember>();

    private JTextField idField, nameField, locationField, phoneField, emailField, genderField, dobField, startDateField, referralField, trainerField;
    private JTextArea displayArea;  
    public GymMember findMember(int id){
        for (GymMember m : memberList) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    GymGUI(){
        JFrame g = new JFrame();
        g.setBounds(300,150,1000,560);
        g.setTitle("GymGUI");
        g.setLayout(null);

        JPanel titlepanel = new JPanel();
        titlepanel.setBounds(0,20,1000,60);
        titlepanel.setLayout(null);
        Color titlecolor = new Color(0, 0, 0);
        titlepanel.setBackground(titlecolor);
        g.add(titlepanel);

        JLabel titleLabel = new JLabel("Gym Membership Management");
        titleLabel.setBounds(300,0,470,70);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(Color.WHITE);
        titlepanel.add(titleLabel);
        titlepanel.add(new JLabel());

        JPanel panel = new JPanel();
        panel.setBounds(0,80,1000,800);
        panel.setLayout(null);

        ImageIcon icon = new ImageIcon("./Screenshot 2025-03-31 195149 - Copy.png");
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(900,450,Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel label = new JLabel(resizedIcon);
        label.setBounds(50,0,900,450);
        panel.add(label);
        g.add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,300,400);
        panel1.setLayout(null);
        Color colour = new Color(0, 0, 0);
        panel1.setBackground(colour);
        panel.add(panel1);
        panel1.setVisible(true);

        JPanel panel4 = new JPanel();
        panel4.setBounds(700,0,300,400);
        panel4.setLayout(null);
        Color colour4 = new Color(0, 0, 0);
        panel4.setBackground(colour4);
        panel.add(panel4);
        panel1.setVisible(true);

        JButton regularButton = new JButton("Add Regular Membership");
        regularButton.setFont(new Font("Arial",Font.BOLD,16));
        regularButton.setBackground(Color.WHITE);
        regularButton.setBounds (90,350,160,100);
        regularButton.setSize(250,50);
        regularButton.setFocusPainted(false);
        label.add(regularButton);

        JButton premiumButton= new JButton("Add Premium Membership");
        premiumButton.setFont(new Font("Arial",Font.BOLD,16));
        premiumButton.setBackground(Color.WHITE);
        premiumButton.setBounds (560,350,160,100);
        premiumButton.setSize(250,50);
        premiumButton.setFocusPainted(false);
        label.add(premiumButton);

        JPanel panel3 = new JPanel();
        panel3.setBounds(0,300,1000,150);
        panel3.setLayout(null);
        Color colour2 = new Color(0, 0, 0);
        panel3.setBackground(colour2);
        panel.add(panel3);
        panel3.setVisible(true);

        regularButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    g.setVisible(false);
                    JFrame b = new JFrame();
                    b.setBounds(300,50,1000,700);
                    b.setLayout(null);
                    b.setVisible(true);        
                    b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel regularpanel = new JPanel();
                    regularpanel.setBounds(0,10,1000,60);
                    regularpanel.setLayout(null);
                    Color regularcolor = new Color(0, 0, 0);
                    regularpanel.setBackground(titlecolor);
                    b.add(regularpanel);

                    JLabel regularLabel = new JLabel("Regular Membership");
                    regularLabel.setBounds(350,0,400,60);
                    regularLabel.setFont(new Font("Arial", Font.BOLD, 30));
                    regularLabel.setForeground(Color.WHITE);
                    regularpanel.add(regularLabel);
                    regularpanel.add(new JLabel());

                    JPanel regularpanel2 = new JPanel();
                    regularpanel2.setBounds(0,60,1000,700);
                    regularpanel2.setLayout(null);
                    Color regularcolor2 = new Color(195, 176, 145);
                    regularpanel2.setBackground(regularcolor2);
                    b.add(regularpanel2);

                    JButton closeButton= new JButton("Close");
                    closeButton.setFont(new Font("Arial",Font.BOLD,16));
                    closeButton.setBackground(Color.BLACK);
                    closeButton.setForeground(Color.WHITE);
                    closeButton.setBounds (890,20,80,30);
                    closeButton.setSize(80,30);
                    regularpanel2.add(closeButton);

                    closeButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Close the current frame
                                b.setVisible(false);

                                // Open GFrame
                                // Create an instance of GFrame
                                g.setVisible(true); // Make the GFrame visible
                            }
                        });

                    JLabel idLabel = new JLabel("ID ");
                    idLabel.setBounds(50,20,100,50);
                    idLabel.setLayout(null);
                    regularpanel2.add(idLabel);

                    JTextField idField = new JTextField();
                    idField.setBounds(150,30,200,30);
                    idField.setLayout(null);
                    regularpanel2.add(idField);

                    JLabel nameLabel = new JLabel("Name");
                    nameLabel .setBounds(50,60,100,50);
                    nameLabel .setLayout(null);
                    regularpanel2.add(nameLabel);

                    nameField = new JTextField();
                    nameField.setBounds(150,70,200,30);
                    nameField.setLayout(null);
                    regularpanel2.add(nameField);

                    JLabel locationLabel = new JLabel("Location");
                    locationLabel.setBounds(500,20,100,50);
                    locationLabel.setLayout(null);
                    regularpanel2.add(locationLabel);

                    locationField = new JTextField();
                    locationField.setBounds(600,30,200,30);
                    locationField.setLayout(null);
                    regularpanel2.add(locationField);

                    JLabel phoneLabel = new JLabel("Phone");
                    phoneLabel.setBounds(500,60,100,50);
                    phoneLabel.setLayout(null);
                    regularpanel2.add(phoneLabel);

                    phoneField = new JTextField();
                    phoneField.setBounds(600,70,200,30);
                    phoneField.setLayout(null);
                    regularpanel2.add(phoneField);

                    JLabel emailLabel = new JLabel("E-mail");
                    emailLabel.setBounds(50,100,100,50);
                    emailLabel.setLayout(null);
                    regularpanel2.add(emailLabel);

                    emailField = new JTextField();
                    emailField.setBounds(150,110,200,30);
                    emailField.setLayout(null);
                    regularpanel2.add(emailField);

                    JLabel genderLabel = new JLabel("Gender ");
                    genderLabel.setBounds(500,100,100,50);
                    genderLabel.setLayout(null);
                    regularpanel2.add(genderLabel);

                    JRadioButton maleRadio = new JRadioButton("Male");
                    maleRadio.setBounds(600,110,60,30);
                    JRadioButton femaleRadio = new JRadioButton("Female");
                    femaleRadio.setBounds(660,110,70,30);
                    JRadioButton otherRadio = new JRadioButton("Others");
                    otherRadio.setBounds(730,110,70,30);
                    regularpanel2.add(maleRadio);
                    regularpanel2.add(femaleRadio);
                    regularpanel2.add(otherRadio);

                    ButtonGroup rg = new ButtonGroup();
                    rg.add(maleRadio);
                    rg.add(femaleRadio);
                    rg.add(otherRadio);

                    JLabel dobLabel = new JLabel("DOB ");
                    dobLabel.setBounds(50,140,100,50);
                    dobLabel.setLayout(null);
                    regularpanel2.add(dobLabel);

                    String[] years = {"1980","1981","1982","1983","1984","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1994","1995","1996","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
                    JComboBox<String>Years = new JComboBox<>(years);
                    Years.setBounds(150,150,60,30);
                    regularpanel2.add(Years);

                    String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                    JComboBox<String> Months = new JComboBox<>(months);
                    Months.setBounds(220,150,70,30);
                    regularpanel2.add(Months);

                    String[] dobdays = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
                    JComboBox<String> dobDays = new JComboBox<>(dobdays);
                    dobDays.setBounds(300,150,50,30);
                    regularpanel2.add(dobDays);

                    JLabel startDateLabel = new JLabel("MembershipStartDate ");
                    startDateLabel.setBounds(500,140,200,50);
                    startDateLabel.setLayout(null);
                    regularpanel2.add(startDateLabel);

                    String[] years1 = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
                    JComboBox<String>Years1 = new JComboBox<>(years1);
                    Years1.setBounds(650,150,60,30);
                    regularpanel2.add(Years1);

                    String[] months1 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                    JComboBox<String> Months1 = new JComboBox<>(months1);
                    Months1.setBounds(720,150,70,30);
                    regularpanel2.add(Months1);

                    String[] days1 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
                    JComboBox<String> Days1 = new JComboBox<>(days1);
                    Days1.setBounds(800,150,40,30);
                    regularpanel2.add(Days1);

                    JLabel referralLabel = new JLabel("Referral Source");
                    referralLabel.setBounds(50,190,100,50);
                    referralLabel.setLayout(null);
                    regularpanel2.add(referralLabel);

                    JTextField referralField = new JTextField();
                    referralField.setBounds(150,200,200,30);
                    referralField.setLayout(null);
                    regularpanel2.add(referralField);

                    JPanel rbuttonpanel = new JPanel();
                    rbuttonpanel.setBounds(50,350,900,200);
                    rbuttonpanel.setLayout(null);
                    regularpanel2.add(rbuttonpanel);

                    ImageIcon icon2 = new ImageIcon("./wp5886086-gym-hd-desktop-wallpapers.jpg");
                    Image image2 = icon2.getImage();
                    Image resizedImage2 = image2.getScaledInstance(900,200,Image.SCALE_SMOOTH);
                    ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
                    regularpanel2.add(rbuttonpanel);

                    JLabel labelimage = new JLabel(resizedIcon2);
                    labelimage.setBounds(0,0,900,200);
                    rbuttonpanel.add(labelimage);

                    JLabel planLabel = new JLabel("Plans ");
                    planLabel.setBounds(50,240,100,50);
                    planLabel.setLayout(null);
                    regularpanel2.add(planLabel);

                    String[] plans = {"Basic","Standard","Deluxe"};
                    JComboBox<String> Plans = new JComboBox<>(plans);
                    Plans.setBounds(150,250,100,30);
                    regularpanel2.add(Plans);

                    JLabel planPriceLabel = new JLabel("Regular Price");
                    planPriceLabel.setBounds(50,290,100,50);
                    planPriceLabel.setLayout(null);
                    regularpanel2.add(planPriceLabel);

                    JTextField planPriceField = new JTextField("6500.0");
                    planPriceField.setBounds(150,300,200,30);
                    planPriceField.setLayout(null);
                    planPriceField.setEditable(false);
                    regularpanel2.add(planPriceField);

                    Plans.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String selectedPlan = (String)Plans.getSelectedItem();
                                double price = 0;

                                if (selectedPlan.equalsIgnoreCase("basic")) {
                                    price = 6500;
                                } else if (selectedPlan.equalsIgnoreCase("standard")) {
                                    price = 12500;
                                } else if (selectedPlan.equalsIgnoreCase("deluxe")) {
                                    price = 18500;
                                }

                                planPriceField.setText(String.valueOf(price));
                            }
                        });

                    JLabel removalLabel = new JLabel("Removal Reason");
                    removalLabel.setBounds(500,190,100,50);
                    removalLabel.setLayout(null);
                    regularpanel2.add(removalLabel);

                    JTextArea removalField = new JTextArea();
                    removalField.setBounds(600,200,200,60);
                    removalField.setLayout(null);
                    regularpanel2.add(removalField);

                    JButton addButton= new JButton("Add Membership");
                    addButton.setFont(new Font("Arial",Font.BOLD,16));
                    addButton.setBackground(Color.WHITE);
                    addButton.setBounds (600,30,200,50);
                    addButton.setSize(250,50);
                    labelimage.add(addButton);

                    addButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    if (idField.getText().isEmpty() || nameField.getText().isEmpty() ||
                                    locationField.getText().isEmpty() || phoneField.getText().isEmpty() ||
                                    emailField.getText().isEmpty() || referralField.getText().isEmpty()) {

                                        JOptionPane.showMessageDialog(g, "Please fill all required fields.");
                                        return;
                                    }

                                    // Get values from input fields
                                    int id = Integer.parseInt(idField.getText());
                                    String name = nameField.getText();
                                    String location = locationField.getText();
                                    String phone = phoneField.getText();
                                    String email = emailField.getText();
                                    String referralSource = referralField.getText();

                                    // Get gender
                                    String gender = "";
                                    if (maleRadio.isSelected()) {
                                        gender = "Male";
                                    } else if (femaleRadio.isSelected()) {
                                        gender = "Female";
                                    } else {
                                        JOptionPane.showMessageDialog(g, "Please select a gender.");
                                        return;
                                    }

                                    // Get date of birth
                                    if (Years.getSelectedItem() == null || Months.getSelectedItem() == null || dobDays.getSelectedItem() == null) {
                                        JOptionPane.showMessageDialog(g, "Please select a valid date of birth.");
                                        return;
                                    }
                                    String dob = Years.getSelectedItem() + "-" + Months.getSelectedItem() + "-" + dobDays.getSelectedItem();

                                    // Get membership start date 
                                    if (Years1.getSelectedItem() == null || Months1.getSelectedItem() == null || Days1.getSelectedItem() == null) {
                                        JOptionPane.showMessageDialog(g, "Please select a valid membership start date.");
                                        return;
                                    }
                                    String membershipStartDate = Years1.getSelectedItem() + "-" + Months1.getSelectedItem() + "-" + Days1.getSelectedItem();

                                    // Check for duplicate ID 
                                    boolean idExists = false;
                                    for (GymMember m : memberList) {
                                        if (m.getId() == id) {
                                            idExists = true;
                                            break;
                                        }
                                    }

                                    if (idExists) {
                                        JOptionPane.showMessageDialog(g, "Member with this ID already exists. Please use a unique ID.");
                                        return;
                                    }

                                    // Create the RegularMember object
                                    RegularMember newMember = new RegularMember(id, name, location, phone, email, gender, dob, membershipStartDate, referralSource);

                                    // Add member to list
                                    memberList.add(newMember);

                                    // Show success message
                                    JOptionPane.showMessageDialog(g, "Regular member added successfully!");

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(g, "Please enter a valid number for ID.");
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(g, "An error occurred: " + ex.getMessage());
                                }
                            }
                        });

                    JButton activateButton= new JButton("Activate Membership");
                    activateButton.setFont(new Font("Arial",Font.BOLD,16));
                    activateButton.setBackground(Color.WHITE);
                    activateButton.setBounds (320,130,200,50);
                    activateButton.setSize(250,50);
                    labelimage.add(activateButton); 

                    activateButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String input = idField.getText();

                                if (input.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Please enter Member ID.");
                                    return;
                                }

                                try {
                                    int memberId = Integer.parseInt(input);
                                    boolean found = false;

                                    for (GymMember m : memberList) {
                                        if (m instanceof RegularMember && m.getId() == memberId) {
                                            m.activateMembership();
                                            JOptionPane.showMessageDialog(null, "Regular Member ID " + memberId + " activated.");
                                            found = true;
                                            break;
                                        }
                                    }

                                    if (!found) {
                                        JOptionPane.showMessageDialog(null, "Regular Member ID not found.");
                                    }

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid ID. Please enter a number.");
                                }
                            }
                        });

                    JButton deactivateButton= new JButton("Deactivate Membership");
                    deactivateButton.setFont(new Font("Arial",Font.BOLD,16));
                    deactivateButton.setBackground(Color.WHITE);
                    deactivateButton.setBounds (600,130,200,50);
                    deactivateButton.setSize(250,50);
                    labelimage.add(deactivateButton);

                    deactivateButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String memberIdStr = JOptionPane.showInputDialog(g, "Enter Member ID to Deactivate:");
                                if (memberIdStr != null && !memberIdStr.isEmpty()) {
                                    try {
                                        int memberId = Integer.parseInt(memberIdStr);
                                        GymMember member = findMember(memberId);

                                        if (member != null && member instanceof RegularMember) {
                                            member.getActiveStatus();
                                            JOptionPane.showMessageDialog(g, "Member deactivated successfully!");
                                        } else if (member != null) {
                                            JOptionPane.showMessageDialog(g, "Member is not a Regular member.");
                                        } else {
                                            JOptionPane.showMessageDialog(g, "Member not found.");
                                        }
                                    } catch (NumberFormatException ex) {
                                        JOptionPane.showMessageDialog(g, "Invalid Member ID.");
                                    }
                                }
                            }
                        });

                    JButton markButton= new JButton("Mark Attendance");
                    markButton.setFont(new Font("Arial",Font.BOLD,16));
                    markButton.setBackground(Color.WHITE);
                    markButton.setBounds (30,30,200,50);
                    markButton.setSize(250,50);
                    labelimage.add(markButton);

                    markButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                try {

                                    String inputId = JOptionPane.showInputDialog(g, "Enter Member ID:");
                                    int id = Integer.parseInt(inputId);

                                    // Find member by ID
                                    GymMember member = findMember(id);
                                    if (member == null) {
                                        JOptionPane.showMessageDialog(g, "No member found with ID: " + id);
                                        return;
                                    }

                                    // Mark attendance for RegularMember
                                    if (member instanceof RegularMember) {
                                        RegularMember regularMember = (RegularMember) member;
                                        regularMember.markAttendance();

                                        // Confirmation message
                                        JOptionPane.showMessageDialog(g,
                                            "Attendance marked successfully!\nCurrent Attendance: " + regularMember.getAttendance());
                                    } else {
                                        JOptionPane.showMessageDialog(g,
                                            "This feature is only available for Regular Members.");
                                    }
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(g,
                                        "Error marking attendance: " + ex.getMessage());
                                }
                            }
                        });

                    JButton displayButton= new JButton("Display");
                    displayButton.setFont(new Font("Arial",Font.BOLD,16));
                    displayButton.setBackground(Color.WHITE);
                    displayButton.setBounds (30,120,200,50);
                    displayButton.setSize(250,50);
                    labelimage.add(displayButton);

                    displayButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame frame = new JFrame("Regular Member Information");
                                JTextArea area = new JTextArea();
                                area.setEditable(false);

                                StringBuilder text = new StringBuilder();  

                                for (GymMember m : memberList) {
                                    if (m instanceof RegularMember) {
                                        RegularMember r = (RegularMember) m;
                                        text.append("ID: ").append(r.getId()).append(" \n");
                                        text.append("Name: ").append(r.getName()).append("\n");
                                        text.append("Email: ").append(r.getEmail()).append("\n");
                                        text.append("Phone: ").append(r.getPhone()).append("\n");
                                        text.append("Attendance: ").append(r.getAttendance()).append("\n");
                                        text.append("Status: ").append(r.getActiveStatus() ? "Active" : "Inactive").append("\n");
                                        text.append("Type: Regular Member\n");
                                        text.append("Plan: ").append(r.getPlan()).append("\n");
                                        text.append("Price: ").append(r.getPrice()).append("\n");
                                        text.append("--------------------------\n");
                                    }
                                }

                                area.setText(text.toString());
                                frame.add(new JScrollPane(area));
                                frame.setSize(450, 500);
                                frame.setVisible(true);
                            }
                        });

                    JButton revertButton= new JButton("Revert Member");
                    revertButton.setFont(new Font("Arial",Font.BOLD,16));
                    revertButton.setBackground(Color.WHITE);
                    revertButton.setBounds (320,30,200,50);
                    revertButton.setSize(250,50);
                    labelimage.add(revertButton);

                    revertButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                               
                            }
                        });

                }
            });

        premiumButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent d){

                    g.setVisible(false);
                    JFrame c = new JFrame();
                    c.setBounds(300,50,1000,700);
                    c.setLayout(null);
                    c.setVisible(true);        
                    c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JPanel premiumpanel = new JPanel();
                    premiumpanel.setBounds(0,10,1000,60);
                    premiumpanel.setLayout(null);
                    Color premiumcolor = new Color(0, 0, 0);
                    premiumpanel.setBackground(titlecolor);
                    c.add(premiumpanel);

                    JLabel premiumLabel = new JLabel("Premium Membership");
                    premiumLabel.setBounds(350,0,400,60);
                    premiumLabel.setFont(new Font("Arial", Font.BOLD, 30));
                    premiumLabel.setForeground(Color.WHITE);
                    premiumpanel.add(premiumLabel);
                    premiumpanel.add(new JLabel());

                    JPanel premiumpanel2 = new JPanel();
                    premiumpanel2.setBounds(0,70,1000,700);
                    premiumpanel2.setLayout(null);
                    Color premiumcolor2 = new Color(195, 176, 145);
                    premiumpanel2.setBackground(premiumcolor2);
                    c.add(premiumpanel2);

                    JButton closeButton= new JButton("Close");
                    closeButton.setFont(new Font("Arial",Font.BOLD,16));
                    closeButton.setForeground(Color.WHITE);
                    closeButton.setBackground(Color.BLACK);
                    closeButton.setBounds (890,10,80,30);
                    closeButton.setSize(80,30);
                    premiumpanel2.add(closeButton);

                    closeButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Close the current frame
                                c.setVisible(false);

                                g.setVisible(true); 
                            }
                        });

                    JLabel idLabel = new JLabel("ID ");
                    idLabel.setBounds(50,20,100,50);
                    idLabel.setLayout(null);
                    premiumpanel2.add(idLabel);

                    JTextField idField = new JTextField();
                    idField.setBounds(150,30,200,30);
                    idField.setLayout(null);
                    premiumpanel2.add(idField);

                    JLabel nameLabel = new JLabel("Name");
                    nameLabel.setBounds(50,60,100,50);
                    nameLabel.setLayout(null);
                    premiumpanel2.add(nameLabel);

                    JTextField nameField = new JTextField();
                    nameField.setBounds(150,70,200,30);
                    nameField.setLayout(null);
                    premiumpanel2.add(nameField);

                    JLabel locationLabel = new JLabel("Location");
                    locationLabel.setBounds(500,20,100,50);
                    locationLabel.setLayout(null);
                    premiumpanel2.add(locationLabel);

                    JTextField locationField = new JTextField();
                    locationField.setBounds(600,30,200,30);
                    locationField.setLayout(null);
                    premiumpanel2.add(locationField);

                    JLabel phoneLabel = new JLabel("Phone");
                    phoneLabel.setBounds(500,60,100,50);
                    phoneLabel.setLayout(null);
                    premiumpanel2.add(phoneLabel);

                    JTextField phoneField = new JTextField();
                    phoneField.setBounds(600,70,200,30);
                    phoneField.setLayout(null);
                    premiumpanel2.add(phoneField);

                    JLabel emailLabel = new JLabel("E-mail");
                    emailLabel.setBounds(50,100,100,50);
                    emailLabel.setLayout(null);
                    premiumpanel2.add(emailLabel);

                    JTextField emailField = new JTextField();
                    emailField.setBounds(150,110,200,30);
                    emailField.setLayout(null);
                    premiumpanel2.add(emailField);

                    JLabel l6 = new JLabel("Gender ");
                    l6.setBounds(500,100,100,50);
                    l6.setLayout(null);
                    premiumpanel2.add(l6);

                    JRadioButton maleRadio = new JRadioButton("Male");
                    maleRadio.setBounds(600,110,60,30);
                    JRadioButton femaleRadio = new JRadioButton("Female");
                    femaleRadio.setBounds(660,110,70,30);
                    JRadioButton otherRadio = new JRadioButton("Others");
                    otherRadio.setBounds(730,110,70,30);
                    premiumpanel2.add(maleRadio);
                    premiumpanel2.add(femaleRadio);
                    premiumpanel2.add(otherRadio);

                    ButtonGroup rg = new ButtonGroup();
                    rg.add(maleRadio);
                    rg.add(femaleRadio);
                    rg.add(otherRadio);

                    JLabel l7 = new JLabel("DOB ");
                    l7.setBounds(50,140,100,50);
                    l7.setLayout(null);
                    premiumpanel2.add(l7);

                    String[] years = {"1980","1981","1982","1983","1984","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1994","1995","1996","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
                    JComboBox<String>Years = new JComboBox<>(years);
                    Years.setBounds(150,150,60,30);
                    premiumpanel2.add(Years);

                    String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                    JComboBox<String> Months = new JComboBox<>(months);
                    Months.setBounds(220,150,70,30);
                    premiumpanel2.add(Months);

                    String[] dobdays = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
                    JComboBox<String> dobDays = new JComboBox<>(dobdays);
                    dobDays.setBounds(300,150,50,30);
                    premiumpanel2.add(dobDays);

                    JLabel l8 = new JLabel("MembershipStartDate ");
                    l8.setBounds(500,140,200,50);
                    l8.setLayout(null);
                    premiumpanel2.add(l8);

                    String[] years1 = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
                    JComboBox<String>Years1 = new JComboBox<>(years1);
                    Years1.setBounds(650,150,60,30);
                    premiumpanel2.add(Years1);

                    String[] months1 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                    JComboBox<String> Months1 = new JComboBox<>(months1);
                    Months1.setBounds(720,150,70,30);
                    premiumpanel2.add(Months1);

                    String[] days1 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
                    JComboBox<String> Days1 = new JComboBox<>(days1);
                    Days1.setBounds(800,150,40,30);
                    premiumpanel2.add(Days1);

                    JLabel trainer = new JLabel("Trainer's Name ");
                    trainer.setBounds(500,180,100,50);
                    trainer.setLayout(null);
                    premiumpanel2.add(trainer);

                    JTextField trainerField = new JTextField();
                    trainerField.setBounds(600,190,200,30);
                    trainerField.setLayout(null);
                    premiumpanel2.add(trainerField);

                    JLabel pPriceLabel = new JLabel("Premium Price");
                    pPriceLabel.setBounds(500,220,100,50);
                    pPriceLabel.setLayout(null);
                    premiumpanel2.add(pPriceLabel);

                    JTextField pPriceField = new JTextField("50000.0");
                    pPriceField.setBounds(600,230,200,30);
                    pPriceField.setLayout(null);
                    pPriceField.setEditable(false);
                    premiumpanel2.add(pPriceField);

                    JLabel removalLabel = new JLabel("Removal Reason");
                    removalLabel.setBounds(50,180,100,50);
                    removalLabel.setLayout(null);
                    premiumpanel2.add(removalLabel);

                    JTextArea removalField = new JTextArea();
                    removalField.setBounds(150,190,200,60);
                    removalField.setLayout(null);
                    premiumpanel2.add(removalField);

                    JPanel pbuttonpanel = new JPanel();
                    pbuttonpanel.setBounds(50,350,900,200);
                    pbuttonpanel.setLayout(null);
                    Color pbuttoncolor = new Color(0, 0, 0);
                    pbuttonpanel.setBackground(pbuttoncolor);
                    premiumpanel2.add(pbuttonpanel);     

                    ImageIcon icon2 = new ImageIcon("./wp5886086-gym-hd-desktop-wallpapers.jpg");
                    Image image2 = icon2.getImage();
                    Image resizedImage2 = image2.getScaledInstance(900,200,Image.SCALE_SMOOTH);
                    ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
                    premiumpanel2.add(pbuttonpanel);

                    JLabel labelimage2 = new JLabel(resizedIcon2);
                    labelimage2.setBounds(0,0,900,200);
                    pbuttonpanel.add(labelimage2);

                    JButton addButton= new JButton("Add Membership");
                    addButton.setFont(new Font("Arial",Font.BOLD,16));
                    addButton.setBackground(Color.WHITE);
                    addButton.setBounds (600,30,200,50);
                    addButton.setSize(250,50);
                    labelimage2.add(addButton);

                    addButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    // Check if required fields are empty
                                    if (idField.getText().isEmpty() || nameField.getText().isEmpty() ||
                                    locationField.getText().isEmpty() || phoneField.getText().isEmpty() ||
                                    emailField.getText().isEmpty() || trainerField.getText().isEmpty()) {

                                        JOptionPane.showMessageDialog(g, "Please fill all required fields.");
                                        return;
                                    }

                                    // Get input values from fields
                                    int id = Integer.parseInt(idField.getText());
                                    String name = nameField.getText();
                                    String location = locationField.getText();
                                    String phone = phoneField.getText();
                                    String email = emailField.getText();
                                    String trainerName = trainerField.getText();

                                    // Get gender
                                    String gender = "";
                                    if (maleRadio.isSelected()) {
                                        gender = "Male";
                                    } else if (femaleRadio.isSelected()) {
                                        gender = "Female";
                                    } else {
                                        JOptionPane.showMessageDialog(g, "Please select a gender.");
                                        return;
                                    }

                                    // Get date of birth
                                    if (Years.getSelectedItem() == null || Months.getSelectedItem() == null || dobDays.getSelectedItem() == null) {
                                        JOptionPane.showMessageDialog(g, "Please select a valid date of birth.");
                                        return;
                                    }
                                    String dob = Years.getSelectedItem() + "-" + Months.getSelectedItem() + "-" + dobDays.getSelectedItem();

                                    // Get membership start date
                                    if (Years1.getSelectedItem() == null || Months1.getSelectedItem() == null || Days1.getSelectedItem() == null) {
                                        JOptionPane.showMessageDialog(g, "Please select a valid membership start date.");
                                        return;
                                    }
                                    String membershipStartDate = Years1.getSelectedItem() + "-" + Months1.getSelectedItem() + "-" + Days1.getSelectedItem();

                                    // Check if ID is already used
                                    boolean idExists = false;
                                    for (GymMember m : memberList) {
                                        if (m.getId() == id) {
                                            idExists = true;
                                            break;
                                        }
                                    }

                                    if (idExists) {
                                        JOptionPane.showMessageDialog(g, "Member with this ID already exists. Please use a unique ID.");
                                        return;
                                    }

                                    // Create PremiumMember object
                                    PremiumMember newMember = new PremiumMember(id, name, location, phone, email, gender, dob, membershipStartDate, trainerName);

                                    // Add to member list
                                    memberList.add(newMember);

                                    // Show success message
                                    JOptionPane.showMessageDialog(g, "Premium member added successfully!");
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(g, "Please enter valid numbers for ID, Attendance Limit, and Discount.");
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(g, "Something went wrong: " + ex.getMessage());
                                }
                            }
                        });

                    JButton activateButton= new JButton("Activate Membership");
                    activateButton.setFont(new Font("Arial",Font.BOLD,16));
                    activateButton.setBackground(Color.WHITE);
                    activateButton.setBounds (300,30,200,50);
                    activateButton.setSize(250,50);
                    labelimage2.add(activateButton);  

                     activateButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String input = idField.getText();

                                if (input.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Please enter Member ID.");
                                    return;
                                }

                                try {
                                    int memberId = Integer.parseInt(input);
                                    boolean found = false;

                                    for (GymMember m : memberList) {
                                        if (m instanceof PremiumMember && m.getId() == memberId) {
                                            m.activateMembership();
                                            JOptionPane.showMessageDialog(null, "Premium Member ID " + memberId + " activated.");
                                            found = true;
                                            break;
                                        }
                                    }

                                    if (!found) {
                                        JOptionPane.showMessageDialog(null, "Regular Member ID not found.");
                                    }

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Invalid ID. Please enter a number.");
                                }
                            }
                        });
                    JButton deactivateButton= new JButton("Deactivate Membership");
                    deactivateButton.setFont(new Font("Arial",Font.BOLD,16));
                    deactivateButton.setBackground(Color.WHITE);
                    deactivateButton.setBounds (600,120,200,50);
                    deactivateButton.setSize(250,50);
                    labelimage2.add(deactivateButton);

                   deactivateButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String memberIdStr = JOptionPane.showInputDialog(g, "Enter Member ID to Deactivate:");
                                if (memberIdStr != null && !memberIdStr.isEmpty()) {
                                    try {
                                        int memberId = Integer.parseInt(memberIdStr);
                                        GymMember member = findMember(memberId);

                                        if (member != null && member instanceof PremiumMember) {
                                            member.getActiveStatus();
                                            JOptionPane.showMessageDialog(g, "Member deactivated successfully!");
                                        } else if (member != null) {
                                            JOptionPane.showMessageDialog(g, "Member is not a Premium member.");
                                        } else {
                                            JOptionPane.showMessageDialog(g, "Member not found.");
                                        }
                                    } catch (NumberFormatException ex) {
                                        JOptionPane.showMessageDialog(g, "Invalid Member ID.");
                                    }
                                }
                            }
                        });

                    JButton markButton= new JButton("Mark Attendance");
                    markButton.setFont(new Font("Arial",Font.BOLD,16));
                    markButton.setBackground(Color.WHITE);
                    markButton.setBounds (30,120,200,50);
                    markButton.setSize(250,50);
                    labelimage2.add(markButton);
                    
                     markButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                try {

                                    String inputId = JOptionPane.showInputDialog(g, "Enter Member ID:");
                                    int id = Integer.parseInt(inputId);

                                    // Find member by ID
                                    GymMember member = findMember(id);
                                    if (member == null) {
                                        JOptionPane.showMessageDialog(g, "No member found with ID: " + id);
                                        return;
                                    }

                                    // Mark attendance for RegularMember
                                    if (member instanceof PremiumMember) {
                                        PremiumMember premiumMember = (PremiumMember) member;
                                        premiumMember.markAttendance();

                                        // Confirmation message
                                        JOptionPane.showMessageDialog(g,
                                            "Attendance marked successfully!\nCurrent Attendance: " + premiumMember.getAttendance());
                                    } else {
                                        JOptionPane.showMessageDialog(g,
                                            "This feature is only available for Regular Members.");
                                    }
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(g,
                                        "Error marking attendance: " + ex.getMessage());
                                }
                            }
                        });

                    JButton revertButton= new JButton("Revert Member");
                    revertButton.setFont(new Font("Arial",Font.BOLD,16));
                    revertButton.setBackground(Color.WHITE);
                    revertButton.setBounds (30,30,200,50);
                    revertButton.setSize(250,50);
                    labelimage2.add(revertButton);

                    revertButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Get the entered ID from the text field
                                String idText = idField.getText().trim();

                                try {
                                    int enteredId = Integer.parseInt(idText);
                                    boolean found = false;

                                    for (GymMember m : memberList) {
                                        // Check if the member is a PremiumMember and has the given ID
                                        if (m instanceof PremiumMember && m.getId() == enteredId) {
                                            PremiumMember pm = (PremiumMember) m;
                                            pm.revertPremuimMember(); // Call the revert method
                                            JOptionPane.showMessageDialog(null, "Premium Member reverted successfully.");
                                            found = true;
                                            break;
                                        }
                                    }

                                    if (!found) {
                                        JOptionPane.showMessageDialog(null, "Premium Member with ID " + enteredId + " not found.");
                                    }

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric Member ID.");
                                }
                            }
                        });

                    JButton displayButton2= new JButton("Display");
                    displayButton2.setFont(new Font("Arial",Font.BOLD,16));
                    displayButton2.setBackground(Color.WHITE);
                    displayButton2.setBounds (300,120,200,50);
                    displayButton2.setSize(250,50);
                    labelimage2.add(displayButton2);

                    displayButton2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame frame2 = new JFrame("Premium Member Information");
                                JTextArea area2 = new JTextArea();
                                area2.setEditable(false);

                                StringBuilder text = new StringBuilder();  

                                for (GymMember m : memberList) {
                                    if (m instanceof PremiumMember) {
                                        PremiumMember p = (PremiumMember) m;
                                        text.append("ID: ").append(p.getId()).append("\n");
                                        text.append("Name: ").append(p.getName()).append("\n");
                                        text.append("Email: ").append(p.getEmail()).append("\n");
                                        text.append("Phone: ").append(p.getPhone()).append("\n");
                                        text.append("Attendance: ").append(p.getAttendance()).append("\n");
                                        text.append("Status: ").append(p.getActiveStatus() ? "Active" : "Inactive").append("\n");
                                        text.append("Type: Premium Member\n");
                                        text.append("Trainer: ").append(p.getPersonalTrainer()).append("\n");
                                        text.append("--------------------------\n");
                                    }
                                }

                                area2.setText(text.toString());  
                                frame2.add(new JScrollPane(area2));
                                frame2.setSize(450, 500);
                                frame2.setVisible(true);
                            }
                        });

                    displayButton2.setVisible(true);
                    revertButton.setVisible(true);
                    markButton.setVisible(true);
                }

            });

        g.setVisible(true);
    }

    public static void main(String[]args)
    {

        new GymGUI();
    }
}