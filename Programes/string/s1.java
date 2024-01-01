// == check object rerfrence
// equals() check contat of object

package string;

class s1
{
    public static void main(String[] args) {
        
       //two diffrent obj with same refrence 
       //== check reference of objects , so it will return true 
       String a = "hii";
       String b = "hii";

       if(a == b)
       {
         System.out.println("true");
       }
       else
       {
        System.out.println("false");
       }


       //two diffrent obj with diffrent refrences 
       // == check refrences of obj , so it will return false
       String c = new String("hii");
       String d = new String("hii");
       if(c == d)
       {
        System.out.println("true");
       }
       else
       {
         System.out.println("false");
       }



       //equal method always check content
       //even two obj has same refrence or not
       //both cases , which are written below will provide result as a true
       if(a.equals(b))
       {
        System.out.println("true");
       }
       else
       {
        System.out.println("fasle");
       }


       if(c.equals(d))
       {
        System.out.println("true");
       }
       else
       {
        System.out.println("false");
       }
    }
}
