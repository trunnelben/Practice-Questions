public static void main(String[] args) {
      List<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(4);
      list.add(8);
      list.add(2);
      list.add(10);
      list.add(8);
      list.add(4);
      HashSet<Integer> duplicates = new HashSet<Integer>();
      for(int i = 0; i < list.size(); i++){
        if(duplicates.add(list.get(i))){
        }
        else{
          System.out.println(list.get(i));
          break;
        }
      }
 }

