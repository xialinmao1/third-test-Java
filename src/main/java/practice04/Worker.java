package practice04;

public class Worker extends Person{
    String shuchu;
    public Worker(String name, Integer age) {
        super(name, age);
    }

    public String introduce()
    {
        Worker tom = new Worker("Tom", 21);
        return(super.introduce()+ " I am a Worker. I have a job.");
       // System.out.println("I am a Worker. I have a job.");
    }

    public String callOverrideMethod()
    {
        super.introduce();
        return super.introduce();
    }

    public static void main(String[] args)
    {
        Worker p = new Worker("Tom",21);
        System.out.println(p.callOverrideMethod()+ p.introduce());
    }
}
