public class Rational{
    private int numerator;
    private int denominator;
    
    public Rational(){
	numerator=0;
	denominator=1;
    }
    
    public Rational(int n, int d){
	if (d!=0){
	    numerator=n;
	    denominator=d;}
	else{
	    numerator=0;
	    denominator=1;
	    System.out.println("Your denominator can't be zero stupid");}
    }
    
    public int getNumerator(){return numerator;}
    public int getDenominator(){return denominator;}
    
    
    public String toString(){
	return numerator+"/"+denominator;
    }
    
    public double floatValue(){
	return numerator/(denominator *1.0);
    }
    
    public void multiply(Rational number){
	numerator*=number.getNumerator();
	denominator*=number.getDenominator();
    }
    
    public void divide(Rational number){
	numerator*=number.getDenominator();
	denominator*=number.getNumerator();
    }
    
    public void add(Rational number){
	numerator*=number.getDenominator();
	numerator+=(number.getNumerator()*denominator);
	denominator*=number.getDenominator();
    }
    
    public void subtract(Rational number){
	numerator*=number.getDenominator();
	numerator-=(number.getNumerator()*denominator);
	denominator*=number.getDenominator();
    }

    public int gcd(){
	int r=0;
	int b=numerator; int a=denominator; 
	while (b!=0){
	    r= a % b;
	    a=b;
	    b=r;
	}
	return a;
    }
    
    public void reduce(){
	int x=this.gcd();
	numerator/=x;
	denominator/=x;
    }
    
    public static int gcd(int numerator, int denominator){
	int r=0;
	int b=numerator; int a=denominator; 
	while (b!=0){
	    r= a % b;
	    a=b;
	    b=r;
	}
	return a;
    }

    public int compareTo(Rational number){
	Rational x=this;
	x.subtract(number);
	return x.getNumerator();
    }

    public static void main(String[]args){
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	Rational u = new Rational(2,9); //Stores the rational number 2/9
	Rational v = new Rational(4,18); //Stores the rational number 4/18

	//testing out toString()
	System.out.println("R is equal to 2/3: "+r);
	System.out.println("S is equal to 1/2: "+s);
	System.out.println("T is equal to 4/18: "+t);
	/*============================================================
	//testing floatValue
	System.out.println("R as a float is: "+r.floatValue());
	System.out.println("S as a float is: "+s.floatValue());

	r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains
	System.out.println("R was multiplied by s and should now be 2/6: "+r);
	System.out.println("S is still equal to 1/2: "+s);

	r.divide(s);//divides r by s, r is 4/6. s remains 
	System.out.println("R was divided by s and should now be 4/6: "+r);
	System.out.println("S is still equal to 1/2: "+s);
	============================================================*/
	
	//testing add()
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2 
	System.out.println("r had s added to it and should now be 7/6: "+r);
	System.out.println("S is still equal to 1/2: "+s);
	
	//testing subtract()
	r.subtract(s);  //Subtracts s from r, changes r to 8/12.  s remains 1/2 
	System.out.println("r had s subtracted from it and should now be 8/12: "+r);
	System.out.println("S is still equal to 1/2: "+s);

	//testing reduce()
       	t.reduce(); //Changes t to 2/9
	System.out.println("T should now be 2/9: "+t);


	System.out.println("Should return gcd(9,6) aka 3: "+gcd(9,6));//testing static gcd()
	
	//testing compare to
	System.out.println("Are 4/18 and 2/9 equal?: "+v.compareTo(t));//Should return 0
	System.out.println("Are 2/9 and 2/9 equal?: "+u.compareTo(t));//Should return 0
	System.out.println("Are 8/12 and 2/9 equal?: "+r.compareTo(t));//Should return positive integer 
	System.out.println("Are 2/9 and 8/12 equal?: "+t.compareTo(r));//Should return negative integer 
	
    }
}