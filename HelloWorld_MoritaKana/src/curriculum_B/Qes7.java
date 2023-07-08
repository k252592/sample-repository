package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		/*
		【概要】N人の生徒の成績を入力し管理する処理
		【詳細】N人の生徒の成績を入力し、各生徒の科目平均点、全体の科目平均点、各教科の平均点を出力する
		 */

		// Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);

		// 「生徒の人数を入力してください(2以上):」と出力する
		System.out.print("生徒の人数を入力してください(2以上):");
		// 変数studentsを宣言し数値を返す
		int students = scanner.nextInt();
		// 多次元配列scoresを作成し、要素数を指定する
		int scores [][] =new int[students][4];

		// 変数iを宣言し初期化式、条件式、変化式を入力する
		for(int i =0; i < students; i++) {
			// 「〇人目の『英語』の点数を入力してください:」と出力する
			System.out.print((i+1) + "人目の『英語』の点数を入力してください:");
			// 変数englishを宣言し数値を返す
			int english = scanner.nextInt();
			// 配列scoresにenglishの数値を格納
			scores[i][0] = english;

			// 「〇人目の『数学』の点数を入力してください:」と出力する
			System.out.print((i+1) + "人目の『数学』の点数を入力してください:");
			// 変数mathを宣言し数値を返す
			int math = scanner.nextInt();
			// 配列scoresにmathの数値を格納
			scores[i][1] = math;

			// 「〇人目の『理科』の点数を入力してください:」と出力する
			System.out.print((i+1) + "人目の『理科』の点数を入力してください:");
			// 変数scienceを宣言し数値を返す
			int science = scanner.nextInt();
			// 配列scoresにscienceの数値を格納
			scores[i][2] = science;

			// 「〇人目の『社会』の点数を入力してください:」と出力する
			System.out.print((i+1) + "人目の『社会』の点数を入力してください:");
			// 変数societyを宣言し数値を返す
			int society = scanner.nextInt();
			// 配列scoresにsocietyの数値を格納
			scores[i][3] = society;

			//改行する
			System.out.println();
		}

		// 変数jを宣言し初期化式、条件式、変化式を入力する
		for(int j = 0; j < students; j++) {
			//  変数studentAvを宣言し値を代入する
			double studentAv = (scores[j][0] +  scores[j][1] + scores[j][2] + scores[j][3])/4d;
			// 変数studentAverageを宣言しstudentAvを小数第2位までの表示にして格納
			String studentAverage = String.format("%.2f",studentAv);
			// 「〇人目の平均点は〇点です。」と出力する
			System.out.println((j+1) + "人目の平均点は" + studentAverage + "点です。");
		}

		//改行する
		System.out.println();

		// 変数kを宣言し初期化する
		int k =0;
		// 変数englishSumを宣言し初期化する
		double englishSum =0d;
		// 変数mathSumを宣言し初期化する
		double mathSum =0d;
		// 変数scienceSumを宣言し初期化する
		double scienceSum =0d;
		// 変数societySumを宣言し初期化する
		double societySum =0d;

		// 変数kに初期値、条件式、変化式を入力する
		for(k =0;k < students; k++) {
			// 変数englishSumに値を代入する
			englishSum += scores[k][0];
			// 変数mathSumに値を代入する
			mathSum += scores[k][1];
			// 変数scienceSumに値を代入する
			scienceSum += scores[k][2];
			// 変数societySumに値を代入する
			societySum += scores[k][3];
		}
		
		// 変数englishAvを宣言し値を代入する
		double englishAv = englishSum / k;
		// 変数englishを宣言しenglishAvを小数第2位までの表示にして格納
		String english = String.format("%.2f",englishAv);
		// 「英語の平均点は〇点です。」と出力する
		System.out.println("英語の平均点は" + english + "点です。");

		// 変数mathAvを宣言し値を代入する
		double mathAv = mathSum / k;
		// 変数mathを宣言しmathAvを小数第2位までの表示にして格納
		String math = String.format("%.2f",mathAv);
		// 「数学の平均点は〇点です。」と出力する
		System.out.println("数学の平均点は" + math + "点です。");
		
		// 変数scienceAvを宣言し値を代入する
		double scienceAv = scienceSum / k;
		// 変数scienceを宣言しscienceAvを小数第2位までの表示にして格納
		String science = String.format("%.2f",scienceAv);
		// 「理科の平均点は〇点です。」と出力する
		System.out.println("理科の平均点は" + science + "点です。");
		
		// 変数societyAvを宣言し値を代入する
		double societyAv = societySum / k;
		// 変数societyを宣言しsocietyAvを小数第2位までの表示にして格納
		String society = String.format("%.2f",societyAv);
		// 「社会の平均点は〇点です。」と出力する
		System.out.println("社会の平均点は" + society + "点です。");

		// 変数allAvを宣言し値を代入する
		double allAv = (englishAv + mathAv + scienceAv +societyAv) / 4d;
		// 変数avarageを宣言しallAvを小数第2位までの表示にして格納
		String avarage = String.format("%.2f",allAv);
		// 「全体の平均点は〇点です。」と出力する
		System.out.println("全体の平均点は" + avarage + "点です。");

	}

}
