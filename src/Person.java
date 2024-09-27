class Person implements Cloneable {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Deep copy via clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this.name);
    }

    public static void main(String[] args) {
        //Person.java
        Person p1 = new Person("Aman");
        Person p2 = null;  // Deep copy
        try {
            p2 = (Person) p1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p2.name); // Output: "Aman"
        p2.name = "Akash";

        System.out.println(p1.name);  // Output: "Aman"
        System.out.println(p2.name);  // Output: "Akash"

    }
}

