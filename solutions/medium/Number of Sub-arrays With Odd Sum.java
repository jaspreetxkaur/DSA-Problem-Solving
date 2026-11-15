// Title: Number of Sub-arrays With Odd Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/


            if (prefixSum % 2 != 0) {
                totalSubarrays = (totalSubarrays + evenCount) % MOD;
                oddCount++;
            } else {
                totalSubarrays = (totalSubarrays + oddCount) % MOD;
                evenCount++;
            }
        }

        return totalSubarrays;
    }
}

