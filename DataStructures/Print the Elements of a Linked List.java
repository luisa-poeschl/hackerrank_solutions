    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode i = head;
        while (i.next != null) {
            System.out.println(i.data);
            i = i.next;
        }
        System.out.println(i.data);

    }
