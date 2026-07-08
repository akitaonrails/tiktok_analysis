package com.lynx.canvas;

import X.AbstractC1304370k31;
import X.C1288370jdD;
import X.C1304360k30;
import X.C2188811AlT;
import X.EnumC1154820g9o;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasPermissionManager {
    public static native void nativeOnUserMediaPermissionResponse(long j, boolean z);

    public static boolean RequestUserMediaGranted(KryptonApp kryptonApp, boolean z, boolean z2) {
        return LIZ(kryptonApp, z, z2, null);
    }

    public static boolean LIZ(KryptonApp kryptonApp, boolean z, boolean z2, C1304360k30 c1304360k30) {
        boolean z3;
        if (kryptonApp != null) {
            synchronized (kryptonApp) {
                try {
                    if (kryptonApp.LIZJ != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z3) {
                AbstractC1304370k31 abstractC1304370k31 = (AbstractC1304370k31) kryptonApp.LJ(AbstractC1304370k31.class);
                if (abstractC1304370k31 == null) {
                    if (c1304360k30 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("request permission video:");
                        sbLIZ.append(z);
                        sbLIZ.append(" audio:");
                        sbLIZ.append(z2);
                        sbLIZ.append(" force allow, no permission service found");
                        C1288370jdD.LIZJ("KryptonCanvasPermissionManager", C2188811AlT.LIZIZ(sbLIZ));
                        c1304360k30.LIZ();
                    }
                    return true;
                }
                LinkedList linkedList = new LinkedList();
                if (z) {
                    linkedList.add(EnumC1154820g9o.CAMERA);
                }
                if (z2) {
                    linkedList.add(EnumC1154820g9o.RECORD_AUDIO);
                }
                if (abstractC1304370k31.LIZ()) {
                    if (c1304360k30 != null) {
                        c1304360k30.LIZ();
                    }
                    return true;
                }
                if (c1304360k30 == null) {
                    return false;
                }
                abstractC1304370k31.LIZIZ();
                return true;
            }
        }
        return false;
    }

    public static void RequestUserMediaPermission(KryptonApp kryptonApp, boolean z, boolean z2, long j) {
        LIZ(kryptonApp, z, z2, new C1304360k30(z, z2, j));
    }
}
