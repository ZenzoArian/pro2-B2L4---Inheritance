public class B2L4_inheritance {
    public static void main(String[] args){


        Parent pa1 = new Parent();
        Second_Year_Student secSt1 = new Second_Year_Student();
        Person p1 = new Person();
        //  p1.setYear();

        //p1.name = "henk";
        //System.out.println(p1.name);

        p1.setName("Erwin");
        System.out.println(p1.getName());


        pa1.setChild(3);
        System.out.println(pa1.getChild());


        secSt1.setPets(3);
        System.out.println(secSt1.getPets());


        Student s1 = new Student();
        s1.setName("Henk");



/*        Person[] people = {
                new Teacher(),
                new Student()
        };
        Teacher t = (Teacher)people[0];
        t.setName("Erwin");
        t.setIq(130);
        t.addDiploma("HBO gamedesign & Development (HKU)");
        Student s = (Student)people[1];
        s.setName("Hendrik");
        s.setIq(130);
        s.addCourse("PRO2");
        s.addDiploma("VMBO T");
        for (Person person : people) {
            System.out.println(person.getName() + " has an IQ of " + person.getIq() + " and has the following diplomas " + person.getDiplomas());
        }
*/
    }
}