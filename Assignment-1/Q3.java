import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

public class Q3 {

    public static void main(String[] args) {
        solve_parenthesis("(3*(3+1)-3*2+1=19");
    }
    static void solve_parenthesis(String equation){
        String[]  sides = equation.split("=");
                String lhs = sides[0].trim();
        String rhs = sides[1].trim();
        int rhs_number = Integer.parseInt(rhs,10);
        for(int i=0;i< lhs.length()+1;i++){
            String correctedLHS = lhs.substring(0,i)+")"+lhs.substring(i);
            try{
// exp4j evaluates the equation for us whether the brackets are right, correctness of the equation
// we are not doing throw error we are
// skipping on catch, if expression is wrong then library gives error
// so we need to ignore that error
                ExpressionBuilder e = new ExpressionBuilder(correctedLHS);
                int result = (int) e.build().calculate();
            if (result == rhs_number) {
                    System.out.print(correctedLHS);
                }
            } catch (Exception e){
            }
        }
    }

}<