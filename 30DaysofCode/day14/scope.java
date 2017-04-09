	// Add your code here

    public Difference(int[] arr){
        this.elements = arr;
    }
    void computeDifference(){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < elements.length; i++){
            min = (min > elements[i]) ? elements[i] : min;
            max = (max < elements[i]) ? elements[i] : max;
        }
        this.maximumDifference = (max - min);
    }
