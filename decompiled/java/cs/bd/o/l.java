package cs.bd.o;

import cs.bd.o.i;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements i.b {
    public static String LIZ(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
