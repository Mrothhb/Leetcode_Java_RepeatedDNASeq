class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> seq = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();    
        
        if(s.length() < 10){
            return seq;
        }        
        
        String str = "";
        int start = 0;
        int end = 10;
        
        while(true){ 
            if(end > s.length()){
                break;
            }
            str = s.substring(start, end);
            System.out.println(str);
            if (map.containsKey(str)) { 
                Integer a = map.get(str); 
                map.put(str, ++a);
            } else{
                map.put(str, 1); 
            }
            end++;
            start++;
        }
        
        for (Map.Entry<String, Integer> e : map.entrySet()) 
            if( e.getValue() > 1){
                seq.add(e.getKey());
            }
        return seq;
    }
}
