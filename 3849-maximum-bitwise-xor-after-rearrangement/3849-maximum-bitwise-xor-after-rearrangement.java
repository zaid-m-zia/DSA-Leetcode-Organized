class Solution {
    public String maximumXor(String s, String t) {
        int n = s.length();
        int tZeros = 0;
        int tOnes = 0;
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '0') {
                tZeros++;
            } else {
                tOnes++;
            }
        }
        char[] result = new char[n];
        
        for (int i = 0; i < n; i++) {
            char sBit = s.charAt(i);
            
            if (sBit == '0') {
                if (tOnes > 0) {
                    result[i] = '1';
                    tOnes--;
                } else {
                    result[i] = '0';
                    tZeros--;
                }
            } else {
                if (tZeros > 0) {
                    result[i] = '1';
                    tZeros--;
                } else {
                    result[i] = '0';
                    tOnes--;
                }
            }
        }
        return new String(result);
    }
}