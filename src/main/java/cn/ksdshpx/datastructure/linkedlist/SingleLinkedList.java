package cn.ksdshpx.datastructure.linkedlist;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/6/11
 * Time: 13:42
 * Description:单链表
 */
public class SingleLinkedList {
    private Node head = new Node(null);

    public void add(Node node) {
        Node fNode = head;
        while (fNode.next != null) {
            fNode = fNode.next;
        }
        fNode.next = node;
    }

    public void list() {
        Node fNode = head;
        while (fNode.next != null) {
            System.out.println(fNode.next.toString());
            fNode = fNode.next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node("SongJiang");
        Node node2 = new Node("LiSi");
        Node node3 = new Node("ZhangSan");
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.list();
    }
}
