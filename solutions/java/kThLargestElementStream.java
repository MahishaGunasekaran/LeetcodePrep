class KthLargest {
private PriorityQueue<Integer> heap = new PriorityQueue<>();
    private int k;
    public KthLargest(int k, int[] nums) {
        this.heap = heap;
        this.k = k;
        for(int num: nums) {
            this.heap.offer(num);
        }
    }
    
    public int add(int val) {
        this.heap.offer(val);
        while(this.heap.size() > k) {
            this.heap.poll();
        }
        return this.heap.peek();
    }
}
