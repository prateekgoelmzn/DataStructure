public static boolean delMidElem(Node mid){
  if(mid == null || mid.next == null) return false;
  Node temp = mid.next;
  mid.data = temp.data;
  mid.next = temp.next;
  return true;
}

public static boolean delMidElem(Node mid){
  if(mid == null || mid.next == null) return false;
  while(mid.next.next != null){
    Node temp = mid.next;
    mid.data = temp.data;
    mid.next = temp.next;
  }
  mid.next = null;
  return true;
}
