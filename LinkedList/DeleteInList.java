public static Node DelFromBeg(Node head){
  if(head==null) return null;
  Node elem = head;
  System.out.println("Deleted Node :"+ elem.data);
  return head.next;
}

public static Node DelFromEnd(Node head){
  if(head == null || head.next == null) return null;
  Node prev = head;
  Node curr = prev.next;
  while(curr != null && curr.next != null){
    prev = prev.next;
    curr = curr.next;
  }
  prev.next = null;
  return head;
}

public static Node DelElem(Node head,int d){
  Node temp = head;
  if(head.data == d){
    return head.next;
  }
  else{
    while(temp.next != null){
      if(temp.next.data == d){
        temp.next = temp.next.next;
      }
      else{
        temp = temp.next;
      }
    }
  }
  return head;
} 
