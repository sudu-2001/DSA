class Insertion{

	class Node{

		String data;

		Node next;

		Node(String data){

			this.data=data;

			this.next=null;

		}

	}

	Node head=null;

	public void addfirst(String data){

		Node newnode=new Node(data);

		newnode.next=head;

		head=newnode;

	}

	public static void main(String[] args){

		Insertion ins=new Insertion();

		ins.addfirst("hje");

	}

}
