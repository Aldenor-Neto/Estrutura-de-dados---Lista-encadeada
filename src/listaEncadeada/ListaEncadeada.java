package listaEncadeada;

public class ListaEncadeada {

	protected Node head;
	protected long size;

	public ListaEncadeada() {
		this.head = null;
		this.size = 0;
	}

	public void adicionaHead(Node v) {
		v.setNext(this.head);
		;
		this.head = v;
		size++;
	}

	public void adicionaTail(String elemento) {
		private Node newNode = new Node(elemento, null);

		if (this.head == null) {
			this.head = newNode;
		}

		Node atual = this.head;

		while (atual != null) {
			atual = atual.getNext();
		}

		atual.setNext(newNode);
		this.size++;
	}

	public void deletarHead() {
		if (this.head == null) {
			return;
		}

		this.head = head.getNext();
		this.size -= 1;

	}
}
