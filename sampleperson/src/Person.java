package sampleperson.src;

public class Person {
    String fname;
    String lname;
    String bday;
    int age;
    String gender;
    
    Person(String fname, String lname, String bday, int age, String gender){
        this.fname = fname;
        this.lname = lname;
        this.bday = bday;
        this.age = age;
        this.gender = gender;
        
    }
    
    void pInfo(){
        System.out.println("\n");
        System.out.println("----- Personal Info -----");
        System.out.println("Name: "+fname+ " " +lname);
        System.out.println("Birthday: "+bday);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
    
}