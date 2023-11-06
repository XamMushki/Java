import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class AWTExample extends Frame implements ActionListener, FocusListener {
    TextField t_name, t_dept, t_sem, t_rollno;
    Label notification;

    AWTExample() {
        setSize(500, 500);
        setTitle("Hello World!");
        setLayout(null);

        Button b = new Button("Click me");
        Label nameLabel = new Label("Name");
        Label deptLabel = new Label("Department");
        Label semLabel = new Label("Semester");
        Label rollnoLabel = new Label("Roll No.");
        notification = new Label();
        t_name = new TextField();
        t_dept = new TextField();
        t_sem = new TextField();
        t_rollno = new TextField();

        nameLabel.setBounds(30, 100, 80, 30);
        deptLabel.setBounds(30, 140, 80, 30);
        semLabel.setBounds(30, 180, 80, 30);
        rollnoLabel.setBounds(30, 220, 80, 30);

        t_name.setBounds(130, 100, 200, 30);
        t_dept.setBounds(130, 140, 200, 30);
        t_sem.setBounds(130, 180, 200, 30);
        t_rollno.setBounds(130, 220, 200, 30);

        t_name.addFocusListener(this);
        t_dept.addFocusListener(this);
        t_sem.addFocusListener(this);
        t_rollno.addFocusListener(this);

        b.setBounds(150, 260, 120, 30);
        b.addActionListener(this);
        b.setActionCommand("clicked");

        notification.setBounds(10, 300, 480, 30);

        add(nameLabel);
        add(deptLabel);
        add(semLabel);
        add(rollnoLabel);
        add(t_name);
        add(t_dept);
        add(t_sem);
        add(t_rollno);
        add(b);
        add(notification);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.toString());
        if (e.getActionCommand().equals("clicked")) {
            String name, dept, sem, rollno;
            name = t_name.getText();
            dept = t_dept.getText();
            sem = t_sem.getText();
            rollno = t_rollno.getText();
            if (name.length() <= 0 && dept.length() <= 0 && sem.length() <= 0 && rollno.length() <= 0) {
                notification.setText("Please Enter Details first!!!");
            }else{
                System.out.println("Details:\nName: " + name + "\nDepartment: " + dept +
                        "\nSemester: " + sem + "\nRoll No.: " + rollno);

                notification.setText("Details submitted successfully");
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        notification.setText(null);
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}

class JavaAwt {
    public static void main(String[] args) {
        AWTExample f = new AWTExample();
    }

}