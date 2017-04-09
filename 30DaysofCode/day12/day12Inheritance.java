class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
        Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        int avg = 0;
        for(int i = 0; i < this.testScores.length; i++){
            avg += this.testScores[i];
        }
        avg = avg/(this.testScores.length);
        if(90 <= avg && avg <= 100){
            return 'O';
        }
        else if(80 <= avg && avg < 90){
            return 'E';
        }
        else if(70 <= avg && avg < 80){
            return 'A';
        }
        else if(55 <= avg && avg < 70){
            return 'P';
        }
        else if(40 <= avg && avg < 55){
            return 'D';
        }
        else if(avg < 40){
            return 'T';
        }
        else{
            return ' '; // return no character if not a valid test score calculation
        }
    }
}
