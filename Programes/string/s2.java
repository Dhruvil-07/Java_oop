//String buffer as same as String builder 
//string buffer create mutable objects  and all methos as same as string builder class's method
//but all method are syncronize method
//syncronize methos are thread safe , so they makes performance down

// String builder
//String builder is mutable (you can change stringbuilder obj)
//all method of this class is non syncronized

//for both string builder and string buffer :-
 
//capacity 16 bydefault
//if you will put one extra ch more than capacity capcity increse
//by using this formula (capacity + 1)*2

class s2 
{
    public static void main(String[] args) 
    {
        //default 16 + hii 3
        //total 19
        StringBuilder a = new StringBuilder("hii");
        System.out.println(a.capacity());   

        //put 16 'a' capacity is 19
        //17th 'a' capacity is 40 -> (19+1) * 2 = 40
        a.append("aaaaaaaaaaaaaaaaa");
        System.out.println(a.capacity());
       
        //default 16 + no string passed so here 0
        //total capaciyt 16
        StringBuilder b = new StringBuilder();
        System.out.println(b.capacity());

        //16 'a' , but capactiy is 16
        //17th a capacity is 34 -> (16+1)*2 = 34
        b.append("aaaaaaaaaaaaaaaaa");
        System.out.println(b.capacity());

    }
}
