class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false; // if the length of the string is odd, it can't be valid
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // if the stack is empty and we encounter a closing bracket, it's invalid
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // if the current closing bracket doesn't match the top of the stack, it's invalid
                }
            }
        }

        return stack.isEmpty(); // if the stack is empty, all opening brackets have been matched
    }
}
