package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		/*1,2,3
		【概要】ログイン時の入力チェックシステムを作成する処理
		【詳細】コンソールにユーザー名を入力し条件を指定して出力する
				正常にユーザー名を登録した場合にじゃんけんを実行する
		 */
		// 変数scUserNameを宣言し標準入力を取得する
		Scanner scName = new Scanner(System.in);
		// 変数nameを宣言し行を返す
		String name = scName.nextLine();


		if(name.length() <= 0 || name == null) {
			// ユーザー名の文字数が0文字以下もしくはnull場合の処理
			// 「名前を入力してください」と出力
			System.out.println("名前を入力してください");
		}else if(!name.matches("^[A-Za-z0-9]+$")) {
			// ユーザー名が半角英数字以外の場合の処理
			// 「半角英数字のみで名前を入力してください」と出力
			System.out.println("半角英数字のみで名前を入力してください");

		}else if(name.length() > 10) {
			// ユーザー名の文字数が10文字を超えた場合の処理
			//「名前を10文字以内にしてください」と出力
			System.out.println("名前を10文字以内にしてください");
		}else  {
			// それ以外の場合(正常な値の場合)の処理
			// 「ユーザー名「入力したユーザー名」を登録しました」と出力
			System.out.println("ユーザー名「" + name + "」を登録しました");

			// じゃんけんの回数を格納する変数jankenNumを作成し初期値0を代入
			int jankenNum = 0;

			// whileで1回ごとに出力する処理
			while(true) {


				// 自分の手の乱数を生成
				Random myRand = new Random();
				// 変数myHandに格納
				int myHand = myRand.nextInt(3) + 0;
				// 自分の手の種類を格納する変数meを宣言し初期値""を代入
				String me ="";
				if(myHand ==0) {
					// myHandが0の場合"グー"を出力
					me = "グー";
				}else if(myHand ==1) {
					// myHandが1の場合"チョキ"を出力
					me = "チョキ";
				}else if(myHand ==2) {
					// myHandが2の場合"パー"を出力
					me = "パー";
				}

				// 相手の手の乱数を生成
				Random opponentRand = new Random();
				// 変数myHandに格納
				int opponentHand = opponentRand.nextInt(3) + 0;
				// 相手の手の種類を格納する変数opponentを宣言し初期値""を代入
				String opponent ="";
				if(opponentHand ==0) {
					// opponentHandが0の場合"グー"を出力
					opponent = "グー";
				}else if(opponentHand ==1) {
					// opponentHandが1の場合"チョキ"を出力
					opponent = "チョキ";
				}else if(opponentHand ==2) {
					// opponentHandが2の場合"パー"を出力
					opponent = "パー";
				}


				// じゃんけんの回数をカウントする
				jankenNum++;

				// 自分の手を出力
				System.out.println(name + "の手は"+ me);
				// 相手の手を出力
				System.out.println("相手の手は"+ opponent);
				// 改行する
				System.out.println();

				if(myHand == opponentHand){
					// あいこの場合の処理						
					// 「DRAW あいこ もう一回しましょう！」を出力
					System.out.println("DRAW あいこ もう一回しましょう！");
					// 改行する
					System.out.println();

				}else if(myHand ==1 && opponentHand == 0){
					// グーに負けた場合の処理						
					// 「俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！」を出力
					System.out.println("俺の勝ち！\r\n負けは次につながるチャンスです！\r\nネバーギブアップ！");						
					// 改行する
					System.out.println();

				}else if(myHand ==2 && opponentHand == 1){
					// チョキに負けた場合の処理
					// 「俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ」を出力
					System.out.println("俺の勝ち！\r\nたかがじゃんけん、そう思ってないですか？\r\nそれやったら次も、俺が勝ちますよ");						
					// 改行する
					System.out.println();

				}else if(myHand ==0 && opponentHand == 2){
					// パーに負けた場合の処理
					// 「俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです」を出力
					System.out.println("俺の勝ち！\r\nなんで負けたか、明日まで考えといてください。\r\nそしたら何かが見えてくるはずです");						
					// 改行する
					System.out.println();

				}else {
					// それ以外(勝った場合)の場合の処理
					// 「やるやん。次は俺にリベンジさせて」を出力
					System.out.println("やるやん。\r\n次は俺にリベンジさせて");
					// 改行する
					System.out.println();
					// 勝つまでにかかった回数
					System.out.println("勝つまでにかかった合計回数は" + jankenNum + "回です");
					// 処理を抜ける
					break;
				}
			}
		}	
	}
}




