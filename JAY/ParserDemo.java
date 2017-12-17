public class ParserDemo {

	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(args[0]);
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
	}

}
