class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int z:nums){
            map.put(z,map.getOrDefault(z,0)+1);
        }
        // create a arraylist for storing the keyset from map
        List<Integer> list = new ArrayList<>(map.keySet());
        //now sort it in descending order
        list.sort((a,b)->map.get(b)-map.get(a));

        // Pick the top k elements
        int[] arr = new int[k];
        for(int z=0;z<k;z++){
            arr[z] = list.get(z);
        }

        return arr;
    }
}
