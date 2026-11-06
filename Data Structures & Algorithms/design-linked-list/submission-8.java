class ListNode {
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {

    ListNode head;

    public MyLinkedList() {}

    public int get(int index) {
        if (head == null || index < 0) {
            return -1;
        }

        int i = 0;
        ListNode current = head;
        while (current != null) {
            if (i == index) {
                return current.val;
            }
            current = current.next;
            i++;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null || index < 0) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }
}
