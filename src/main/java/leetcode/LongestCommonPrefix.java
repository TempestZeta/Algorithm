package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int idx = 1; idx < strs.length; idx++) {
            String checkString = strs[idx];
            StringBuilder sb = new StringBuilder();
            for(int charIdx = 0; charIdx < checkString.length(); charIdx++) {
                if(charIdx >= result.length()) {
                    break;
                }

                char checkChar = result.charAt(charIdx);

                if(checkChar != checkString.charAt(charIdx)) {
                    break;
                }
                sb.append(checkChar);
            }
            result = sb.toString();
        }
        return result;
    }
    public String longestCommonPrefixOld(String[] strs) {
        int idx = 0;
        List<String> checkStringList = new ArrayList<>(List.of(strs));
        while(false == checkStringList.isEmpty()) {
            Map<String, List<String>> checker = new HashMap<>();

            for (String s : strs) {

                if (idx >= s.length()) {
                    continue;
                }
                String checkString = String.valueOf(s.charAt(idx));
                List<String> list = checker.computeIfAbsent(checkString, k -> new ArrayList<>());
                list.add(checkString);
            }
            if(checker.size() != 1) {
                break;
            }
            idx++;
        }
        return strs[0].substring(0, idx);
    }
}
