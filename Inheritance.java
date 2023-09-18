class Marks {
    protected double maths, science, history, english;

    Marks() {
        maths = 0.0;
        science = 0.0;
        history = 0.0;
        english = 0.0;
    }

    Marks(double maths, double science, double history, double english) {
        this.maths = maths;
        this.science = science;
        this.history = history;
        this.english = english;
    }

    double[] getMarks() {
        return new double[]{maths, science, history, english};
    }
}

class Student extends Marks {
    protected String name, address;
    protected int roll_no, sem;

    Student() {
        super();
        this.name = "";
        this.address = "";
        this.roll_no = 0;
        this.sem = 0;
    }

    Student(String name, String address, int roll_no, int sem, double maths, double science, double history, double english) {
        super(maths, science, history, english);
        this.name = name;
        this.address = address;
        this.roll_no = roll_no;
        this.sem = sem;
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    int getSem() {
        return this.sem;
    }

    int getRoll_no() {
        return this.roll_no;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("Xam Mushki", "Anantnag", 2, 3, 79, 82.4, 63, 78.5);
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRoll_no());
//        calling the parent class method using the object of child/subclass class
        double[] marks = student.getMarks();
        System.out.println("Marks\nMathematics: " + marks[0] + "\nScience: " + marks[1] + "\nHistory: " + marks[2] + "\nEnglish: " + marks[3]);
    }
}
