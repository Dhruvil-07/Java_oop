//advance pattern programes

package pattern;
import java.util.Scanner;

/*
 1.) butter fly
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    **********
    ****  ****
    ***    ***
    **      **
    *        *

2.) solid rhombus
    *****
   *****
  *****
 *****
*****


3.) number piramid
    1
   2 2
  3 3 3
 4 4 4 4 
5 5 5 5 5


4.) pelindrom pattern
    1
   212
  32123
 4321234
543212345

5.)daimond

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *


6.) hollow  reactangle 

*****
*   *
*   *
*   *
*****

 */

class p2
{
    public static void main(String[] args) 
    {
        //scanner class objet
        Scanner sc = new Scanner(System.in);

        //user input variable 
        int row;
        System.out.println("Enter row : ");
        row = sc.nextInt();

        //advpatten class object
        advpattern p = new advpattern(row);

        p.butterfly();
        System.out.println();
        p.solidrhombus();
        System.out.println();
        p.numberpiramid();
        System.out.println();
        p.pelindrompattern();
        System.out.println();
        p.daimond();
        System.out.println();    
        p.hollowreactangle();
    }
}


class advpattern
{
    int row;
    advpattern(int row)
    {
        this.row = row;
    }

    //butterfly
    void butterfly()
    {
        //uper side
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }

            for(int k = 1 ; k<=(row-i)*2 ; k++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //loweside
        for(int i = row ; i>=0 ; i--)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }

            for(int k = 1 ; k<=(row-i)*2 ; k++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    //solid rhombus
    void solidrhombus()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            //space  
            for(int k = 1 ; k<=(row-i) ; k++)
            {
                System.out.print(" ");
            }

            //star
            for(int j = 1 ; j<=row ; j++)
            {
                System.out.print("*");
            }


            System.out.println();
        }
    }


    //number piramid
    void numberpiramid()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            //space
            for(int k = 1 ; k<=(row - i) ; k++)
            {
                System.out.print(" ");
            }

            //number print
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    //pelindrom pattern
    void pelindrompattern()
    {
        for(int i = 1 ;i<=row ; i++)
        {
            //space
            for(int k = 1 ; k<=(row-i) ; k++)
            {
                System.out.print(" ");
            }

            //print first part
            for(int j = i ; j>0 ; j--)
            {
                System.out.print(j);
            }

             //print second part
            for(int j = 2 ; j<=i ; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }



    //daimod pattern 
    void daimond()
    {
        //first part
        for(int i = 1 ; i<=row ; i++)    
        {
            //sapce
            for(int k = 1 ; k<=(row-i) ; k++)
            {
                System.out.print(" ");
            }

            //print
            for(int j = 1 ; j<=(i*2)-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //second part
        for(int i = row  ; i>0 ; i--)
        {
            //space
            for(int k = 1 ; k<=(row-i) ; k++)
            {
                System.out.print(" ");
            }

            //print
            for(int j = 1 ; j<=(i*2)-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //hollow rectangle
    void hollowreactangle()
    {
        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1 ; j<=row ; j++)
            {
                if(i == 1 || i==row || j == 1 ||  j == row)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}