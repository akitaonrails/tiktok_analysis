package ms.bd.o;

import X.C080U;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends o {
    public static String LJII(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C080U c080u = (C080U) it2.next();
            if (c080u != null && ((String) k.a(16777217, 0, 0L, "0c8076", new byte[]{57, 44, 95, 80, 69, 45, 60, 69, 96, 100})).equalsIgnoreCase(c080u.LIZ)) {
                return c080u.LIZIZ;
            }
        }
        return null;
    }

    @Override // ms.bd.o.o
    public final Object[] LJ(String str, String str2) {
        return LJIIIIZZ(str, null, str2, null, false);
    }

    @Override // ms.bd.o.o
    public final Object[] LJFF(String str, String str2, String str3) {
        return LJIIIIZZ(str, null, str3, str2, false);
    }

    @Override // ms.bd.o.o
    public final Object[] LJI(String str, String str2, byte[] bArr) {
        return LJIIIIZZ(str, bArr, str2, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029a A[Catch: all -> 0x02d8, TryCatch #4 {all -> 0x02d8, blocks: (B:54:0x0277, B:56:0x029a, B:58:0x02a4, B:62:0x02ab, B:64:0x02ae, B:72:0x02d6, B:73:0x02d7, B:61:0x02a9), top: B:86:0x0277, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a6  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v0, types: [ms.bd.o.m$a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ms.bd.o.m$a] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJIIIIZZ(java.lang.String r44, byte[] r45, java.lang.String r46, java.lang.String r47, boolean r48) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.q.LJIIIIZZ(java.lang.String, byte[], java.lang.String, java.lang.String, boolean):java.lang.Object[]");
    }
}
