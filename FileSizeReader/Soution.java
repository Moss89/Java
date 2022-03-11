class Solution {

    public static void main(String[] args) {
        System.out.println(P1("hello.mp3 11b\nBob.flac 12b\nenxi.bmp 34b\ntom.txt 45b\ntommy.jar 450b"));
    }

    static public String P1(String S) {
        String[] inputLines = S.split("\n");
        String myString = "";
        int image = 0;
        int movie = 0;
        int music = 0;
        int other = 0;

        String result = "";
        for (int i = 0; i<inputLines.length; i++){
            myString = inputLines[i];
            int extensionDot = myString.lastIndexOf( '.');
            int space = myString.indexOf(' ');
            String extensionType = myString.substring(extensionDot+1,space);
            int bits = myString.lastIndexOf('b');
            String size = myString.substring(space+1,bits);
            int sizeInt = Integer.parseInt(size);
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
                default:
                    other += sizeInt;

            }

        }
        result = "music " + music + "b\nimages " + image + "b\nmovies " + movie + "b\nother " + other + "b";
        return result;
    }

}
