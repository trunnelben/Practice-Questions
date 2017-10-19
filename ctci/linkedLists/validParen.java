class Solution {
    public boolean isValid(String s) {
    //add the opposite to the stack and then peak when you see one of the 3 and pop if it is the same. if not return false
        Stack<Character> stackie = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stackie.push(')');
            else if(s.charAt(i) == '{') stackie.push('}');
            else if(s.charAt(i) == '[') stackie.push(']');
            else if (stackie.isEmpty() || s.charAt(i) != stackie.pop()) return false;
        }
        return stackie.isEmpty();
    }
}
