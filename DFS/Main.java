
public class Main {

	public static void main(String[] args) {
		Nodo<String> A = new Nodo<>("A");

		Nodo<String> B = new Nodo<>("B");
		A.connect(B);
		Nodo<String> C = new Nodo<>("C");
		A.connect(C);
		Nodo<String> D = new Nodo<>("D");
		A.connect(D);
		
		Nodo<String> E = new Nodo<>("E");
		B.connect(E);
		Nodo<String> F = new Nodo<>("F");
		B.connect(F);
		Nodo<String> H = new Nodo<>("H");
		C.connect(H);
		Nodo<String> I = new Nodo<>("I");
		D.connect(I);
		Nodo<String> J = new Nodo<>("J");
		D.connect(J);

		Nodo<String> K = new Nodo<>("K");
		E.connect(K);
		Nodo<String> G = new Nodo<>("G");
		H.connect(G);
		Nodo<String> L = new Nodo<>("L");
		J.connect(L);

		DFS.busqueda("H", A);

	}

}
