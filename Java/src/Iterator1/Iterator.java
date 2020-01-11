package Iterator1;

/*
 * 数え上げ、スキャンを行うインターフェイス
 */

public interface Iterator {
	//次のものがあるかないかを調べる
	public abstract boolean hasNext();
	//今を返し、次に進める
	public abstract Object next();

}
