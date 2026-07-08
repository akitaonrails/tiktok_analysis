package ms.bd.o;

import ms.bd.o.u;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements u.b {
    public static String LIZ(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
