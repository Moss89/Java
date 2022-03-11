class Solution {

    public static void main(String[] args) {
        System.out.println(P1("hello.mp3 11b\nBob.flac 12b\nenxi.bmp 34b\ntom.txt 45b\ntommy.jar 450b"));
    }

    static public String P1(String S) {
//        split the string with space
        String[] inputLines = S.split("\n");
//       create the input string
        String myString = "";
//        initialize count these four type
        int image = 0;
        int movie = 0;
        int music = 0;
        int other = 0;

//        create a string for the output
        String result = "";
//        for loop each string that have split by space
        for (int i = 0; i<inputLines.length; i++){
            myString = inputLines[i];
//            split each line's string by the last occurrence of "." and the space " " , return the file's type
            int extensionDot = myString.lastIndexOf( '.');
            int space = myString.indexOf(' ');
//            extensionType is the string of the file's type
            String extensionType = myString.substring(extensionDot+1,space);
//            split each line's string by last occurrence of "b" and the space" ", return the string size
            int bits = myString.lastIndexOf('b');
            String size = myString.substring(space+1,bits);
//            turn the string size to int
            int sizeInt = Integer.parseInt(size);
//          this is different cases if the type is music/image/movie type, add their size together
            switch(extensionType){
                case "mp3":
                case "aac":
                case "flac":
                    music += sizeInt;
                    break;
                case "jpg":
                case "bmp":
                case "gif":
                    image += sizeInt;
                    break;
                case "mp4":
                case "avi":
                case "mkv":
                    movie += sizeInt;
                    break;

//        considering the there have other kind of file may be occured in this string
//        I added the others type of file's size together, print them out as well
                default:
                    other += sizeInt;

            }

        }
//        print the result
        result = "music " + music + "b\nimages " + image + "b\nmovies " + movie + "b\nother " + other + "b";
        return result;
    }

}