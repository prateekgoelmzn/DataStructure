public static void RemoveDuplicate(Node head){
  if(head == null || head.next == null ) return;
  Node prev = head;
  Node curr = prev.next;
  while(curr != null){
    Node run = head;
    while(run != curr){
      if(run.data == curr.data){
        Node temp = curr.next;
        prev.next = temp;
        curr = temp;
        break;
      }
      run = run.next;
    }
    if(run == curr){
      prev = curr;
      curr = curr.next;
    }
  }
}

public static void DelDuplicate(Node head){
  Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
  Node prev = null;
  while(head != null){
    if(table.containsKey(head.data)){prev.next = head.next;}
    else{
      table.put(head.data,true);
      prev = head;
    }
    head = head.next;
  }
}
