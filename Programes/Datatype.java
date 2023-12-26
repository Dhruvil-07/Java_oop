/*
 for store number , we have four type 
 1.) byte -> 1byte -> -128 to 128
 2.) short -> 2byte -> -32,768 to -32,767
 3.) int  -> 4 byte -> -2,147,483,648 to 2,147,483,647
 4.) long -> 8 byte -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


for store decimal number we have 2 dtatype

1.) float  -> 4byte -> 34-bit IEEE 754 floating point
2.) double -> 8byte -> 64-bit IEEE 754 floating point

some time you require all digit  after in decimal number , so at that time
you must use double.

float is only for memory saving


forstore true and flase , we have boolean datatype
its store only true and false not even 0 and 1


for  sttore single charcter we have char data type
char -> 2 byte 

in c ->charcter -> 1 byte bec c use ascii to  store charcter
in java ->charcter -> 2 byte bex java use unicode to store charcater
 */

class Datatype {
    public static void main(String[] args) 
    {
        int a = -128;
        byte b = -128;

        System.out.println(a + " " + b);

        b++;

        System.out.println(b);
    }
}
