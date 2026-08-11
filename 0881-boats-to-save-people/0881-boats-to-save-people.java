class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //weight should be atmost limit
        //a boat can only carry atmost 2 people
        Arrays.sort(people);
        //now the array has been sorted
        int left = 0;
        int right = people.length-1;
        int boat = 0;
        while(left<=right){
            //if the weight of heaviest and lightes person can go together we pair them 
            //else heaviest person goes alone

            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boat++;

        }
        return boat;
    }
}