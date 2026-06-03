//Pascal's Triangle
import java.util.ArrayList;
import java.util.List;
class Problem118 {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();

        for (int i=1;i<=numRows;i++) {

            List<Integer> newRow=new ArrayList<>();
            long result=1;

            newRow.add(1);

            for (int j=1;j<i;j++) {
                result = result*(i-j)/j;
                newRow.add((int) result);
            }

            ans.add(newRow);
        }

        return ans;
    }
}