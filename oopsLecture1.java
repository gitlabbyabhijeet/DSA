public class oopsLecture1 {

   public static class A{
        final int VAL = 9;
        String name;

        public A(String name){
            // System.out.println("Object is created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            //any object of class A is free from memory then this finalize funation is called
            System.out.println("Object is destroyed");
        }

        
    }

    //Create a class
    //for every single student
    public static class Student{
        String name;
        int roll;
        float marks;

        void greeting(){
            System.out.println("Good Morning "+name);
        }


        void changename(String newName){
            this.name = newName;
        }

        public Student(Student other) {
            this.name = other.name;
            this.roll = other.roll;
            this.marks = other.marks;
        }

        public Student() {
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }

        

        public Student(String name, int roll, float marks){
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }

    }
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];

        // stores 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

 
       // Student[] students = new Student[5];
        //Instance Variable --> Variable that are decelered inside the class is called instance variable like if we creata a student_1 object of class name Student roll no, name and marks
        //Constructors ----> It basically defines what happens when an object is created and we need to initialize or pass the value of instance variabel in the object during the creation of the object
         Student s1 = new Student("Kunal Kushwaha",12,88.5f);
         Student s2 = new Student("Deepak",46,93.6f);
         System.out.println(s1.name);
         System.out.println(s1.roll);
         System.out.println(s1.marks);
         s1.changename("Mohit");
         s1.greeting();
         System.out.println();
         System.out.println("***********************************************");
         System.out.println();
         System.out.println(s2.name);
         System.out.println(s2.roll);
         System.out.println(s2.marks);
         s2.changename("Rohan");
         s2.greeting();

         
         Student random = new Student(s1);
         System.out.println("RANDOM DATA : "+random.name+" "+random.marks+" "+random.roll);

         //Final keyword ======> final keyword is a keyword which do not allow further modification of our content
         //if the data type of final is not primitive then we can change the value of the variabl
         //i.e---->>
         //final Student kunal = new Student();
         //kunal.name = "new name";

         final int VALUE = 6;
         //  VALUE = 7;
         System.out.println("value : "+ VALUE);
        final A kunal = new A("kunal kushwaha");
        kunal.name = "Mohit Gupta";
        //When a non primitive is final you cannot ressign it;
        //kunal = new A("other name");
        System.out.println(kunal.name);

        A obj;
        for(int i=0; i<10000000; i++){
            obj = new A("Random name");
        }
        
    }
}

