package ms.bd.o;

/* JADX INFO: loaded from: classes4.dex */
public class d3 {
    static {
        k.a(16777217, 0, 0L, "beafdd", new byte[]{72, 59, 83, 76, 102});
    }

    public static String LIZ(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace('\r', ' ').replace('\n', ' ');
    }
}
