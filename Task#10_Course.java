package Lab07Task10;

public class Course {
    void calculateGrade (int assignments, int exams){
        System.out.printf("Calculating grade of student of %d assignments of %d exams...\n",assignments, exams);
    }
}

class ProgrammingCourse extends Course {
    @Override
    void calculateGrade(int assignments, int exams) {
        System.out.printf("Programming grade of %d assignments of %d exams are: %d\n",assignments,exams,(assignments + exams) * 2); //garde formulas are just for example
    }
}

class MathematicsCourse extends Course {
    @Override
    void calculateGrade(int assignments, int exams) {
        System.out.printf("Math grade of %d assignments of %d exams are: %d\n",assignments,exams,(assignments + exams) * 3);
    }
}

class DesignCourse extends Course {
    @Override
    void calculateGrade(int assignments, int exams) {
        System.out.printf("Design grade of %d assignments of %d exams are: %d\n",assignments,exams,(assignments + exams) * 4);
    }
}

class Main {
    public static void main(String[] args){
        Course[] course = new Course[3];

        course[0] = new ProgrammingCourse();
        course[1] = new MathematicsCourse();
        course[2] = new DesignCourse();

        for (Course crs : course){
            crs.calculateGrade(45,30);
        }

        // if we have different number of exam and assignments for each course then we'll use following method

//        Course c;
//
//        c = new ProgrammingCourse();
//        c.calculateGrade(80, 90);
//
//        c = new MathematicsCourse();
//        c.calculateGrade(75, 85);
//
//        c = new DesignCourse();
//        c.calculateGrade(70, 88);
    }
}