package practice05;

public class Worker extends Person{
    public Worker(String name, Integer age) {
        super(name, age);
    }


    public String callOverrideMethod()
    {
        //super.introduce();
        return super.introduce();
    }

    public String introduce()
    {
        //Worker tom = new Worker("Tom", 21);
        return(super.introduce()+ " I am a Worker. I have a job.");
        // System.out.println("I am a Worker. I have a job.");
    }

    public static void main(String[] args)
    {
        Worker p = new Worker("Tom",21);
        System.out.println("My name is Tom. I am 21 years old."+ p.introduce());
    }
}

