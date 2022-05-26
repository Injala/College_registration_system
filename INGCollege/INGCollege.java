
/**
 * INGCollege class is created to form an interactive GUI.
 * 
 * @ Group C6
 * @author (Injala Karki)
 * @ID (20048897)
 * 
 */

//importing different packages of java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//------main class implementing ActionListener----
public class INGCollege implements ActionListener 
{

    // declaring components of swing as instance variables
    public JFrame frame;
    public JPanel panel1, panel2, panel3;

    // for panel 1
    public JLabel title, info, title1, title2, warn, copyright;
    public JButton Academic, NonAcademic;

    // ------for academic course(panel 2)-----------
    public JLabel courseID, courseName, duration, courseLeader, startDate, completionDate, lecturerName, level, credit,
    numberOfAssessments, aca_copyright;
    public JTextField txtCourseID, txtCourseName, txtDuration, txtCourseLeader, txtStartDate, txtCompletionDate,
    txtLecturerName, txtLevel, txtCredit, txtNumberOfAssessments;
    public JButton add, register, display, clear, Back;

    // ---------for non academic course(panel 3)----------------
    public JLabel courseID1, courseName1, duration1, courseLeader1, startDate1, completionDate1, instructorName1, examDate1,
    prerequisites1, nonaca_copyright;
    public JTextField txtCourseID1, txtCourseName1, txtDuration1, txtCourseLeader1, txtStartDate1, txtCompletionDate1,
    txtInstructorName1, txtExamDate1, txtPrerequisites1;
    public JButton add1, register1, display1, clear1, Back1, remove;

    // creating ArrayList of course type
    ArrayList<Course> AcademicCourseList = new ArrayList<Course>();
    ArrayList<Course> NonAcademicCourseList = new ArrayList<Course>();

