package practice07;

public class Klass {
    int number;
    String displayname;

    public Klass(int number){
        this.number=number;
    }

    public int getNumber(){
        return number;
    }

    public String getDisplayName(){
        displayname="Class "+number;
        return displayname;
    }
}
