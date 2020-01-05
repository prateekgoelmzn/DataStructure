
public static Node NthFromLastElem(Node head,int n){
  if(head == null || n<1) return null;
  Node ptr1 = head;
  Node ptr2 = head;
  for (int i=0;i<n-1;i++){
    if(ptr2 == null){
      return null;
    }
    ptr2 = ptr2.next;
  }
  while(ptr2.next!=null){
    ptr1 = ptr1.next;
    ptr2 = ptr2.next;
  }
  return ptr1;
}
