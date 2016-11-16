/**
 * Created by vince on 16/11/2016.
 */
public class NimGame {
    public static boolean canWinNim(int n) {

        //分析假设你每次拿x个石子，对手拿4-x 只有石子是不是4的整数倍的时候才会赢
        if (n % 4 == 0)
            return false;
        else return true;
    }
}
