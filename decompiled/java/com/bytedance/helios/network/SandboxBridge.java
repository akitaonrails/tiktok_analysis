package com.bytedance.helios.network;

import X.C0C40;
import X.C0WRV;
import X.C0WSB;
import X.C823280WRi;
import X.C825320WZe;
import X.C826640Wbm;
import X.C840180Wxc;
import X.C840240Wxi;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class SandboxBridge {
    public static native void testFromNative();

    static {
        System.nanoTime();
        if (C825320WZe.LIZLLL()) {
            C826640Wbm.LIZ("pumbaa-network");
        }
        System.nanoTime();
    }

    public static void testNative() {
        C825320WZe.LIZLLL();
    }

    public static boolean matchAgSchema(String str) {
        if (str == null) {
            return false;
        }
        try {
            URL url = new URL(str);
            return C840180Wxc.LIZJ(url.getHost(), url.getPath());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C823280WRi.LIZLLL(e);
            return false;
        }
    }

    public static C840240Wxi startTrackPerf(Map<String, String> map) {
        String str;
        if (map == null) {
            str = null;
        } else {
            try {
                str = map.get("function_sig_name");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C823280WRi.LIZLLL(th);
                return null;
            }
        }
        PumbaaPerformanceTrackManager.LJIIIIZZ(str, "NetworkSandboxBridge");
        C0WSB c0wsbLIZIZ = PumbaaPerformanceTrackManager.LIZIZ(str);
        if (c0wsbLIZIZ == null) {
            return null;
        }
        c0wsbLIZIZ.LJIIIZ();
        return new C840240Wxi(c0wsbLIZIZ, c0wsbLIZIZ.LJFF("NetworkSandboxBridge"));
    }

    public static void stopTrackPerf(C840240Wxi c840240Wxi) {
        if (c840240Wxi == null) {
            return;
        }
        c840240Wxi.LIZIZ.stop();
        c840240Wxi.LIZ.LJIILJJIL();
    }

    public static void monitorCost(String str, long j) {
        try {
            C0WRV.LIZ(j, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZLLL(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[Catch: all -> 0x01d0, TRY_ENTER, TryCatch #0 {all -> 0x01d0, blocks: (B:26:0x00a9, B:29:0x00b4, B:31:0x00bf, B:32:0x00c1, B:36:0x00ca, B:39:0x00d4, B:42:0x00e1, B:45:0x00ee, B:48:0x0102, B:51:0x0128, B:54:0x0135, B:58:0x0146), top: B:409:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6 A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #4 {all -> 0x01ca, blocks: (B:62:0x0160, B:65:0x016c, B:67:0x017c, B:71:0x0188, B:74:0x019e, B:79:0x01b3, B:80:0x01b6), top: B:417:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int handleByPumbaa(java.lang.String r26, java.lang.String r27, java.util.Map<java.lang.String, java.lang.String> r28, java.nio.ByteBuffer r29, int r30, java.util.Map<java.lang.String, java.lang.String> r31) {
        /*
            Method dump skipped, instruction units count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.SandboxBridge.handleByPumbaa(java.lang.String, java.lang.String, java.util.Map, java.nio.ByteBuffer, int, java.util.Map):int");
    }

    public static int handleByPumbaa2(String str, String str2, String str3, ByteBuffer byteBuffer, int i, String str4) {
        Map map;
        if (!C825320WZe.LIZLLL()) {
            return 1;
        }
        Gson gson = C0C40.LIZ;
        Map map2 = null;
        if (str3 != null) {
            try {
                map = (Map) C0C40.LIZ.LJIIIIZZ(str3, C0C40.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                map = null;
            }
        } else {
            map = null;
        }
        if (str4 != null) {
            try {
                map2 = (Map) C0C40.LIZ.LJIIIIZZ(str4, C0C40.LIZIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return handleByPumbaa(str, str2, map, byteBuffer, i, map2);
    }
}
