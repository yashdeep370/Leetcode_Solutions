class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        int level = 0;
        for(char ch: s.toCharArray())
        {
            if(ch == '(')
            {
                if(level>0)
                {
                    builder.append(ch);
                }
                level++;
            }
            else if(ch == ')')
            {
                level--;
                if(level > 0)
                {
                    builder.append(ch);
                }
            }
        }
        return builder.toString();
    }
}