
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんぼろう！");
		}
	}
	// switch文 : 分岐処理の開始
	// case : 値が〇の場合にブロックを実行
	// break : switch文を終了
	// default : 全てのcaseの値に一致しない場合にブロックを実行

}
