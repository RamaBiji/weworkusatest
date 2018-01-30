class StringReverse {
public static void main(String[] args) {
String input = "This is String reverse"; char[] temp = input.toCharArray();
int i, j=0;
j = temp.length-1;
for (i=0; i < j ; i++ ,j--) {
// Swap values of left and right char tempchar = temp [i];
temp [i] = temp [j];
temp [j]=tempchar;
}
for (char ch : temp) System.out.print(ch);
        System.out.println();
    }
}