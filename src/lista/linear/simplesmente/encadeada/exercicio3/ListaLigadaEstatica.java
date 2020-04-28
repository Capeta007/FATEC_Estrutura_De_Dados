package lista.linear.simplesmente.encadeada.exercicio3;

public class ListaLigadaEstatica<T> {

	private Node<T>[] positions;
	private int first;
	private int firstEmpty;
	private int size;
	private int invalidePosition = -1;
	
	public ListaLigadaEstatica() {
		positions = new Node[2];
		
		first = 0;
		firstEmpty = 0;
		size = 0;

		for (int i = 0; i < positions.length; i++) {
			positions[i] = new Node<T>(i+1);
		}
		
		positions[positions.length-1].setNext(invalidePosition);
		
	}
	
	public void add(T object) {
		
		if(firstEmpty == invalidePosition) {
			updateSizeList();
		}
		
		if(size == 0) {
			int nextEmpty = positions[firstEmpty].getNext();
			positions[firstEmpty] = new Node<T>(object, invalidePosition);
			firstEmpty = nextEmpty;
			size++;
		}
		else {
			int current = first;
			
			while(positions[current].getNext() != invalidePosition) {
				current = positions[current].getNext();
			}
			
			positions[current].setNext(firstEmpty);
			int nextEmpty = positions[firstEmpty].getNext();
			positions[firstEmpty] = new Node<T>(object, invalidePosition);
			firstEmpty = nextEmpty;
			size++;
		}
		
	}

	public void add(int index, T object) {
		if(size < index) {
			throw new ListException("Error: List is empty or invalide position");
		}
		if(firstEmpty == invalidePosition) {
			updateSizeList();
		}
		
		int current = first;
		int last = invalidePosition;
		
		int i = 0;
		while(i != index) {
			last = current;
			current = positions[current].getNext();
			i++;
		}
		
		if(last != invalidePosition) {
			int nextEmpty = positions[firstEmpty].getNext();
			positions[last].setNext(firstEmpty);
			positions[firstEmpty] = new Node<T>(object, current);
			firstEmpty = nextEmpty;
			
		}else {
			int nextEmpty = positions[firstEmpty].getNext();
			positions[firstEmpty] = new Node<T>(object, first);
			first = firstEmpty;
			firstEmpty = nextEmpty;
		}
		size++;
		
	}
	
	public void remove(int index) {
		if(size == 0 || index >= positions.length || positions[index].getObject() == null) {
			throw new ListException("Error: List is empty or invalide position");
		}
		
		int current = first;
		int last = invalidePosition;
		
		int i = 0;
		while(i != index) {
			last = current;
			current = positions[current].getNext();
			i++;
		}
		
		if(last != invalidePosition) {
			positions[last].setNext(positions[current].getNext());
		}else {
			first = positions[current].getNext();
		}
		positions[current].setNext(firstEmpty);
		firstEmpty = current;
		size--;
		
	}
	
	public T getIndex(int index) {
		if(size == 0 || index >= positions.length || positions[index].getObject() == null) {
			throw new ListException("Error: List is empty or invalide position");
		}
		
		int current =first;
		
		for (int i = 0; i < index; i++) {
			current = positions[current].getNext();
		}
		
		return positions[current].getObject();
	}
	
	public int contains(T object) {
		
		int current = first;
		
		while(positions[current].getObject().equals(object) && positions[current].getNext() != invalidePosition) {
			
			current = positions[current].getNext();
			
		}
		
		if(positions[current].getObject().equals(object) ) {
			return current;
		}else {
			return invalidePosition;
		}
	}
	
	public void clear() {
		first = 0;
		firstEmpty = 0;
		for (int i = 0; i < positions.length; i++) {
			positions[i] = new Node<T>(i+1);
		}
		
		positions[positions.length-1].setNext(invalidePosition);
		
		size = 0;
	}
	
	public void imprimirLista() {
		
		int current = first;
		int i = 0;
		while(i < size) {
			System.out.println(current + " - name: " + positions[current].getObject().toString());
			current = positions[current].getNext();
			i++;
		}
		
	}
	
	private void updateSizeList() {
		
		Node<T>[] update = positions;
		positions = new Node[positions.length*2];
		
		for (int i = 0; i < update.length; i++) {
			positions[i] = update[i];
		}
		
		for (int i = update.length; i < positions.length; i++) {
			positions[i] = new Node<T>(i+1);
		}
		positions[positions.length-1].setNext(invalidePosition);
		firstEmpty = update.length;
	}
}