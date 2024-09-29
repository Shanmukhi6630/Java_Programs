public class Pangram
{
    public static void main(String s[]) 
    {
        String sentence = "The quick brown fox jumps over the lazy Dog.";
        if (isPangram(sentence)) 
        {
            System.out.println(1);
        }
        else 
        {
            System.out.println(-1);
        }
    }
    public static boolean isPangram(String sentence) 
    {
        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (!sentence.toLowerCase().contains(String.valueOf(c))) 
            {
                return false;
            }
        }
        return true;
    }
}
