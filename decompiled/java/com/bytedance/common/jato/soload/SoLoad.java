package com.bytedance.common.jato.soload;

import X.C07TK;
import X.C0VSJ;
import X.C2104908Ml;
import X.C2188811AlT;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class SoLoad {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static C07TK LIZJ;

    public static native long dlopenInternal(String str, boolean z);

    public static native int initSoLoadInternal(int i);

    public static native void soLoadOptStartInternal();

    public static native void soLoadOptStopInternal();

    public static boolean LIZ() {
        int i;
        return LIZ && !LIZIZ && (i = Build.VERSION.SDK_INT) >= 26 && i <= 30;
    }

    public static synchronized void LIZJ() {
        if (LIZ || LIZIZ) {
            return;
        }
        if (C2104908Ml.LIZIZ()) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                return;
            }
            if (i > 30) {
                return;
            }
            try {
                int iInitSoLoadInternal = initSoLoadInternal(i);
                if (iInitSoLoadInternal != 0) {
                    C07TK c07tk = LIZJ;
                    if (c07tk != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("init soload failed:");
                        sbLIZ.append(iInitSoLoadInternal);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c07tk.LIZ();
                    }
                    LIZIZ = true;
                }
                LIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZLLL() {
        if (LIZ()) {
            soLoadOptStartInternal();
        }
    }

    public static void LJ() {
        if (LIZ()) {
            soLoadOptStopInternal();
        }
    }

    public static void LIZIZ(Context context, String str) {
        if (LIZ()) {
            String packageCodePath = context.getPackageCodePath();
            if (packageCodePath.indexOf("base.apk") > 0) {
                boolean z = false;
                String strSubstring = packageCodePath.substring(0, packageCodePath.length() - 8);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring);
                sbLIZ.append("lib/arm64/lib");
                sbLIZ.append(str);
                sbLIZ.append(".so");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!new C0VSJ(strLIZIZ).exists()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strSubstring);
                    sbLIZ2.append("lib/arm");
                    if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).exists()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strSubstring);
                        sbLIZ3.append("lib/arm/lib");
                        sbLIZ3.append(str);
                        sbLIZ3.append(".so");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                    if ("arm64-v8a".equals(Build.CPU_ABI)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(packageCodePath);
                        sbLIZ4.append("!/lib/arm64-v8a/lib");
                        sbLIZ4.append(str);
                        sbLIZ4.append(".so");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                        z = true;
                    } else {
                        return;
                    }
                }
                dlopenInternal(strLIZIZ, z);
            }
        }
    }
}
