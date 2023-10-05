package combinator;

public class LambdaExpression {

		  public interface SelfMadeLambda{
			    public void printName(String s);
			  }
			  public static void main(String args[]){
			    SelfMadeLambda formatStringAppendMr = s -> System.out.println("Mr."+s);
			    SelfMadeLambda formatStringAppendMister = s-> System.out.println("Mister."+s);
			    formatStringAppendMr.printName("John Hammomd");
			    formatStringAppendMister.printName("Francis");
			  }

}


