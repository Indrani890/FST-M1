package activities;

import org.apache.commons.math3.analysis.function.Add;

interface Addfuc{
    int add(int a, int b);
}
public class Activity12 {

    public static void main (String[] args)
    {
        Addfuc a1=(a, b) -> (a+b);
        System.out.println(a1.add(200,30));
        Addfuc a2=(int a,int b)->
        {
            return(a+b);
        };
        System.out.println(a2.add(9,12));
    }

}
