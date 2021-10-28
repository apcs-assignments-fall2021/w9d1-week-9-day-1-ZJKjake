public class Bird {
    private String birdName;
    private int birdAge;
    private String birdColor;
    public Bird(String a,int b,String c){
        birdName=a;
        birdAge=b;
        birdColor=c;
    }
    public void grow(){
        birdAge = birdAge + 1;
    }
    public void setAge(int x){
        birdAge = x;
    }
    public String getName(){
        return birdName;
    }
    public int getAge() {
        return birdAge;
    }
    public String getColor() {
        return birdColor;
    }
    public void paintColor(String x) {
        birdColor=x;
    }
    public void setNewName(String n) {
        birdName=n;
    }
    public String getBirdInfo() {
        return ("Your bird is called "+birdName+", and it is "+birdAge+" years old! It's color is "+birdColor+"!");
    }
}
