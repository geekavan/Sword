public class Sword{
    static double power(double base, int exponent){
        if(base==0 && exponent==0)
            return 0;
        if(exponent<0)
            return 1/(power(base, -exponent));
        if(exponent==0)
            return 1;
        if(exponent%2==0){
            double temp = power(base, exponent/2);
            return temp*temp;
        }
        else
            return base*power(base, (exponent-1));
    }
}