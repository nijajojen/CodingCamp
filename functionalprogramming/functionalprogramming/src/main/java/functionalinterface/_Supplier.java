package functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println(getDbConnectionUrlSupplier.get());
		System.out.println(getDbConnectionUrlSupplierV2.get());
		

	}
	static String getDbConnectionUrl() {
		return "jdbc://localhost:5432/users";
	}
	
	static Supplier<String> getDbConnectionUrlSupplier= ()-> "jdbc://localhost:5432/users";
	static Supplier<List<String>> getDbConnectionUrlSupplierV2= ()-> Arrays.asList("jdbc://localhost:5432/users", "jdbc://localhost:5432/users");
}
