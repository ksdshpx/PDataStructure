package cn.ksdshpx.datastructure.queue;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Create by peng.xing
 * Date: 2019/6/6
 * Time: 10:34
 * Description:用数组模拟队列
 */
public class ArrayQueue {
    private Object[] data;//用于存储数据的数组
    private int maxSize;//队列的大小
    private int front;//队列的头部(指向队列第一个元素的前一个位置)
    private int rear;//队列的尾部(指向队列的最后一个元素)

    //构造一个队列
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        data = new Object[maxSize];
        front = -1;
        rear = -1;
    }

    //判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列是否空
    public boolean isEmpty() {
        return rear == front;
    }

    //入队
    public void addQueue(Object obj) {
        if (isFull()) {
            throw new RuntimeException("队列已满！");
        }
        data[++rear] = obj;
    }

    //出队
    public Object getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的！");
        }
        return data[++front];
    }

    //打印队列中的所有元素
    public void printQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的！");
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.printf("arr[%d]=%d\n", i, data[i]);
        }
    }

    //查看队列的第一个元素
    public Object head() {
        if (isEmpty()) {
            throw new RuntimeException("队列是空的！");
        }
        return data[front + 1];
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("p(printQueue):打印队列中元素");
            System.out.println("a(addQueue):入队");
            System.out.println("g(getQueue):出队");
            System.out.println("h(head):获取队列的第一个元素");
            System.out.println("e(exit):退出");
            switch (scanner.next().charAt(0)) {
                case 'p':
                    try {
                        queue.printQueue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'a':
                    try {
                        System.out.print("请输入一个数:");
                        queue.addQueue(scanner.nextInt());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try {
                        System.out.println("出队：" + queue.getQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        System.out.println("队列第一元素为:" + queue.head());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    System.out.println("程序退出！");
                    scanner.close();
                    loop = false;
                    break;
            }
        }
        System.out.println();
    }
}
