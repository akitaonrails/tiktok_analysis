package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class x3 {
    public static String b = "0.17.0";

    public static final String b() {
        Object c098200Yq;
        try {
            v3.s.getClass();
            if (v3.u.g == null) {
                return "";
            }
            ua.a.b().e().getClass();
            new va();
            c098200Yq = va.c;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            q3.b.b(q3.a, "Orbuhash value is not available at this time", "DeviceUtils", null, 4, null);
        }
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq);
    }

    public static final String c() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static final String a() {
        return b;
    }

    public static final String d() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0002, B:5:0x0009, B:7:0x000f, B:13:0x0038, B:16:0x003d, B:8:0x0025, B:10:0x002b), top: B:24:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(android.content.Context r7) {
        /*
            java.lang.String r6 = "unknown"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L41
            r0 = 33
            r5 = 0
            if (r1 < r0) goto L25
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L35
            java.lang.String r3 = r7.getPackageName()     // Catch: java.lang.Throwable -> L41
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r2 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)     // Catch: java.lang.Throwable -> L41
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "YCtuUwA8StnfVEMkQVycNQ=="
            r1.<init>(r0, r5)     // Catch: java.lang.Throwable -> L41
            android.content.pm.PackageInfo r0 = X.C2204961BRm.LJJJJLI(r4, r3, r2, r1)     // Catch: java.lang.Throwable -> L41
            goto L36
        L25:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L35
            java.lang.String r1 = r7.getPackageName()     // Catch: java.lang.Throwable -> L41
            r0 = 0
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r2, r1, r0)     // Catch: java.lang.Throwable -> L41
            goto L36
        L35:
            r0 = r5
        L36:
            if (r0 == 0) goto L3a
            java.lang.String r5 = r0.versionName     // Catch: java.lang.Throwable -> L41
        L3a:
            if (r5 != 0) goto L3d
            r5 = r6
        L3d:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L41
            goto L4d
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L4d:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 != 0) goto L54
            r6 = r5
        L54:
            java.lang.String r6 = (java.lang.String) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.x3.a(android.content.Context):java.lang.String");
    }

    public static final String b(Context context) {
        String packageName;
        Object c098200Yq;
        try {
            packageName = context.getPackageName();
            try {
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            packageName = "unknown";
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return packageName;
    }

    public static final void a(String str) {
        b = str;
    }
}
