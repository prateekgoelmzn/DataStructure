public static void InsertAtBeg(Node head,int d){
  Node elem = new Node(d);
  elem.next = head;
  head = elem;
}

public static void InsertAtEnd(Node head,int d){
  Node elem = new Node(d);
  while( head.next != null ){
    head = head.next;
  }
  head.next = elem;
}

public static void InsertAtPos(Node head,int d, int pos){
  Node elem = new Node(d);
  int i=0;
  while(i<pos-2){
    head = head.next;
    i++;
  }
  elem.next = head.next;
  head.next = elem;
}
