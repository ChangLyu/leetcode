package advancedJava;

import java.util.LinkedList;
import java.util.Queue;


public class UseQueueReplaceStack {
	   private Queue<Integer> q1=new LinkedList<Integer>();
	   private Queue<Integer> q2=new LinkedList<Integer>();

	    public void push(int x) {
	        if(q1.size()==0){
	            q1.add(x);
	            while(!q2.isEmpty()){
	                q1.add(q2.remove());
	            }
	        }else{
	            q2.add(x);
	            while(!q1.isEmpty()){
	                q2.add(q1.remove());
	            }
	        }
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        if(!q1.isEmpty()){
				q1.remove();
			}else{
				q2.remove();
			}
	    }

	    // Get the top element.
	    public int top() {
	    	if(!q1.isEmpty()){
				return q1.peek();
			}
				return q2.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return q1.isEmpty()&&q2.isEmpty();
	    }
	public static void main(String[] args){
		UseQueueReplaceStack stack=new UseQueueReplaceStack();
		stack.push(1);
		stack.push(4);
		stack.push(2);
		stack.push(11);
		stack.push(2);
		stack.push(15);
		while(!stack.empty()){
		System.out.println(stack.top());
		stack.pop();
		
		}
		
	}

}
