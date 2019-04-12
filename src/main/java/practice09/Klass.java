package practice09;

public class Klass {
    private Integer number;
    public Student leader;
    private String displayname;

    public void setNumber(Integer number){ this.number = number;}
    public Integer getNumber(){ return number;}

    public void setLeader(Student leader) { this.leader = leader; }
    public Student getLeader() { return leader; }

    public void setDisplayname(String displayname) { this.displayname = displayname; }

    public String getDisplayName(){
        displayname="Class "+ number;
        return displayname;}

    public Klass(Integer number){this.number = number;}

    public void assignLeader(Student leader){
        if(leader.getKlass().getNumber()!=this.number ){
            System.out.print("It is not one of us.\n");
        }
        else{
            this.leader=leader;
        }
    }

}
