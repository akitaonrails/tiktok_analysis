package com.ss.android.ugc.aweme.memory;

import X.C09CT;
import X.C2188811AlT;
import X.C844470XAv;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public final class GMTManager {

    public static class GMTSettingParams {

        @C09CT("enable_on_release")
        public boolean enable_on_release;

        @C09CT("gmt_config")
        public int gmt_config = 273;

        @C09CT("gmt_dump_threshold")
        public int gmt_dump_threshold = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

        @C09CT("gmt_record_threshold")
        public int gmt_record_threshold = 1048576;
    }

    public static boolean LIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return contextLIZ.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isOk ");
            sbLIZ.append(th);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:44|(2:39|6)|(2:49|7)|(5:9|47|10|23|(2:25|26)(1:51))|41|19|22|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r5) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.memory.GMTManager.LIZIZ(android.content.Context):void");
    }
}
