package app;
import java.util.Scanner;

public class calc {
<<<<<<< HEAD
<<<<<<< .merge_file_a10432
<<<<<<< .merge_file_a14428
<<<<<<< HEAD
   
=======
 
>>>>>>> features/feature1
=======

>>>>>>> .merge_file_a14876
=======

>>>>>>> .merge_file_a00980
=======

>>>>>>> features/feature2

    public static double calculate(input inp)
    {
        
        double ans=0;
        char choose ;
        
        choose = inp.getOperator();
 
        switch (choose){
        case '+':
            ans = add( inp);
            break;
        case '-':
        ans = sub( inp);
            break;      
        case '*':
        ans = mult( inp);
            break;
        case 'c':
        ans = cosine( inp);
            break;
        case '/':
        ans = div( inp);
            break;
<<<<<<< HEAD

            case 't':
            ans = tan( inp);
                break;
=======
            case '^':
        ans = pow( inp);
            break;
>>>>>>> features/feature1
        case '%':
        ans = mod( inp);
            break;
            default:
                System.out.println("Wrong Operation");

        }
     return ans;
    }

    public static double add(input inp)
    {
        double result = inp.getNum1() + inp.getNum2();
        return result;
    }
    public static double sub(input inp)
    {
        double result = inp.getNum1()-inp.getNum2();
        return result;
    }
    public static double mult(input inp)
    {
        double result = inp.getNum1()*inp.getNum2();
        return result;
    }
    public static double div(input inp)
    {
        if  (inp.getNum2()==0){
            throw new ArithmeticException("zero denominator");
        }

        double result = inp.getNum1()/inp.getNum2();
        return result;
    }
    public static double mod(input inp)
    {
        double result = inp.getNum1()%inp.getNum2();
        return result;
    }
<<<<<<< HEAD
<<<<<<< .merge_file_a10432
<<<<<<< .merge_file_a14428
<<<<<<< HEAD
    public static double tan(input inp)
    {
        double result = (double) Math.tan(inp.getNum1());
=======
    public static int pow(input inp)
    {
        int result = (int) Math.pow(inp.getNum1(), inp.getNum2());
>>>>>>> features/feature1
=======
    public static double cosine(input inp)
    {
        double result =  Math.cos(inp.getNum1());
>>>>>>> .merge_file_a14876
=======
    public static double cosine(input inp)
    {
        double result =  Math.cos(inp.getNum1());
>>>>>>> .merge_file_a00980
=======
    public static double cosine(input inp)
    {
        double result =  Math.cos(inp.getNum1());
>>>>>>> features/feature2
        return result;
    }
    }

