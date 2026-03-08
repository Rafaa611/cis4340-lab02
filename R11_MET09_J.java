/*
Rule: MET09-J
*/

public class R11_MET09_J {

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Person)) {
                return false;
            }
            Person other = (Person) obj;
            return name.equals(other.name);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rafael");
        Person p2 = new Person("Rafael");

        System.out.println(p1.equals(p2));
    }
}