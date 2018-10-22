package pract6;
public class Student {
    private String name;
    private int finalScore;
    
    Student() {}
    Student(String name, int score) {
        this.name = name;
        this.finalScore = score;
    }
    
    public void setScore(int score) {
        this.finalScore = score;
    }
    
    public int getScore() {
        return this.finalScore;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
