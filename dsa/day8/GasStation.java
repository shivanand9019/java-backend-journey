

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                startingStation = i + 1;
                currentGas = 0;
            }
        }

        return totalGas < totalCost ? -1 : startingStation;
    }
    public static void main(String[] args) {
        

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int result = canCompleteCircuit(gas, cost);
        System.out.println("Starting gas station index: " + result); 
    }
    
}
