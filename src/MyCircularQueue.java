public class MyCircularQueue {

    private int[] circularQueue;
    private int frontptr = 0;
    private int rearPtr = 0;
    private boolean isEmpty = true;
    private boolean isFull = false;
    private int capacity;

    public MyCircularQueue(int k) {
        circularQueue = new int[k];
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        else {
            circularQueue[rearPtr++] = value;
            if (rearPtr == capacity){
                rearPtr = 0;
            }

            if (isEmpty()) {
                isEmpty = false;
            }
            if (rearPtr == frontptr) {
                isFull = true;
            }
            return true;
        }
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
        else{
            frontptr++;
            if (frontptr == capacity){
                frontptr = 0;
            }
            if (isFull()){
                isFull = false;
            }
            if (rearPtr == frontptr){
                isEmpty = true;
            }
            return true;
        }
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        else {
            return circularQueue[frontptr];
        }
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        else {
            int ptr = rearPtr;
            ptr--;
            if (ptr == -1){
                ptr = capacity -1;
            }
            return circularQueue[ptr];
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isFull() {
        return isFull;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */