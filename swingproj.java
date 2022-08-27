// By Pulkit Gautam 2004006

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class swingproj{
    public static void main(String[] args){

        // COLORS
        Color panel_bg = Color.decode("#224e90");
        Color font_color = Color.decode("#ffffff");
        Color button_bg = Color.decode("#d6d5cb");
        Color button_fontColor = Color.decode("#224e90");

        // FRAME
        JFrame f = new JFrame("NIT PATNA CENTRAL LIBRARY");
        f.getContentPane().setBackground(Color.decode("#d6d5cb"));
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true); 
        f.setLayout(null);
        
        // AREA 1
        JPanel panel1 = new JPanel();  
        panel1.setBounds(0, 0, 1540, 100);
        panel1.setBackground(panel_bg);
        panel1.setLayout(null);
        f.add(panel1);

        // LOGO
        Icon logo = new ImageIcon("logo.jpg");
        JLabel logo_b = new JLabel(logo);
        logo_b.setBounds(0, 0, 100, 100);
        panel1.add(logo_b);

        // TITLE
        JLabel heading = new JLabel("NIT PATNA CENTRAL LIBRARY");
        heading.setBounds(110, 20, 800, 100);
        heading.setFont(new Font("Consolas", 1, 44));
        heading.setForeground(font_color);
        panel1.add(heading);

        // LOGIN Buttons
        JButton button1 = new JButton("SIGN-UP");
        button1.setBounds(1100, 40, 120, 40);
        button1.setFont(new Font("Bahnschrift Light Condensed",1,20));
        button1.setBackground(button_bg);
        button1.setForeground(button_fontColor);
        button1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        panel1.add(button1);

        JButton button2 = new JButton("LOG-IN");
        button2.setBounds(1240, 40, 120, 40);
        button2.setFont(new Font("Bahnschrift Light Condensed",1,20));
        button2.setBackground(button_bg);
        button2.setForeground(button_fontColor);
        button2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        panel1.add(button2);

        // AREA 2
        JPanel panel2 = new JPanel();  
        panel2.setBounds(40, 140, 400, 640);
        panel2.setBackground(panel_bg);
        panel2.setLayout(null);
        f.add(panel2);

        // SEARCH BAR
        JTextField search = new JTextField("  Search Books");
        search.setBounds(20, 20, 310, 40);
        panel2.add(search);

        // SEARCH ICON
        Icon search_icon = new ImageIcon("search.jpg");
        JButton searchbutton = new JButton(search_icon);
        searchbutton.setBounds(330, 20, 40, 40);
        searchbutton.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        panel2.add(searchbutton);

        // MENU BUTTONS
        JButton[] button = new JButton[6];
        String txt[] = {"BORROW BOOKS", "RETURN BOOKS", "PAY FINE", "OTHER RESOURCES", "MANAGEMENT", "CONTACT INFO"};
        for(int i=0; i<6; i++){
            button[i] = new JButton(txt[i]);
            button[i].setSize(250, 60);
            button[i].setLocation(75, (90+(i*90)));
            button[i].setFont(new Font("Bahnschrift Light Condensed",1,14));
            button[i].setBackground(button_bg);
            button[i].setForeground(button_fontColor);
            button[i].setBorder(BorderFactory.createMatteBorder(2, 6, 2, 2, Color.GRAY));
            panel2.add(button[i]);
        }

        // AREA 3
        JPanel panel3 = new JPanel();  
        panel3.setBounds(740, 140, 500, 295);
        panel3.setLayout(null);
        f.add(panel3);

        // IMAGE
        Icon libimg = new ImageIcon("image.jpg");
        JLabel img = new JLabel(libimg);
        img.setBounds(0, 0, 500, 295);
        img.setBorder(BorderFactory.createRaisedBevelBorder());
        panel3.add(img);

        // AREA 4
        JPanel panel4 = new JPanel();  
        panel4.setBounds(480, 475, 1020, 305);
        panel4.setBackground(panel_bg);
        panel4.setLayout(null);
        f.add(panel4);

        // ABOUT SECTION
        String info_string = "The Central library of the institute owns a vast stock of over 75,000 books catering to the \nneeds of all the relevant fields of engineering. It has a resourceful stock of over 10,000 \ncomputer related books and clearly demarcated section for every engineering branch and \narchitecture. In addition to the engineering pertinent books, the central library is self-\nsufficient in a vivid category of other business and current affairs related magazines, \npamphlets and journals which includes TIME and NEWSWEEK.The Central Library is fully automated \nand all operations are performed with the help of Libsys-Library Automation Software. The \nstudents can issue a sufficient no. of books for use throughout the semester and an additional \nno. of books for special reference. It also maintains an E-Resource Section which subscribes \nand maintains a wide collection of highly acclaimed e-journals published by some big names. The \ntotal collection of e-journals in the E-Resource Section numbers to more than 2700 of diverse \ncategories. This section is mainly used for vital information access and research.";

        JTextArea info = new JTextArea(info_string);
        // info.setLineWrap(true);
        info.setBounds(20, 20, 1000, 285);
        info.setBackground(panel_bg);
        info.setFont(new Font("Consolas", 1, 18));
        info.setForeground(font_color);
        panel4.add(info);
    } 
}
