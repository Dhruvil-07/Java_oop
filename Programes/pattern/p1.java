//piramid pattern

/*
 1.) 
 * 
* *
* * *
* * * *
* * * * *


2.) 
    *
   **
  ***
 ****
*****

3.) 
* * * * *
* * * *
* * *
* *
*

4.)
*****
 ****
  ***
   **
    *


5.)
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10

6.) 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

7.)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

8.)
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */


package pattern;
import java.util.Scanner;

class p1
{
    public static void main(String[] args) 
    {
        
        //scanner class object
        Scanner sc = new Scanner(System.in);

        //for user input
        byte row; 
        System.out.println("Enter row : ");
        row = (byte) sc.nextInt();

        //piramid class object
        piramid p = new piramid(row);

        //call methods for print diffrent types of piramids
        p.piramid1();
        System.out.println();
        p.piramid2();
        System.out.println();
        p.piramid3();
        System.out.println();
        p.piramid4();
        System.out.println();
        p.piramid5();
        System.out.println();
        p.piramid6();
        System.out.println();
        p.piramid7();
        System.out.println();
        p.piramid8();
        System.out.println();
        p.piramid9();
    }
}




class piramid
{
    int row;

    piramid(int row)
    {
        this.row = row;
    }


    void piramid1()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1 ; j<=i ; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    void piramid2()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = row ; j>i ; j--)
            {
                System.out.print(" ");
            }

            for(int k = 1 ; k<=i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    void piramid3()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = row ; j>=i ; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
  

    void piramid4()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1; j<i ; j++)
            {
                System.out.print(" ");
            }

            for(int k = row ; k>=i ; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    void piramid5()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    void piramid6()
    {
        for(int i = 1  ; i<=row ;i++)
        {
            for(int j = 1 ; j<=row -i+1 ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    void piramid7()
    {
        int number = 1;
        for(int i = 1 ;i<=row; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }


    void piramid8()
    {
        int num;
        for(int i =1 ; i<=row ;i++)
        {
            num  = ( i % 2 == 0 ? 0 : 1); 
            for(int j = 1 ; j<=i ;  j++)
            {
                System.out.print(num + " ");
                num = (num == 0 ? 1 : 0);
            }
            System.out.println();
        }
    }


    void piramid9()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=i ;j++)
            {
                int sum = i+j;
                if( sum % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }



/*
    void piramid1()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1 ; j<=i ; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
*/

}