    /**
     * 
     * INGCollege() constructor contains all the code for the GUI and anonymous class.
     * It is non-parameterized constructor and has public access modifier.
     * 
     */
    public INGCollege() 
    {
        // creating frame
        frame = new JFrame("Course Registration Form");

        // creating panels
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        // ---------for panel1---------------
        title = new JLabel("Welcome to Islington college!!!");
        info = new JLabel("Choose your course");
        Academic = new JButton("Academic Course");
        NonAcademic = new JButton("Non-Academic Course");
        warn = new JLabel("You must enter your valid information.");
        copyright = new JLabel("  \u00a9 2021 All rights reserved.| Created By Injala Karki ");
        // ------------for panel2--------------

        title1 = new JLabel("Academic Course");

        courseID = new JLabel("Course ID:");
        txtCourseID = new JTextField();

        courseName = new JLabel("Course Name:");
        txtCourseName = new JTextField();

        duration = new JLabel("Duration:");
        txtDuration = new JTextField();

        courseLeader = new JLabel("Course Leader:");
        txtCourseLeader = new JTextField();

        lecturerName = new JLabel("Lecturer Name:");
        txtLecturerName = new JTextField();

        level = new JLabel("Level:");
        txtLevel = new JTextField();

        credit = new JLabel("Credit:");
        txtCredit = new JTextField();

        startDate = new JLabel("Start Date:");
        txtStartDate = new JTextField();

        completionDate = new JLabel("Completion Date:");
        txtCompletionDate = new JTextField();

        numberOfAssessments = new JLabel("Assessments:");
        txtNumberOfAssessments = new JTextField();

        // ----creating buttons-------------
        add = new JButton("Add");
        register = new JButton("Register");
        display = new JButton("Display");
        clear = new JButton("Clear");
        Back = new JButton("Go to Non-Academic");
        aca_copyright = new JLabel(" \u00a9 2021 All rights reserved.| Created By Injala Karki ");

        // -----------panel 3-------------
        title2 = new JLabel("Non-Academic Course");

        courseID1 = new JLabel("Course ID:");
        txtCourseID1 = new JTextField();

        remove = new JButton("Remove");

        courseName1 = new JLabel("Course Name:");
        txtCourseName1 = new JTextField();

        duration1 = new JLabel("Duration:");
        txtDuration1 = new JTextField();

        courseLeader1 = new JLabel("Course Leader:");
        txtCourseLeader1 = new JTextField();

        startDate1 = new JLabel("Start Date:");
        txtStartDate1 = new JTextField();

        completionDate1 = new JLabel("Completion Date:");
        txtCompletionDate1 = new JTextField();

        instructorName1 = new JLabel("Instructor Name:");
        txtInstructorName1 = new JTextField();

        examDate1 = new JLabel("Exam Date:");
        txtExamDate1 = new JTextField();

        prerequisites1 = new JLabel("Prerequisite:");
        txtPrerequisites1 = new JTextField();

        // ----------buttons---------
        add1 = new JButton("Add");
        register1 = new JButton("Register");
        display1 = new JButton("Display");
        clear1 = new JButton("Clear");
        Back1 = new JButton("Go to Academic");
        nonaca_copyright = new JLabel(" \u00a9 2021 All rights reserved.| Created By Injala Karki ");

        // ----adding components to panels---------------

        // -----------for panel 1-----------
        panel1.add(title);
        panel1.add(info);
        panel1.add(Academic);
        panel1.add(NonAcademic);
        panel1.add(warn);
        panel1.add(copyright);

        // ------for second panel---------

        panel2.add(title1);
        panel2.add(courseID);
        panel2.add(txtCourseID);

        panel2.add(courseName);
        panel2.add(txtCourseName);

        panel2.add(duration);
        panel2.add(txtDuration);

        panel2.add(courseLeader);
        panel2.add(txtCourseLeader);

        panel2.add(lecturerName);
        panel2.add(txtLecturerName);

        panel2.add(level);
        panel2.add(txtLevel);

        panel2.add(credit);
        panel2.add(txtCredit);

        panel2.add(startDate);
        panel2.add(txtStartDate);

        panel2.add(completionDate);
        panel2.add(txtCompletionDate);

        panel2.add(numberOfAssessments);
        panel2.add(txtNumberOfAssessments);

        panel2.add(add);

        panel2.add(register);
        panel2.add(display);
        panel2.add(clear);
        panel2.add(Back);
        panel2.add(aca_copyright);

        // ------for third panel-------------
        panel3.add(title2);
        panel3.add(courseID1);
        panel3.add(txtCourseID1);

        panel3.add(courseName1);
        panel3.add(txtCourseName1);

        panel3.add(duration1);
        panel3.add(txtDuration1);

        panel3.add(courseLeader1);
        panel3.add(txtCourseLeader1);

        panel3.add(startDate1);
        panel3.add(txtStartDate1);

        panel3.add(completionDate1);
        panel3.add(txtCompletionDate1);

        panel3.add(instructorName1);
        panel3.add(txtInstructorName1);

        panel3.add(examDate1);
        panel3.add(txtExamDate1);

        panel3.add(prerequisites1);
        panel3.add(txtPrerequisites1);

        panel3.add(remove);
        panel3.add(add1);
        panel3.add(register1);
        panel3.add(display1);
        panel3.add(clear1);
        panel3.add(Back1);
        panel3.add(nonaca_copyright);

        // -----adding all panels to the frame
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        
        //setting size to frame and panel
        frame.setVisible(true);
        frame.setSize(850, 750);
        frame.setLayout(null);
        panel1.setLayout(null);
        panel1.setSize(850, 750);
        panel2.setSize(850, 750);
        panel2.setLayout(null);
        panel3.setSize(850, 750);
        panel3.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //----setting visiblity of panels
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);

        //setting background color of panels
        panel1.setBackground(new Color(7, 59, 76));
        panel2.setBackground(new Color(7, 59, 76));
        panel3.setBackground(new Color(7, 59, 76));

        //setting background and foreground color of academic course panel
        Academic.setBackground(new Color(252, 163, 17));
        NonAcademic.setBackground(new Color(252, 163, 17));
        Academic.setForeground(Color.WHITE);
        NonAcademic.setForeground(Color.WHITE);
        title.setForeground(Color.WHITE);
        info.setForeground(Color.WHITE);
        warn.setForeground(Color.WHITE);
        copyright.setForeground(Color.WHITE);
        courseID.setForeground(Color.WHITE);
        courseLeader.setForeground(Color.WHITE);
        courseName.setForeground(Color.WHITE);
        duration.setForeground(Color.WHITE);
        level.setForeground(Color.WHITE);
        credit.setForeground(Color.WHITE);
        startDate.setForeground(Color.WHITE);
        completionDate.setForeground(Color.WHITE);
        lecturerName.setForeground(Color.WHITE);
        numberOfAssessments.setForeground(Color.WHITE);
        title1.setForeground(Color.WHITE);
        add.setBackground(new Color(255, 209, 102));
        register.setBackground(new Color(255, 209, 102));
        display.setBackground(new Color(255, 209, 102));
        clear.setBackground(new Color(255, 209, 102));
        Back.setBackground(new Color(255, 209, 102));
        aca_copyright.setForeground(Color.WHITE);

