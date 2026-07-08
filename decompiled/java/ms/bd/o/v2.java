package ms.bd.o;

import X.C0VSF;
import X.C0VSJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class v2 {
    public static final String LIZ = (String) k.a(16777217, 0, 0, "823848", new byte[]{25, 34, 79, 79, 14, 60, 40, 28, 112});
    public static final String LIZIZ = (String) k.a(16777217, 0, 0, "353700", new byte[]{10, 54, 82, 71, 24, 38, 34, 17});
    public static final String LIZJ = (String) k.a(16777217, 0, 0, "4960de", new byte[]{3, 62, 68, 80, 78, 96, 50, 11});
    public static final String LIZLLL = (String) k.a(16777217, 0, 0, "4e4d61", new byte[]{53, 100});
    public static final String LJ = (String) k.a(16777217, 0, 0, "f3069d", new byte[]{127, 38});
    public static final String LJFF = (String) k.a(16777217, 0, 0, "4be1c5", new byte[]{35, 116});
    public static final String LJI = (String) k.a(16777217, 0, 0, "1f784f", new byte[]{45, 101, 92});
    public static final String LJII = (String) k.a(16777217, 0, 0, "385371", new byte[]{47, 51, 72});
    public static final String LJIIIIZZ = (String) k.a(16777217, 0, 0, "22b524", new byte[]{32, 63, 3, 68});
    public static final FileFilter LJIIIZ = new a();

    public static class a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches((String) k.a(16777217, 0, 0L, "b528b8", new byte[]{112, 39, 84, 119, 13, 98, 56, 41}), file.getName());
        }
    }

    public static int LIZ() {
        try {
            return new C0VSJ((String) k.a(16777217, 0, 0L, "36cc31", new byte[]{109, 39, 9, 4, 67, 34, 53, 1, 59, 48, 39, 39, 95, 4, 21, 53, 36, 18, 63, 124, 33, 36, 5, 88})).listFiles(LJIIIZ).length;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r10) {
        /*
            r6 = 0
            r3 = 1
            r4 = 0
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L22
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.String r9 = "176413"
            byte[] r10 = new byte[r3]     // Catch: java.lang.Throwable -> L3f
            r0 = 112(0x70, float:1.57E-43)
            r10[r6] = r0     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = ms.bd.o.k.a(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3f
            return r0
        L22:
            X.0VSF r2 = new X.0VSF     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L46
            r1.close()     // Catch: java.lang.Throwable -> L34
            goto L56
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L56
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r4
            goto L4a
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = r4
            r1 = r4
            goto L4a
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            if (r1 == 0) goto L54
            r1.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            if (r2 == 0) goto L5e
        L56:
            r2.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            if (r4 != 0) goto L74
            byte[] r10 = new byte[r3]
            r0 = 118(0x76, float:1.65E-43)
            r10[r6] = r0
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            java.lang.String r9 = "7b81b4"
            java.lang.Object r0 = ms.bd.o.k.a(r5, r6, r7, r9, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L74:
            java.lang.String r0 = r4.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.v2.LIZIZ(java.lang.String):java.lang.String");
    }

    public static String LIZJ(String str, HashMap map) {
        String str2;
        try {
            str2 = (String) map.get(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    public static HashMap<String, String> LIZLLL() {
        C0VSF c0vsf;
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            c0vsf = new C0VSF((String) k.a(16777217, 0, 0L, "aa2869", new byte[]{63, 115, 83, 67, 10, 97, 97, 80, 118, 97, 126, 101, 78}));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(c0vsf);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split((String) k.a(16777217, 0, 0L, "fc4ff6", new byte[]{45}), 2);
                        if (strArrSplit.length >= 2) {
                            String strTrim = strArrSplit[0].trim();
                            String strTrim2 = strArrSplit[1].trim();
                            if (map.get(strTrim) == null) {
                                map.put(strTrim, strTrim2);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                        if (c0vsf != null) {
                        }
                        return map;
                    }
                }
                try {
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c0vsf = null;
        }
        try {
            c0vsf.close();
            return map;
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            return map;
        }
    }
}
