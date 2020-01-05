public static Node AddTwoLinkedList(Node A, Node B){
  Node head1 = A;
  Node head2 = B;
  int sum = 0;
  int carry = 0;
  Node ans = new Node(0);
  Node s = ans;
  while(head1 != null && head2 != null){
    sum = (carry + head1.data + head2.data)%10;
    carry = (carry + head1.data + head2.data)/10;
    s.next = new Node(sum);
    s = s.next;
    head1 = head1.next;
    head2 = head2.next;
  }
  if(carry>0){
    s.next = new Node(carry);
  }

  return ans.next;
}
