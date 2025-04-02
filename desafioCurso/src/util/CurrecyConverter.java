package util;

public class CurrecyConverter {

    public static double conversacao(double preco, double compra) {
        return preco * compra - ((preco * compra) * 0.06);
    }
}
