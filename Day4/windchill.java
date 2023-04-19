public class windchill{
public static void main(String args[])
{
	double t=Double.parseDouble(args[0]);		//temerature(F)
	double v=Double.parseDouble(args[1]);		//wind(m/ph)

	double windchill = 35.75 + 0.6215*t + (0.4275*t-35.75)* Math.pow(v,016);
	
	System.out.println("Wind chill Temperature = " + windchill);
}

}
