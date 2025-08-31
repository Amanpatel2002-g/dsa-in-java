package strings.stringmatching;

import java.util.ArrayList;
import java.util.List;

class KMP {

    private int[] getLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int i = 1, len = 0;
        while (i < n) {
            if (s.charAt(len) == s.charAt(i)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public List<Integer> findPatterns(String text, String pattern) {
        List<Integer> ans = new ArrayList<>();

        int[] lps = getLPSArray(pattern);

        int i = 0, j = 0;
        int n = text.length(), m = pattern.length();

        for (int l : lps) {
            System.out.print(l + " ");
        }
        System.out.println();
        while (i < n) {
            if (j == m) {
                ans.add(i - m);
                j = lps[j - 1];
            } else if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        if (j == m) {
            ans.add(i - m);
        }
        return ans;
    }
}

public class KMPAlgorithm {

    public static void main(String[] args) {

        KMP kmp = new KMP();

        String text = "aaaaaxaaaaaaaaa";
        String pattern = "aaaa";

        List<Integer> ans = kmp.findPatterns(text, pattern);
        System.out.println("The ans for these is: ");
        ans.forEach((element) -> {
            System.out.print(element + " ");
        });
    }
}
