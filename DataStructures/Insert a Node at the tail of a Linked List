    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = null;
        SinglyLinkedListNode tmp = head;
        if (head == null) {
            return newNode;
        }
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
        return head;
    }
