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

  public static boolean repeatedConsec(String str){
    
    for (int i = 0; i<str.length()-1; i++){
      if (str.substring(i,i+1).equals(str.substring(i+1,i+2))){
        return true;
      }
    }
    
    return false;
  }

public static String reverseWords(String str){
  
  String newStr = "";
  int endIndex = str.length();
  for (int i = str.length()-1; i>0; i--){
    if (str.substring(i-1,i).equals(" ")){
      newStr += str.substring(i,endIndex)+" ";
      endIndex = i-1;
    }
  }
  newStr += str.substring(0,str.indexOf(" "));
  return newStr;
    
}


  public static void main(String[] args) {

    // testing of static methods goes here
    System.out.println(reverseCharacter("cat"));
    System.out.println(Arrays.toString(indexesOfAll("attack", "a")));
    System.out.println(repeatedConsec("hello"));
    System.out.println(reverseWords("taco cat"));
  }
}