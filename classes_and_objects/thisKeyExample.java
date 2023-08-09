public class thisKeyExample {
    public class Person {
        private String name;
        private int age;

        // constructor with the same name using "this" keyword for constructor chaining
        public Person(String name) {
            this(name, 0); // call the other constructor with "name" and default age 0
        }

        // constructor to initialize both name and age
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // getter method using "this" for accessing the field
        public String getName() {
            return this.name;
        }
    }
}
