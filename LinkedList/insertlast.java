import java.util.*;

class insertlast{

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

		if(head==null){

			head=newnode;

			return;

		}

		newnode.next=head;

		head=newnode;

	}

	public void addlast(String data){

		Node newnode=new Node(data);

		if(head==null){

			head=newnode;

			return;

		}

		Node currnode=head;

		while(currnode.next!=null){

			currnode=currnode.next;

		}

		currnode.next=newnode;

	}


	public void print(){

		Node currnode=head;

		while(currnode!=null){

			System.out.print(currnode.data+"->");

			currnode=currnode.next;

		}

		System.out.println("Null");

	}

	public static void main(String[] args){

		insertlast ins=new insertlast();

		ins.addfirst("Hello");

		ins.addfirst("World");

		ins.addlast("Sudarshan");

		ins.print();

	}

}
