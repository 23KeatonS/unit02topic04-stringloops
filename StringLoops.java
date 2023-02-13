import java.util.Arrays;

public class StringLoops {

  public static String reverseCharacter(String str){
    
    String newStr = "";
    for (int i = 0; i<str.length();i++){
      newStr = str.substring(i,i+1)+newStr;
    }
    return newStr;
  }


  public static int [] indexesOfAll(String str, String searchTerm){
    
    int[] indexList = new int [0];
    for (int i = 0; i <str.length();i++){
      if (str.substring(i,i+1).equals(searchTerm)){
        int[] copyList = new int[indexList.length+1];
        for(int x = 0; x<indexList.length;x++){
          copyList[x] = indexList[x];
        }
        copyList[copyList.length-1] = i;
        indexList = copyList;
      }
    }

    return indexList;
  }

  


  public static void main(String[] args) {

    // testing of static methods goes here
    System.out.println(reverseCharacter("cat"));
    System.out.println(Arrays.toString(indexesOfAll("attack", "a")));

  }
}