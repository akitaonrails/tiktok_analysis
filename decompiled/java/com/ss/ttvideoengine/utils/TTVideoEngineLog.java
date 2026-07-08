package com.ss.ttvideoengine.utils;

import X.C1471660oOq;
import X.InterfaceC1469330oL5;

/* JADX INFO: loaded from: classes24.dex */
public class TTVideoEngineLog {
    public static void d(Throwable th) {
    }

    public static boolean d() {
        return ((C1471660oOq.LIZ >> 1) & 1) == 1 || ((C1471660oOq.LIZJ >> 1) & 1) == 1;
    }

    public static boolean e() {
        return ((C1471660oOq.LIZ >> 6) & 1) == 1 || ((C1471660oOq.LIZJ >> 6) & 1) == 1;
    }

    public static int getLogNotifyLevel() {
        return C1471660oOq.LIZJ;
    }

    public static int getLogTurnOn() {
        return C1471660oOq.LIZ;
    }

    public static void setListener(InterfaceC1469330oL5 interfaceC1469330oL5) {
        C1471660oOq.LIZIZ = interfaceC1469330oL5;
    }

    public static void _notifyListener(String str, String str2) {
        C1471660oOq.LIZ(str, str2);
    }

    public static void d(String str, String str2) {
        if (((C1471660oOq.LIZJ >> 1) & 1) == 1) {
            C1471660oOq.LIZ(str, str2);
        }
    }

    public static void e(String str, String str2) {
        C1471660oOq.LIZIZ(str, str2);
    }

    public static void i(String str, String str2) {
        C1471660oOq.LIZJ(str, str2);
    }

    public static void k(String str, String str2) {
        if (((C1471660oOq.LIZJ >> 4) & 1) == 1) {
            C1471660oOq.LIZ(str, str2);
        }
    }

    public static void setLogNotifyLevel(int i, int i2) {
        C1471660oOq.LIZJ = (i2 << i) | ((~(1 << i)) & C1471660oOq.LIZJ);
    }

    public static void t(String str, String str2) {
        if (((C1471660oOq.LIZJ >> 3) & 1) == 1) {
            C1471660oOq.LIZ(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void turnOn(int r5, int r6) {
        /*
            r4 = 1
            int r0 = r4 << r5
            int r1 = ~r0
            int r0 = X.C1471660oOq.LIZ
            r1 = r1 & r0
            int r0 = r6 << r5
            r1 = r1 | r0
            X.C1471660oOq.LIZ = r1
            if (r5 != r4) goto L46
            if (r6 != r4) goto L48
            r0 = r1 & (-5)
            r0 = r0 | 4
            X.C1471660oOq.LIZ = r0
        L16:
            X.0oJu r1 = X.C1468590oJt.LIZ
            if (r1 == 0) goto L24
            r0 = 33
            r1.LJFF(r0, r4)
            X.C1468590oJt.LIZ = r1
            r1.LIZLLL()
        L24:
            X.0kAe r0 = X.C1309150kAj.LIZ
            r0.LJ = r4
        L28:
            r3 = 10000(0x2710, float:1.4013E-41)
            r2 = 5
            if (r6 <= 0) goto L51
            com.ss.ttvideoengine.DataLoaderHelper r0 = X.C805420Vie.LIZ
            r0.getClass()
            if (r5 != r4) goto L42
            r5 = 1
        L35:
            r2 = r5
        L36:
            X.0oKo r1 = X.C790230UzF.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r0 = r1.LIZJ()
            r0.setIntValue(r3, r2)
            r1.LJIIJ = r2
            return
        L42:
            r0 = 4
            if (r5 < r0) goto L35
            goto L36
        L46:
            if (r5 != r4) goto L4b
        L48:
            if (r6 != r4) goto L4b
            goto L16
        L4b:
            X.0kAe r1 = X.C1309150kAj.LIZ
            r0 = 0
            r1.LJ = r0
            goto L28
        L51:
            com.ss.ttvideoengine.DataLoaderHelper r0 = X.C805420Vie.LIZ
            r0.getClass()
            X.0oKo r1 = X.C790230UzF.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r0 = r1.LIZJ()
            r0.setIntValue(r3, r2)
            r1.LJIIJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.utils.TTVideoEngineLog.turnOn(int, int):void");
    }

    public static void w(String str, String str2) {
        if (((C1471660oOq.LIZJ >> 5) & 1) == 1) {
            C1471660oOq.LIZ(str, str2);
        }
    }
}
