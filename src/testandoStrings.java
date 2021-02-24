
public class testandoStrings {

	public static void main(String[] args) {
		String nomeJedi1 = "Luke Skywalker";
		
		System.out.println("Resultado do primeiro teste com .equals");
		System.out.println(nomeJedi1.equals("Luke SKYWALKER"));
		
		System.out.println("Resultado do segundo teste com .equals");
		System.out.println(nomeJedi1.equals("Luke Skywalker"));
		
		System.out.println("Resultado do primeiro teste com .equalsIgnoreCase");
		System.out.println(nomeJedi1.equalsIgnoreCase("Luke SKYWALKER"));
		
		System.out.println("Resultado do segundo teste com .equalsIgnoreCase");
		System.out.println(nomeJedi1.equalsIgnoreCase("Luke Skywalker"));
		
		System.out.println("Resultado do primeiro teste com .contentEquals");
		System.out.println(nomeJedi1.contentEquals("Luke SKYWALKER"));
		
		System.out.println("Resultado do segundo teste com .contentEquals");
		System.out.println(nomeJedi1.contentEquals("Luke Skywalker"));
		
	}

}
