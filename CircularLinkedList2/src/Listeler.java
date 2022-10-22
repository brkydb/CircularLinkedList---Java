import java.util.Scanner;

public class Listeler { // çift yönlü dairesel baðlý liste yapýsý

	Scanner scan = new Scanner(System.in);

	Node head = null;
	Node tail = null;
	Node temp = null;
	Node temp2 = null;

	int data, indis;

	void BasaEkle() {

		System.out.println("Data: ");
		data = scan.nextInt();

		Node eleman = new Node(data);

		if (head == null) {

			head = eleman;
			tail = eleman;

			head.next = tail;
			tail.prev = head;
			head.prev = tail;
			tail.next = head;
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			tail.next = head;
			head.prev = tail;
		}
	}

	void SonaEkle() {

		System.out.println("Data: ");
		data = scan.nextInt();

		Node eleman = new Node(data);

		if (head == null) {

			head = eleman;
			tail = eleman;

			head.next = tail;
			tail.prev = head;
			head.prev = tail;
			tail.next = head;
		} else {
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
			tail.next = head;
			head.prev = tail;
		}

	}

	void ArayaEkle() {

		System.out.println("Ýndis: ");
		indis = scan.nextInt();
		System.out.println("Data: ");
		data = scan.nextInt();

		Node eleman = new Node(data);

		if (head == null) {

			head = eleman;
			tail = eleman;

			head.next = tail;
			tail.prev = head;
			head.prev = tail;
			tail.next = head;
		} else if (indis == 0) {

			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
			tail.next = head;
			head.prev = tail;

		} else {

			temp = head;
			temp2 = temp;
			int n = 0;
			while (temp != tail) {
				n++;
				temp = temp.next;
			}
			temp = head;
			int i = 0;
			while (i < indis) {

				temp2 = temp;
				temp = temp.next;
				i++;

			}
			if (n <= indis) {

				tail.next = eleman;
				eleman.prev = tail;
				tail = eleman;
				tail.next = head;
				head.prev = tail;

			} else {
				temp2.next = eleman;
				eleman.prev = temp2;
				eleman.next = temp;
				temp.prev = eleman;
			}

		}

	}

	void yazdir() {
		if (head == null) {
			System.out.println("Liste boþ.");

		}

		else {
			temp = head;
			System.out.print("Baþ -> ");
			while (temp != tail) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}

			System.out.println(temp.data + " -> Son.");
		}
	}

	void TerstenYazdir() {
		if (head == null) {
			System.out.println("Liste boþ.");

		}

		else {
			temp = tail;
			System.out.print("Son -> ");
			while (temp != head) {
				System.out.print(temp.data + " -> ");
				temp = temp.prev;
			}

			System.out.println(temp.data + " -> Baþ.");
		}
	}

	void bastansil() {

		if (head == null) {

			System.out.println("liste boþ");

		} else if (head == tail) {

			head = null;
			tail = null;

		} else {
			head = head.next;
			head.prev = tail;
			tail.next = head;
		}

	}

	void sondansil() {

		if (head == null) {

			System.out.println("liste boþ");

		} else if (head == tail) {

			head = null;
			tail = null;

		} else {

			temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			tail = temp;
			tail.next = head;
			head.prev = tail;
		}

	}

	void aradansil() {

		if (head == null) {

			System.out.println("liste boþ");

		} else {
			System.out.println("indis: ");
			indis = scan.nextInt();

			if (indis == 0 && head == tail) {

				head = null;
				tail = null;

			}

			else if (indis == 0 && head != tail) {

				head = head.next;
				head.prev = tail;
				tail.next = head;

			} else {
				int n = 0;
				temp = head;
				while(temp.next != tail) {
					
					n++;
					temp = temp.next;
						
					}
				if (indis == n) {
					
					tail = temp;
					tail.next = head;
					head.prev = tail;
				}
				else {
					temp = head;
					temp2 = temp;
					int i =0 ;
					while (i < indis) {
						
						i++;
						temp2 = temp;
						temp = temp.next;
					}
					temp2.next = temp.next;
					temp.next.prev = temp2;
				}
				}

			}
		}

	
}
