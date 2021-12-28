class CheatSheet {
    public int[] methodName(int[] nums, int target) {
        for (int a = 0; a < nums.length; a++) {}
        if (nums[a] + nums[b] == target) {}
        // Return a new array directly
        int memo[] = new int[n + 1];
        int memo[] = {1, 2, 3, 4};
        String numString = Integer.toString(number);
        return new int[] {0};
        return null;
        System.out.println("Print something")
        s.charAt(i);
    }

    // Hashmap has key + value pair
    public int[] hashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            map.remove(nums[i])
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
    }

    // Hashset only has value
    public int[] hashSet(int[] nums, int target) {
        HashSet<String> set=new HashSet();  
        set.add("One");
        set.contains("One")    
    }

    // ArrayLit
    public int[] arrayList() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.get(0);
        cars.set(0, "Opel");
        cars.remove(0);
    }

    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public hashMapForLoop(HashMap<Object, Object> hmap = new HashMap<Object, Object>) {
        for (Map.Entry me : hmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}