import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	Calculator cc=new Calculator();
	public static final Logger LOG=Logger.getLogger(Calculator.class.getName());
	Random random=new Random();
	DecimalFormat df=new DecimalFormat("#.###");
	

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber =0;
		double secondNumber = 0;
		double result =0;
		
		
		for(int i=0; i<=200; i++){
			firstNumber=Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber=Double.valueOf(df.format(random.nextDouble()*10));
			result=firstNumber+secondNumber;
			
			LOG.info("Testing method add with " +firstNumber +"and" +secondNumber);
			assertEquals(Math.round(cc.add(firstNumber,secondNumber)),Math.round(result));
		}
		
	}
	
	@Test
	public void testSubtractSmallSizedPositiveNumbers() {
		double firstNumber =0;
		double secondNumber = 0;
		double result =0;
		
		
		for(int i=0; i<=200; i++){
			firstNumber=Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber=Double.valueOf(df.format(random.nextDouble()*10));
			result=firstNumber-secondNumber;
			
			LOG.info("Testing method subtract with " +firstNumber +"and" +secondNumber);
			assertEquals(Math.round(cc.subtract(firstNumber,secondNumber)),Math.round(result));
		}
		
	}
	
	@Test
	public void testMultiplySmallSizedPositiveNumbers() {
		double firstNumber =0;
		double secondNumber = 0;
		double result =0;
		
		
		for(int i=0; i<=200; i++){
			firstNumber=Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber=Double.valueOf(df.format(random.nextDouble()*10));
			result=firstNumber*secondNumber;
			
			LOG.info("Testing method multiply with " +firstNumber +"and" +secondNumber);
			assertEquals(Math.round(cc.multiply(firstNumber,secondNumber)),Math.round(result));
		}
		
	}
	
	@Test
	public void tesDivisionSmallSizedPositiveNumbers() {
		double firstNumber =0;
		double secondNumber = 0;
		double result =0;
		
		if (secondNumber!=0 ){
		for(int i=0; i<=200; i++){
			firstNumber=Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber=Double.valueOf(df.format(random.nextDouble()*10));
			result=firstNumber/secondNumber;
			
			LOG.info("Testing method division with " +firstNumber +"and" +secondNumber);
			assertEquals(Math.round(cc.divide(firstNumber,secondNumber)),Math.round(result));
		}
		}
		else{
			System.out.println("Cannot divide by zero");
		}
			
		
	}




}
