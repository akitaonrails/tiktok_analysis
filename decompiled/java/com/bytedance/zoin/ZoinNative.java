package com.bytedance.zoin;

import X.C2188811AlT;
import X.C2418009di;
import X.C2418109dj;
import X.C2418209dk;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class ZoinNative {
    public static volatile boolean isLoaded;

    public static native long nCalculateFileCRC(String str);

    public static native int nDecodeLibs(String str, String str2, String str3, String str4, long j, long j2, int i, ZoinBuildFileInfo[] zoinBuildFileInfoArr, boolean z, boolean z2);

    public static native String nDumpDebugLogs();

    public static native int nInit(boolean z, boolean z2, boolean z3);

    public static boolean init() {
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        try {
            c2418109djLIZLLL.getClass();
            LoadSoLancet.LIZJ("zoin");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("zoin");
            LoadSoLancet.LJ(jUptimeMillis, "zoin");
            LoadSoLancet.LIZLLL(jUptimeMillis, "zoin");
            LoadSoLancet.LIZIZ("zoin");
            int iNInit = nInit(c2418109djLIZLLL instanceof C2418009di, false, false);
            isLoaded = iNInit == 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZoinNative init ");
            sbLIZ.append(iNInit);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            isLoaded = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Fail to load ");
            sbLIZ2.append(C2418209dk.LIZ(e));
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return isLoaded;
    }

    public static boolean isIsLoaded() {
        return isLoaded;
    }
}
