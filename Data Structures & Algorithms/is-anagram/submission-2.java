class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countt = new HashMap<>();
        for(int i=0;i<s.length();i++){
            countS.put(s.charAt(i),countS.getOrDefault((s.charAt(i)), 0)+1);
            countt.put(t.charAt(i),countt.getOrDefault((t.charAt(i)), 0)+1);
        }
        return countS.equals(countt);
    }
}
