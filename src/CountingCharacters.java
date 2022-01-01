public class CountingCharacters {

//    create two input strings
//function that takes two strings as arguments
//    the function returns number of times the first string is found in the second string



    public static void main (String[] args){

//        Create an instance of the class
        CountingCharacters countingC = new CountingCharacters();

//        call the function
        System.out.println(countingC.charCount('b', "big fat bubble"));
    }

    public int charCount(char a, String b){
int count = 0;

//converting the string to char array
char[] charArray = b.toCharArray();

for (int i=0;i<charArray.length;i++){
    if(charArray[i] == a){
count++;
    }
}
//        if(b.contains(a)){
//            count++;
//
//        }
        return count;

    }
}
