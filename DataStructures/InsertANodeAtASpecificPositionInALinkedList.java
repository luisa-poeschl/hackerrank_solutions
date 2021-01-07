    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode positionNode = head;
        for (int i = 0; i < position - 1; ++i) {
            positionNode = positionNode.next;
        }
        newNode.next = positionNode.next;
        positionNode.next = newNode;
        return head;
    }
