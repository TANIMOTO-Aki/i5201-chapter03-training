/*
 * 単価と数量の入力後、売上金額を計算して表示する。
 */
import java.io.*;

public class EX3_Uriage {
    public static void main(String[] args) throws IOException {
        int qty;
        int price;

    /* 入力準備 */
    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

    /* 入力 */
    System.out.print("数量？");
    qty = Integer.parseInt(br.readLine());

    System.out.print("単価？");
    price = Integer.parseInt(br.readLine());

    System.out.println();                       // 改行

    System.out.println("売上 = " + (qty * price));
    }
}
