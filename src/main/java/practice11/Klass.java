package practice11;

public class Klass {

    int number;
    Student leader;
    String displayname;
    Teacher teacher;
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
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void assignLeader(Student leader){
        if(leader.getKlass().getNumber()!=this.number ){
            System.out.print("It is not one of us.\n");
        }
        else{
            this.leader=leader;
            if(this.teacher!=null){
                teacher.observeNewjleader(leader,this);
            }
        }
    }
    public Student getLeader(){
        //Student student=new Student(0,"none",0,this);
        if(leader!=null){
            return leader;
        }
        else
            return null;
    }
    public void appendMember(Student student){
        student.klass.setNumber(this.number);
        if(this.teacher!=null){
            teacher.observeNewjoin(student,this);
        }
    }
}

