/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Matthew");
        greeting("Amberdingus");
        greeting("Taqqurias#");
        
        double newSalary = raise(100000.62, 3);
        System.out.println(newSalary);
        
        newSalary = raise(newSalary, 6);
        
	}
	private static double raise(double salary, int percent){
	    double amount salary + (salary * (percent/100.0));
	    return amount;
	}
	public static void greeting(String name){
	    System.out.println("Howdy " + name);
	}
	
	
	public static void printAnimal(){
	   System.out.println("((_,...,_))");
	   System.out.println("   |o o|");
	   System.out.println("   \\   /");
	   System.out.println("    ^_^");
	}
}