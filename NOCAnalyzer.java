public class NOCAnalyzer {
  public static int[] filterGoodPings(int[] arr){
      int count = 0;
      for(int i = 0; i < arr.legth; i++){
           if(arr[i] < 100) count++;
      }
      int[] goodArray = new int[count];
      int j = 0;
      for(int i = 0; i < arr.length; i++){
           if(arr[i] < 100){
               goodArray[j] = arr[i];
               j++;
          }
      }
   public static void main(String[] args) {
     int[] pings = {120, 30, 90, 200, 50, 25, 300, 80, 95, 150);
     int sum = 0;
     int max = pings[0];
     int goodcount = 0;
     int lowcount = 0;
     for(int i=0; i<pings.length; i++){
         sum += pings[i];
         if(pings[i] > max){
             max = pings[i];
         }
        if(pings[i] < 100){
            goodcount++;
        }
       if(pings[i] < 40){
           lowcount++;
       }
     }

    System.out.println(" =====NOC DAILY REPORT ======");
    System.out.println("Total Pings: " + pings.length):
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + sum / pings.length);
    System.out.println("Worst Ping (Max): " + max);
    System.out.println("Good Pings (<100): " + goodcount);
    System.out.println("Low Pings (<40): " + lowcount);
    int[] goodPings = filterGoodPings(pings);
    System.out.print("Good List: ");
    for(int i = 0; i < goodPings.length; i++){
        System.out.print(goodPings[i] + " ");
     }
  }
}

