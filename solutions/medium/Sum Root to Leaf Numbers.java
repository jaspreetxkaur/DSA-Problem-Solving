// Title: Sum Root to Leaf Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/

            return 0;
        }

        currentNumber = currentNumber * 10 + root.val;

        if (root.left == null && root.right == null) {
            return currentNumber;
        }

        int leftSum = dfs(root.left, currentNumber);
        int rightSum = dfs(root.right, currentNumber);

        return leftSum + rightSum;
    }
}
