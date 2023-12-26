class static_variable 
{
    public static void main(String[] args)
    {
        student s1 = new student();
        student s2 = new student();

        s1.increment();
        System.out.println(s1.counter);
        s2.increment();
        System.out.println(s2.counter);


        student s3 = new student();
        student s4 = new student();

        s3.increment();
        System.out.println(s1.counter2);
        s4.increment();
        System.out.println(s2.counter2);
    }
}


class student
{
     static int counter = 0;
     int counter2 = 0;

    void increment()
    {
        counter++;
        counter2++;
    }
}