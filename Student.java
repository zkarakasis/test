public class Student {
    private String name;
    private String regNumber;
    private int stageOfStudies;
    private int credits;

    public Student(String name, String regNumber, int stageOfStudies, int credits){
        setName(name);
        setRegNumber(regNumber);
        setStageOfStudies(stageOfStudies);
        setCredits(credits);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public void setStageOfStudies(int stageOfStudies){
        this.stageOfStudies = stageOfStudies;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

    public String getName(){
        return name;
    }

    public String getRegNumber(){
        return regNumber;
    }

    public int getStageOfStudies(){
        return stageOfStudies;
    }

    public int getCredits(){
        return credits;
    }

    public boolean doesStudentPass(){
        return credits == 120;
    }

     public void newStage(){
        if(doesStudentPass){
            stage++;
            credits = 0;
        }
     }

     public void passModule(int moduleCredits){
        stage += moduleCredits;
        if(credits == 120){
            newStage();
        }
     }






}
