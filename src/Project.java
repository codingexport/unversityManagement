
/**
 *
 * @author Akhilesh
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        //New Informationn
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New information");
        mb.add(newInformation);
        newInformation.setForeground(Color.BLUE);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        JMenuItem newFacultyInformation = new JMenuItem("New Student Information");
        newFacultyInformation.addActionListener(this);
        newInformation.add(newFacultyInformation);
        //Details
        JMenu Details = new JMenu("View details");
        mb.add(Details);
        Details.setForeground(Color.RED);

        JMenuItem facultyDetails = new JMenuItem("View  Teacher Details");
        facultyDetails.addActionListener(this);
        Details.add(facultyDetails);
        JMenuItem Studentsdetails = new JMenuItem("View Students Details");
        Studentsdetails.addActionListener(this);
        Details.add(Studentsdetails);

        //leave 
        JMenu Leave = new JMenu("Apply leave");
        mb.add(Leave);
        Leave.setForeground(Color.black);

        JMenuItem facultyleave = new JMenuItem("Faculty leave");
        facultyleave.addActionListener(this);
        Leave.add(facultyleave);
        JMenuItem Studentsleave = new JMenuItem("Students leave");
        Studentsleave.addActionListener(this);
        Leave.add(Studentsleave);

        //leave details
        JMenu Leavedetails = new JMenu(" Leave Details");
        mb.add(Leavedetails);
        Leavedetails.setForeground(Color.BLUE);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty leave Details");
        facultyleavedetails.addActionListener(this);
        Leavedetails.add(facultyleavedetails);
        JMenuItem Studentsleavedetails = new JMenuItem("Students leave Details");
        Studentsleavedetails.addActionListener(this);
        Leavedetails.add(Studentsleavedetails);

        //Exam
        JMenu exam = new JMenu(" Examination");
        mb.add(exam);
        exam.setForeground(Color.BLACK);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Details");
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);
        JMenuItem EnterMark = new JMenuItem("Enter Marks");
        EnterMark.addActionListener(this);
        exam.add(EnterMark);

        //Updeation
        JMenu Updeationn = new JMenu(" Updeation");
        mb.add(Updeationn);
        exam.setForeground(Color.RED);

        JMenuItem UpdeateFacultyDetail = new JMenuItem("Updeate Faculty Details");
        UpdeateFacultyDetail.addActionListener(this);
        Updeationn.add(UpdeateFacultyDetail);
        JMenuItem UpdeateStudentDetail = new JMenuItem("Updeate Student Details");
        UpdeateStudentDetail.addActionListener(this);
        Updeationn.add(UpdeateStudentDetail);

        //Fees
        JMenu Fees = new JMenu("Fees Details");
        Fees.addActionListener(this);
        mb.add(Fees);
        Fees.setForeground(Color.BLUE);

        JMenuItem Feestructure = new JMenuItem("Fees Structure");
        Feestructure.addActionListener(this);
        Fees.add(Feestructure);

        JMenuItem FeesForm = new JMenuItem("Fees Form");
        FeesForm.addActionListener(this);
        Fees.add(FeesForm);

        //Utility
        JMenu Utility = new JMenu("Utitlity");
        mb.add(Utility);
        Utility.setForeground(Color.RED);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Utility.add(Notepad);
        Notepad.addActionListener(this);
        JMenuItem calc = new JMenuItem("Calculator");
        Utility.add(calc);
        calc.addActionListener(this);

        //About
        JMenu about = new JMenu("About");
        mb.add(about);
        about.setForeground(Color.DARK_GRAY);

        JMenuItem ab = new JMenuItem("About");
        about.add(ab);
        ab.addActionListener(this);
        setJMenuBar(mb);

        //Exit
        JMenu Exit = new JMenu("Exit");
        mb.add(Exit);
        Exit.setForeground(Color.cyan);

        JMenuItem Exits = new JMenuItem("Exit");
        Exit.add(Exits);
        Exits.addActionListener(this);
        setJMenuBar(mb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }

        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }

        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Students Details")) {
            new StudentDetails();
        } else if (msg.equals("View  Teacher Details")) {
            new AddTeacherDetails();
        } else if (msg.equals("Faculty leave")) {
            new TeacherLeave();
        } else if (msg.equals("Students leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Students leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Updeate Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Updeate Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Examination Details")) {
            new ExaminationDetails();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Fees Form")) {
            new StudentFeeForm();
        } else if (msg.equals("About")) {
            new About();
        }
         else if (msg.equals("Fees Structure")) {
            new FeeStructure();
        }
    }

    public static void main(String args[]) {
        new Project();
    }
}
