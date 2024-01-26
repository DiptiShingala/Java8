package linkedlist;

import org.w3c.dom.Node;

public class LinkedListReverse {
  static Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }

        Node reverse(Node node) {
            Node prev = null;
            Node current = node;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;
        }

        public void printList(Node node) {
            while (node != null) {
                System.out.println(node.data + " ");
                node = node.next;

            }

        }

        public static void main(String[] args) {
            LinkedListReverse list = new LinkedListReverse();
            list.head = new Node(85);
            list.head.next = new Node(67);
            list.head.next.next = new Node(87);
            list.head.next.next.next = new Node(7);
            System.out.println("Given Linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }
    }