        //setting background and foreground color of non-academic course panel
        title2.setForeground(Color.WHITE);
        courseID1.setForeground(Color.WHITE);
        courseLeader1.setForeground(Color.WHITE);
        courseName1.setForeground(Color.WHITE);
        duration1.setForeground(Color.WHITE);
        prerequisites1.setForeground(Color.WHITE);
        startDate1.setForeground(Color.WHITE);
        completionDate1.setForeground(Color.WHITE);
        instructorName1.setForeground(Color.WHITE);
        examDate1.setForeground(Color.WHITE);
        title1.setForeground(Color.WHITE);
        add1.setBackground(new Color(255, 209, 102));
        register1.setBackground(new Color(255, 209, 102));
        display1.setBackground(new Color(255, 209, 102));
        clear1.setBackground(new Color(255, 209, 102));
        Back1.setBackground(new Color(255, 209, 102));
        remove.setBackground(new Color(255, 209, 102));
        nonaca_copyright.setForeground(Color.WHITE);

        // -----adding fonts to the components-----------
        Font fn = new Font("Bookman", Font.BOLD, 35);
        title.setFont(fn);
        title1.setFont(fn);
        title2.setFont(fn);

        Font fn1 = new Font("Bookman", Font.BOLD, 30);
        info.setFont(fn1);

        Font fn2 = new Font("Bookman", Font.BOLD, 25);
        Academic.setFont(fn2);
        NonAcademic.setFont(fn2);

        Font body = new Font("Bookman", Font.BOLD, 20);
        Font btn = new Font("Bookman", Font.BOLD, 23);
        //-------adding fonts for panel 2-----------
        warn.setFont(body);
        courseID.setFont(body);
        txtCourseID.setFont(body);
        courseName.setFont(body);
        txtCourseName.setFont(body);
        duration.setFont(body);
        txtDuration.setFont(body);
        lecturerName.setFont(body);
        txtLecturerName.setFont(body);
        courseLeader.setFont(body);
        txtCourseLeader.setFont(body);
        level.setFont(body);
        txtLevel.setFont(body);
        credit.setFont(body);
        txtCredit.setFont(body);
        startDate.setFont(body);
        txtStartDate.setFont(body);
        completionDate.setFont(body);
        txtCompletionDate.setFont(body);
        numberOfAssessments.setFont(body);
        txtNumberOfAssessments.setFont(body);
        add.setFont(btn);
        register.setFont(btn);
        display.setFont(body);
        clear.setFont(body);
        Back.setFont(body);

        // ------------adding fonts to the components of panel 3----------------
        courseID1.setFont(body);
        txtCourseID1.setFont(body);
        courseName1.setFont(body);
        txtCourseName1.setFont(body);
        duration1.setFont(body);
        txtDuration1.setFont(body);
        courseLeader1.setFont(body);
        txtCourseLeader1.setFont(body);
        instructorName1.setFont(body);
        txtInstructorName1.setFont(body);
        prerequisites1.setFont(body);
        txtPrerequisites1.setFont(body);
        courseLeader.setFont(body);
        txtCourseLeader.setFont(body);
        startDate1.setFont(body);
        txtStartDate1.setFont(body);
        completionDate1.setFont(body);
        txtCompletionDate1.setFont(body);
        examDate1.setFont(body);
        txtExamDate1.setFont(body);
        remove.setFont(btn);
        add1.setFont(btn);
        register1.setFont(btn);
        display1.setFont(body);
        clear1.setFont(body);
        Back1.setFont(body);

        // ---setting size and location of first panel--------
        title.setBounds(180, 100, 600, 50);
        info.setBounds(270, 220, 500, 50);
        Academic.setBounds(230, 300, 400, 60);
        NonAcademic.setBounds(230, 370, 400, 60);
        warn.setBounds(250, 450, 500, 30);
        copyright.setBounds(290, 650, 500, 30);

        // ---------setting size and location for academic panel--------
        title1.setBounds(250, 40, 300, 30);
        courseID.setBounds(40, 110, 100, 30);
        txtCourseID.setBounds(190, 110, 200, 30);

