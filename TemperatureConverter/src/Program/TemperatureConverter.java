package Program;

public class TemperatureConverter {
	  public double convertFahrenheitToCelsius(double fahrenheit)
	  {
	 return  (fahrenheit - 32) * 5/9;
	  }
	}
	import java.util.Scanner;
	 
	public class TemperatureConverterApp {
	 
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter temp in F");
	double f=scan.nextDouble();
	TemperatureConverter temperatureConverter=new TemperatureConverter();
	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
	}

}
