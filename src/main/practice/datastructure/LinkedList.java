package main.practice.datastructure;

public class LinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }


    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = head;
        if (head == null) {
            SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
            return newHead;
        } else {
            while (node.next != null) {
                node = node.next;
            }
            SinglyLinkedListNode nextNode = new SinglyLinkedListNode(data);
            node.next = nextNode;
            return head;
        }
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if (llist == null) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(data);
            node.data = data;
            return node;
        } else {
            SinglyLinkedListNode node = new SinglyLinkedListNode(data);
            node.next = llist;
            return node;
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (head == null) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(data);
            return node;
        } else {
            SinglyLinkedListNode node = head;
            for (int i = 1; i < position; i++) {
                node = node.next;
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = node.next;
            node.next = newNode;

            return head;
        }

    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertNode(5);
        linkedList.insertNode(8);
        linkedList.insertNode(4);
        insertNodeAtTail(linkedList.head, 2);
        printLinkedList(linkedList.head);

    }
}
