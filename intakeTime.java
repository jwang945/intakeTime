import java.util.Arrays;
public class intakeTime{
    public static void main(String[] args){
        int numOfBuildings = 2;
        int[] buildingOpenTimes = {2, 10, 5};
        int[] offloadtimes = {2,20,14,1,9,2,3,1,8,7,4,5};
        System.out.println(computeShortest(numOfBuildings, buildingOpenTimes, offloadtimes));
    }
    private static int computeShortest(int numBuildings, int[] buildingOpenTime, int[] offloadTime){
        //sort the building opening times and offload times
        Arrays.sort(buildingOpenTime);
        Arrays.sort(offloadTime);
        int max = Integer.MIN_VALUE;
        //have earliest building open times take in latest offload times
        int backIndex = 4*buildingOpenTime.length -1;
        for(int i = 0; i < buildingOpenTime.length; i++){
            max = Math.max(max,offloadTime[backIndex]+buildingOpenTime[i]);
            backIndex -= 4;
        }
        return max;
    }
}