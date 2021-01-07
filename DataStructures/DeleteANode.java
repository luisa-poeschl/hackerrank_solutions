    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode previousNode = head;
        SinglyLinkedListNode nodeToDelete = head;
        if (head.next == null) {
            return head;
        } else if (position == 0) {
            SinglyLinkedListNode temp = head;
            head = temp.next;
            temp.next = null;
        } else {
            for (int i = 0; i < position - 1; ++i) {
                previousNode = previousNode.next;
            }
            nodeToDelete = previousNode.next;
            previousNode.next = nodeToDelete.next;
            nodeToDelete.next = null;
        }
        return head;
    }
