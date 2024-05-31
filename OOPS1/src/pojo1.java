public class pojo1 {
    public class Student {

        private String id;
        private String name;
        private String dateOfBirth;
        private String classList;


        public Student(){
            this("5653","sharaddd","2435","2esf");
        }

        public Student(String id, String name, String dateOfBirth, String classList) {
            this.id = id;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.classList = classList;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", classList='" + classList + '\'' +
                    '}';
        }
    }

    public  void main(String[] args) {
        for(int i=1;i<=5;i++){
            Student s = new Student("2206383","marry","5/7/2003","CSE B");
        }
    }
}

