public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge >= 0){
            age = initialAge;
        }
        else{
            System.out.println("Age is not valid, setting age to 0.");
            initialAge = 0;
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String statement = "";
        if(age >= 13 && age < 18){
            statement = "You are a teenager.";
        }
        else if(age < 13){
            statement = "You are young.";
        }
        else{
            statement = "You are old.";
        }
        System.out.println(statement);
	}

	public void yearPasses() {
        age++;
	}

