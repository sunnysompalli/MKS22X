public class Recursion{

    public String name(){
	return "Sompalli,Sunny";
    }

    public double sqrt(double n){
	if (n < 0) throw new IllegalArgumentException();
	return helper(n, n/2);
    }

    public double helper(double n, double guess){
	if (Math.abs(n - (guess * guess)) / n > 0.00001){
	    guess = (n / guess + guess) / 2;
	    return helper(n, guess);
	} else {
	    return guess;
	}
    }
}
