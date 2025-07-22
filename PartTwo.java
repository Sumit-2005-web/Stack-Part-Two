import java.util.*;

public class PartTwo{
    
    // Q.1. Valid Parentheses Code for Classical Question asked in {Adobe}
    public static boolean validParentheses(String str){
        Stack<Character> st = new Stack<>(); // For Creating a Stack
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); // For curr character tracking
            // Opening Brackets Condition
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            } 
             // Closing Bracket Condition
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.isEmpty()) return false;
               
               if((st.peek() == '(' && ch == ')') 
               || (st.peek() == '[' && ch == ']')
               || (st.peek() == '{' && ch == '}')){
                st.pop();
               } else {
                return false;
               }
            }
        }

        if(!st.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    // Q.2. Duplicate Parentheses Code {Adobe, Apple, Microsoft, Google, Amazon}
    public static boolean duplicateParentheses(String str){
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // Closing Condition
            if(ch == ')'){
                int count = 0;
                while(st.peek() != '('){
                    st.pop();
                    count++;
                }
                if(count < 1){
                    return true; // Duplicate exists
                } else {
                    st.pop();  // Opening Pair
                }
            }  else {
                // Opening Condition
                st.push(ch);
            }      
        }

        return false;
    }

    // Q.3. Maximum Rectangular Area in Histogram {Microsoft, Paytm, Facebook}
    public static int maxRectangle(int heights[]){
        Stack<Integer> st = new Stack<>();
        int nxtSmallerRight[] = new int[heights.length];
        int nextSmallerLeft[] = new int[heights.length];
        

        // Loop For Next Smallest Right
        for(int i = heights.length-1; i >= 0; i--){
            // While loop
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            // if-else condition
            if(st.isEmpty()){
                nxtSmallerRight[i] = heights.length;
            } else {
                nxtSmallerRight[i] = st.peek();
            }

            // To push the element 
            st.push(i);
        }

        st.clear();

        // For next smaller to left
        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            // if-else condition
            if(st.isEmpty()){
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = st.peek();
            }

            // Pushing element 
            st.push(i);
        }

        // compute max area 
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int width = nxtSmallerRight[i] - nextSmallerLeft[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }  

    public static void main(String args[]){
     String str = "(a+b)";
     String str2 = "((a-b))";
    //  System.out.println(duplicateParentheses(str));
    //       System.out.println(duplicateParentheses(str2));

          int heights[] = {2, 1, 5, 6, 2, 3};
          System.out.println(maxRectangle(heights));
    }
}