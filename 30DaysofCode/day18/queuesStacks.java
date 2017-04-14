public class Solution {
    Stack palindromeStack = new Stack();
    Queue palindromeQueue = new LinkedList<Character>();
    
    public void pushCharacter(char ch){
        palindromeStack.push(ch);
    }
    
    public void enqueueCharacter(char ch){
        palindromeQueue.add(ch);
    }
    
    public char popCharacter(){
        return (char)palindromeStack.pop();    
    }
    
    public char dequeueCharacter(){
        Object c = palindromeQueue.remove();    
        return (char)c;    
    }
    


