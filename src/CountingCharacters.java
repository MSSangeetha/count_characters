public class CountingCharacters {

//    create two input strings
//function that takes two strings as arguments
//    the function returns number of times the first string is found in the second string



    public static void main (String[] args){

//        Create an instance of the class
        CountingCharacters countingC = new CountingCharacters();

//        call the function to find the number of times the letter is present in String
        System.out.println("The letter count is " + countingC.charCount('b', "big fat bubble"));

//        call the function to find number of times a string present in another string
        System.out.println("The string count is " + countingC.stringCount("aa","kaaaaple"));
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

    public int stringCount(String c, String d){
        int times = 0;

        int index = d.indexOf(c);
//        System.out.println(index);

        while(index!=-1){
            times++;
            d = d.substring(index+2,d.length());
            System.out.println("The substring is " + d);
            index = d.indexOf(c);
        }

//        if(d.contains(c)){
//            times++;
//        }

        return times;
    }
}
