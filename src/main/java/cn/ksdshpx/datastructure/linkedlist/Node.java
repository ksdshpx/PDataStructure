package cn.ksdshpx.datastructure.linkedlist;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/6/11
 * Time: 13:42
 * Description:单链表的节点
 */
public class Node {
    public Object data;
    public Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
