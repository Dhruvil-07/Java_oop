import java.util.Scanner;

class pelindromnum
{
    public static void main(String[] args) {
        
    //scnner class obj
    Scanner sc = new Scanner(System.in);

    ///var for user input
    int num;

    System.out.println("Enter number :");
    num  = sc.nextInt();

    //varable for check pelindrom or not
    int rem , ren ,  rev;
    rev  = 0;
    ren = num;

    while(ren > 0)
    {
        rem = ren % 10;
        rev = (10 * rev)  + rem;
        ren =  ren / 10;
        //System.out.println(rev);
    }

    //it apply , when while condition is like (ren > 10)
    //for last reminder
    //rev = (10 *  rev) + 1;
    //System.out.println(rev);

    if(rev == num)
    {
        System.out.println("number is pelindrom");
    }
    else
    {
        System.out.println("number is not pelindrom");
    }

    }
}