        duration.setBounds(430, 210, 150, 30);
        txtDuration.setBounds(600, 210, 200, 30);

        courseName.setBounds(40, 160, 150, 30);
        txtCourseName.setBounds(190, 160, 200, 30);

        level.setBounds(40, 210, 80, 30);
        txtLevel.setBounds(190, 210, 200, 30);

        credit.setBounds(430, 260, 80, 30);
        txtCredit.setBounds(600, 260, 200, 30);

        numberOfAssessments.setBounds(40, 260, 150, 30);
        txtNumberOfAssessments.setBounds(190, 260, 200, 30);

        add.setBounds(300, 320, 150, 40);

        courseLeader.setBounds(40, 400, 150, 30);
        txtCourseLeader.setBounds(190, 400, 200, 30);

        lecturerName.setBounds(430, 400, 150, 30);
        txtLecturerName.setBounds(600, 400, 200, 30);

        startDate.setBounds(40, 450, 100, 30);
        txtStartDate.setBounds(190, 450, 200, 30);

        completionDate.setBounds(430, 450, 200, 30);
        txtCompletionDate.setBounds(600, 450, 200, 30);

        register.setBounds(300, 510, 150, 40);

        Back.setBounds(40, 640, 250, 30);
        display.setBounds(480, 590, 150, 30);
        clear.setBounds(650, 590, 150, 30);
        aca_copyright.setBounds(290, 670, 500, 30);

        // -----------setting size and location for non academic panel

        title2.setBounds(240, 40, 400, 30);

        courseID1.setBounds(40, 110, 100, 30);
        txtCourseID1.setBounds(190, 110, 200, 30);

        remove.setBounds(620, 110, 150, 40);

        courseName1.setBounds(430, 210, 150, 30);
        txtCourseName1.setBounds(600, 210, 200, 30);

        duration1.setBounds(40, 160, 100, 30);
        txtDuration1.setBounds(190, 160, 200, 30);

        prerequisites1.setBounds(40, 210, 150, 30);
        txtPrerequisites1.setBounds(190, 210, 200, 30);

        add1.setBounds(300, 270, 150, 40);

        courseLeader1.setBounds(40, 340, 150, 30);
        txtCourseLeader1.setBounds(190, 340, 200, 30);

        instructorName1.setBounds(430, 340, 200, 30);
        txtInstructorName1.setBounds(600, 340, 200, 30);

        startDate1.setBounds(40, 390, 100, 30);
        txtStartDate1.setBounds(190, 390, 200, 30);

        completionDate1.setBounds(430, 390, 200, 30);
        txtCompletionDate1.setBounds(600, 390, 200, 30);

        examDate1.setBounds(40, 450, 150, 30);
        txtExamDate1.setBounds(190, 450, 200, 30);

        register1.setBounds(300, 520, 150, 40);
        Back1.setBounds(40, 640, 250, 30);
        display1.setBounds(480, 590, 150, 30);
        clear1.setBounds(650, 590, 150, 30);
        nonaca_copyright.setBounds(290, 670, 500, 30);

        //using ActionListener for academic, NonAcademic, Back, Back1, clear, clear1 and passing parameter to it
        Academic.addActionListener(this);
        NonAcademic.addActionListener(this);
        Back.addActionListener(this);
        Back1.addActionListener(this);
        clear.addActionListener(this);
        clear1.addActionListener(this);

