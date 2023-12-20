package listaDuplaEhncadeada;

import java.util.ArrayList;

public class DoublyLL {

	private int length;
	private Node head = null;
	private Node tail = null;

	DoublyLL() {
	}

	public ArrayList<String> listar() {
		ArrayList<String> lista = new ArrayList<>();

		if (this.head == null) {
			throw new NullPointerException("lista vazia");
		}
		Node newNode = getHead();

		while (newNode != null) {
			String aux = newNode.getData();
			lista.add(aux);
			newNode = newNode.getNext();
		}

		return lista;
	}

	public void insertHead(String data) {
		Node newNode = new Node();

		if (this.head == null) {
			newNode.setData(data);
			setHead(newNode);
			setTail(newNode);
		}
		this.head.setPrev(newNode);
		newNode.setData(data);
		newNode.setNext(head);
		setHead(newNode);
	}

	public void insertTail(String data) {
		Node newNode = new Node();

		if (this.head == null) {
			newNode.setData(data);
			setHead(newNode);
			setTail(newNode);
		}
		this.tail.setNext(newNode);
		newNode.setData(data);
		setTail(newNode);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

}
