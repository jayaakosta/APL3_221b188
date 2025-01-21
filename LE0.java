/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class LE0
{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
	public static void main(String[] args) {
	    LE0 person = new LE0();
	    person.setName("Jaya Kosta");
	    person.setAge(20);
	    
	    String name = person.getName();
        int age = person.getAge();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
	}
}