            // -------------Anonymous class for add button(academic)-------------------
            add.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent o) 
                {
                    int add_duration = 0;
                    int add_numOfAssessments = 0;
                    int add_Credit = 0;
                    //checking if any text fields are empty
                    if (txtCourseID.getText().isEmpty() || txtCourseName.getText().isEmpty()
                    || txtDuration.getText().isEmpty() || txtLevel.getText().isEmpty()
                    || txtCredit.getText().isEmpty() || txtNumberOfAssessments.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame,"<Html>Some fields may be empty!!! <br> Please re-enter the data", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    } 
                    else {
                        String add_courseID = txtCourseID.getText();
                        String add_courseName = txtCourseName.getText();
                        String add_level = txtLevel.getText();
                        //---applying try-catch for exception handling
                        try {
                            add_duration = Integer.parseInt(txtDuration.getText());

                        } 
                        catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(frame, "Please enter valid data type" , "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        try {
                            add_numOfAssessments = Integer.parseInt(txtNumberOfAssessments.getText());

                        } 
                        catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(frame, "Please enter valid data type", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        try {
                            add_Credit = Integer.parseInt(txtCredit.getText());

                        } 
                        catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(frame, "Please enter valid data type", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        //using for-each loop
                        for (Course ic : AcademicCourseList) {
                            if (ic.getCourseID().equals(add_courseID)) {
                                JOptionPane.showMessageDialog(frame, "The course is already added!!");
                                return;
                            }
                        }
                        //creating object of AcademicCourse
                        AcademicCourse obj = new AcademicCourse(add_courseID, add_courseName, add_level, "" + add_Credit,
                                add_duration, add_numOfAssessments);
                        AcademicCourseList.add(obj);
                        JOptionPane.showMessageDialog(frame, "The course is sucessfully added!");

                    }

                }
            });

            // -------------Anonymous class for add button(non-academic)-------------------
            add1.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent k) 
                {
                    int add_duration = 0;
                    //checking if text fields are empty
                    if (txtCourseID1.getText().isEmpty() || txtCourseName1.getText().isEmpty()
                    || txtDuration1.getText().isEmpty() || txtPrerequisites1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame,"<Html>Some fields may be empty!!! <br> Please re-enter the data", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    } 
                    else {
                        //---applying try-catch for exception handling
                        try {
                            add_duration = Integer.parseInt(txtDuration1.getText()); //converting the text field value of duration to integer
                        } 
                        catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(frame, "Please enter valid data type.", "Alert", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        String add_courseID = txtCourseID1.getText();
                        String add_courseName = txtCourseName1.getText();
                        String add_prerequisites = txtPrerequisites1.getText();

                        //for-each loop
                        for (Course nic : NonAcademicCourseList) {
                            if (nic.getCourseID().equals(add_courseID)) {
                                JOptionPane.showMessageDialog(frame, "The course is already added!");
                                return;
                            }
                        }
                        //creating object of NonAcademicCourse
                        NonAcademicCourse obj = new NonAcademicCourse(add_courseID, add_courseName, add_duration,
                                add_prerequisites);
                        NonAcademicCourseList.add(obj);
                        JOptionPane.showMessageDialog(frame, "The course is sucessfully added!");
                    }
                }
            });

            // -------------Anonymous class for register button(academic)-------------------
            register.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent s) 
                {
                    if (txtCourseID.getText().isEmpty() || txtCourseName.getText().isEmpty()
                    || txtDuration.getText().isEmpty() || txtLevel.getText().isEmpty()
                    || txtCredit.getText().isEmpty() || txtNumberOfAssessments.getText().isEmpty()
                    || txtStartDate.getText().isEmpty() || txtCompletionDate.getText().isEmpty()
                    || txtCourseLeader.getText().isEmpty() || txtLecturerName.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "<Html>Some fields may be empty!!! <br> Please re-enter the data", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    } 
                    else {
                        String reg_courseId = txtCourseID.getText();
                        for (int i = 0; i < AcademicCourseList.size(); i++) {
                            //creating object by downcasting
                            AcademicCourse ac = (AcademicCourse) AcademicCourseList.get(i);

                            boolean isregistered = ac.getisRegistered();
                            if (reg_courseId.equals(AcademicCourseList.get(i).getCourseID())) {
                                if (isregistered == false) {
                                    String reg_courseleader = txtCourseLeader.getText();
                                    String reg_lecturername = txtLecturerName.getText();
                                    String reg_startingdate = txtStartDate.getText();
                                    String reg_completiondate = txtCompletionDate.getText();
                                    //calling register method from academic course
                                    ac.register(reg_courseleader, reg_lecturername, reg_startingdate, reg_completiondate);
                                    JOptionPane.showMessageDialog(frame, "The course is sucessfully registered!!");
                                    return;
                                } 
                                else {
                                    JOptionPane.showMessageDialog(frame, "The course is already registered!");
                                    return;
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(frame, "<Html>Invalid data!! <br> Please check again.", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            });

            // -------------Anonymous class for register button(non-academic)-------------------
            register1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent r) 
                {
                    //checking if any text fields are empty
                    if (txtCourseID1.getText().isEmpty() || txtCourseName1.getText().isEmpty()
                    || txtDuration1.getText().isEmpty() || txtPrerequisites1.getText().isEmpty()
                    || txtCourseLeader1.getText().isEmpty() || txtInstructorName1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "<Html>Some fields may be empty!!! <br> Please re-enter the data", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    } 
                    else {
                        String courseId1= txtCourseID1.getText();
                        for(int i = 0; i < NonAcademicCourseList.size(); i++) {
                            NonAcademicCourse nac = (NonAcademicCourse) NonAcademicCourseList.get(i);
                            if(courseId1.equals(NonAcademicCourseList.get(i).getCourseID())) {
                                if(nac.getIsRegistered() == false){
                                    String courseleader1 = txtCourseLeader1.getText();
                                    String instructorName1 = txtInstructorName1.getText();
                                    String startingdate1 = txtStartDate1.getText();
                                    String completiondate1   = txtCompletionDate1.getText();
                                    String examdate1   = txtExamDate1.getText();
                                    //calling register method from non-academic course
                                    nac.register(courseleader1,instructorName1,startingdate1,completiondate1, examdate1);
                                    JOptionPane.showMessageDialog(frame,"The course is sucessfully registered!!");
                                    return;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"The course is already registered!");
                                    return;
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(frame, "Invalid data!!Please check again.", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            });

            // -------------Anonymous class for remove button(non-academic)-------------------
            remove.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent t)
                {
                    if (txtCourseID1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "<Html>Some fields may be empty!!! <br> Please re-enter the data", "Alert", JOptionPane.WARNING_MESSAGE);
                        return;
                    } 
                    else {
                        String rem_courseId1 = txtCourseID1.getText();
                        Iterator<Course> itr = NonAcademicCourseList.iterator(); //traversing the array list value
                        //checking if the array list has another object or not
                        while (itr.hasNext()) {
                            NonAcademicCourse non_ac = (NonAcademicCourse) itr.next();
                            if (rem_courseId1.equals(non_ac.getCourseID())) {
                                if (non_ac.getIsRemoved() == false) {
                                    //calling remove method from non-academic course
                                    non_ac.remove();
                                    NonAcademicCourseList.remove(non_ac);
                                    JOptionPane.showMessageDialog(frame, "This course is removed.");
                                    return;
                                }
                            }

                        }

                        JOptionPane.showMessageDialog(frame, "Your course ID is not added!!");
                        return;

                    }
                }
            });

            // -------------Anonymous class for display button(academic)-------------------
            display.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent p) 
                {
                    JFrame displayAcademic = new JFrame("Details of Academic Course");
                    String [][]academic_data = new String[AcademicCourseList.size()][10];

                    for(int i = 0; i < AcademicCourseList.size(); i++) {
                        //creating object of AcademicCourse
                        AcademicCourse ac = (AcademicCourse)AcademicCourseList.get(i);
                        for(int j = 0; j<10; j++){
                            if( j == 0){
                                academic_data[i][j] = ac.getCourseID(); 
                            }
                            else if(j == 1){
                                academic_data[i][j] = ac.getCourseName();
                            }
                            else if( j == 2){
                                String duration =Integer.toString(ac.getDuration());
                                academic_data[i][j] = duration ;
                            }
                            else if( j == 3){
                                academic_data[i][j] = ac.getLevel();
                            }
                            else if( j == 4){
                                academic_data[i][j] = ac.getCredit();
                            }
                            else if( j == 5){
                                academic_data[i][j] = Integer.toString(ac.getNoOfAssessments ()); 
                            }
                            else if( j == 6){
                                academic_data[i][j] = ac.getCourseLeader();
                            }
                            else if( j == 7){
                                academic_data[i][j] = ac.getLecturerName();
                            }
                            else if( j == 8){
                                academic_data[i][j] = ac.getStartingDate();
                            }
                            else if( j == 9){
                                academic_data[i][j] = ac.getCompletionDate();
                            }
                        }
                    }
                    String column[]={"Course ID","Course Name","Duration","Level","Credit","Assessments","Course Leader","Lecturer Name","Starting Date","Completion Date"};

                    //creating JTable for display
                    JTable jtable=new JTable(academic_data,column);    
                    jtable.setBounds(30,40,500,300);          
                    JScrollPane spane=new JScrollPane(jtable); 
                    displayAcademic.add(spane);    

                    displayAcademic.setSize(1000,500);
                    displayAcademic.setVisible(true);
                    displayAcademic.setLayout(null);

                }
            });

            // -------------Anonymous class for display button(non-academic)-------------------
            display1.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent q)
                {
                    JFrame displaynonAcademic = new JFrame("Details of Non Academic Course");
                    String [][]nonAcademic_data = new String[NonAcademicCourseList.size()][9];
                    for(int i = 0; i < NonAcademicCourseList.size(); i++){
                        NonAcademicCourse nonac = (NonAcademicCourse)NonAcademicCourseList.get(i);
                        for(int j = 0; j<9; j++){
                            if( j == 0){
                                nonAcademic_data[i][j] = nonac.getCourseID(); 
                            }
                            else if(j == 1){
                                nonAcademic_data[i][j] = nonac.getCourseName();
                            }
                            else if( j == 2){
                                String duration =Integer.toString(nonac.getDuration());
                                nonAcademic_data[i][j] = duration ;
                            }
                            else if( j == 3){
                                nonAcademic_data[i][j] = nonac.getInstructorName();
                            }
                            else if( j == 4){
                                nonAcademic_data[i][j] = nonac.getStartingDate();
                            }
                            else if( j == 5){
                                nonAcademic_data[i][j] = nonac.getCompletionDate(); 
                            }
                            else if( j == 6){
                                nonAcademic_data[i][j] = nonac.getExamDate();
                            }
                            else if( j == 7){
                                nonAcademic_data[i][j] = nonac.getPrerequisite();
                            }
                            else if( j == 8){
                                nonAcademic_data[i][j] = nonac.getCourseLeader();
                            }
                        }
                    }

                    String column[]={"Course ID","Course Name","Duration","Instructor Name","Starting Date","Completion Date","Exam Date","Prerequisite","Course Leader"};
    
                    //creating JTable for display
                    JTable jtable1=new JTable(nonAcademic_data,column);    
                    jtable1.setBounds(30,40,500,300);          
                    JScrollPane spane1 =new JScrollPane(jtable1); 
                    displaynonAcademic.add(spane1);  

                    displaynonAcademic.setSize(1000,500);
                    displaynonAcademic.setVisible(true);
                    displaynonAcademic.setLayout(null);
                }

            });
            
    }
 
    /**
     * 
     * This is the method for registering clear buttons and panel switch.
     * 
     * @param ActionEvent is the event class for ActionListener.
     */
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == clear) {
            //conformation dialog box with yes and no option
            int v = JOptionPane.showConfirmDialog(frame, "Do you want to clear the fields?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(v==JOptionPane.YES_OPTION){
                clear_academic();
            } 

        }
        else if (e.getSource() == clear1) {
            //conformation dialog box with yes and no option
            int w = JOptionPane.showConfirmDialog(frame,  "Do you want to clear the fields?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(w==JOptionPane.YES_OPTION){
                clear_nonacademic();
            }
        }

        //------for switching panel------------------
        else if (e.getSource() == Academic || e.getSource() == Back1) {
            panel1.setVisible(false);
            panel2.setVisible(true);
            panel3.setVisible(false);

        } 
        else if (e.getSource() == NonAcademic || e.getSource() == Back) {
            panel3.setVisible(true);
            panel1.setVisible(false);
            panel2.setVisible(false);
        }
    }

    /**
     * 
     * The clear method here clears the text fields of academic course panel.
     */
    public void clear_academic() 
    {
        txtCourseID.setText("");
        txtCourseName.setText("");
        txtDuration.setText("");
        txtCourseLeader.setText("");
        txtLevel.setText("");
        txtCredit.setText("");
        txtStartDate.setText("");
        txtCompletionDate.setText("");
        txtLecturerName.setText("");
        txtNumberOfAssessments.setText("");
    }

    /**
     * 
     * The clear method here clears the text fields of academic course panel.
     */
    public void clear_nonacademic() 
    {
        txtCourseID1.setText("");
        txtCourseName1.setText("");
        txtDuration1.setText("");
        txtCourseLeader1.setText("");
        txtPrerequisites1.setText("");
        txtStartDate1.setText("");
        txtCompletionDate1.setText("");
        txtInstructorName1.setText("");
        txtExamDate1.setText("");
    }

    /**
     * 
     * This is the main method.The constructor INGCollege() is called here.
     * 
     * 
     * @param String[] is used to store array of string data type.
     * @param args The command line arguments.
     * @throws java.io.IOException when we call the null object.
     */
    public static void main(String[] args) 
    {
        new INGCollege();
    }
}