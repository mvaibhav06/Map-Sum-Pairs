class MapSum {

    private Map<String,Integer> temp;

    public MapSum() {
        temp = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        temp.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        int len = prefix.length();

        for(String key : temp.keySet()){
            if(key.length() < len){
                continue;
            }
            String s = key.substring(0,len);
            if(s.equals(prefix)){
                sum += temp.get(key);
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
