package practice03;

public class Worker extends Person{

    public Worker(String name, Integer age) {
        super(name, age);
    }
    public String introduce()
    {
        Worker tom = new Worker("Tom", 21);
        return("I am a Worker. I have a job.");
    }
    public static void main(String[] args)
    {
        Worker p = new Worker("Tom",21);
        System.out.println(p.introduce());
    }
}
