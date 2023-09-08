class MyHashMap {
    int[] mp;
    public MyHashMap() {
        mp = new int[1000001];
    }

    public void put(int key, int value) {
        mp[key]=value + 1;
    }

    public int get(int key) {
        return mp[key]-1;
    }

    public void remove(int key) {
        mp[key]=0;
    }
}