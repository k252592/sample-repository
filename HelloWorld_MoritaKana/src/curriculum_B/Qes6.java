package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		/*
		【概要】入力した商品の残り台数が出力される処理
		【詳細】拡張for文で入力回数の縛りをなくし、Switch文と条件演算子で条件を付けて出力する
		 */
		
		// 変数scProductを宣言し標準入力を取得する
		Scanner scProduct = new Scanner(System.in);

		// 変数productを宣言し行を返す
		String product = scProduct.next();


		//	配列productsを作成し、productの中身を"、"で区切って格納する
		String[] products = product.split("、");


		for(String str:products) {
			//変数strを作成し配列productsの要素を格納

			// 残り台数を表す乱数を生成
			Random productStock = new Random();
			// 変数stockに格納
			int stock = productStock.nextInt(11) + 1;


			switch (str){

			// strが"パソコン"の場合
			case "パソコン":
				// 「パソコンの残り台数は〇台です」と出力
				System.out.println(str +"の残り台数は" + stock + "台です");
				// 改行する
				System.out.println();
				// 処理を抜ける
				break;

			// strが"冷蔵庫"の場合
			case "冷蔵庫":
				// 「冷蔵庫の残り台数は〇台です」と出力
				System.out.println(str + "の残り台数は" + stock + "台です");
				// 改行する
				System.out.println();
				// 処理を抜ける
				break;
			
			// strが"扇風機"の場合
			case "扇風機":
				// 「扇風機の残り台数は〇台です」と出力
				System.out.println(str + "の残り台数は" + stock + "台です");
				// 改行する
				System.out.println();
				// 処理を抜ける
				break;

			// strが"洗濯機"の場合
			case "洗濯機":
				// 「洗濯機の残り台数は〇台です」と出力
				System.out.println(str +"の残り台数は" + stock + "台です");
				// 改行する
				System.out.println();
				// 処理を抜ける
				break;

			// strが"加湿器"の場合
			case "加湿器":
				// 「加湿器の残り台数は〇台です」と出力
				System.out.println(str +"の残り台数は" + stock + "台です");
				// 改行する
				System.out.println();
				// 処理を抜ける
				break;

			// strが"テレビ"、"ディスプレイ"の場合
			case "テレビ":  
			case "ディスプレイ":
				//  strが"テレビ"の場合「テレビの残り台数は〇台です」と出力
				// strが"ディスプレイ"の場合「ディスプレイの残り台数は〇台です」と出力
				System.out.println(str == "テレビ" ? str + "の残り台数は" + stock + "台です" : str +"の残り台数は" + (11-stock) + "台です");
				// 改行する
				System.out.println();
				// 処理を抜ける
				break;

			// それ以外の場合
			default:
				//「○○は指定の商品ではありません」と出力
				System.out.println("『" + str + "』" + "は指定の商品ではありません");

			}		
		}
	}
}
