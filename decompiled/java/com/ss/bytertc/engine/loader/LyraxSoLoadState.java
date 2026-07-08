package com.ss.bytertc.engine.loader;

import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxSoLoadState {
    public static volatile Boolean sLoaded;

    public static boolean isLyraxNativeReady() {
        boolean z;
        Boolean bool = sLoaded;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (LyraxSoLoadState.class) {
            try {
                Boolean bool2 = sLoaded;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                if (!LyraxPluginConfig.isConfigured()) {
                    LyraxPluginConfig.safeLogW("LyraxSoLoadState", "[LYRAX_SO_LOAD] isLyraxNativeReady: config not injected, falling back to default SO name");
                }
                String soLibraryName = LyraxPluginConfig.getSoLibraryName();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[LYRAX_SO_LOAD] isLyraxNativeReady: loading so=");
                sbLIZ.append(soLibraryName);
                sbLIZ.append(", configured=");
                sbLIZ.append(LyraxPluginConfig.isConfigured());
                sbLIZ.append(", state=");
                sbLIZ.append(LyraxPluginConfig.getPluginState());
                LyraxPluginConfig.safeLogW("LyraxSoLoadState", C2188811AlT.LIZIZ(sbLIZ));
                try {
                    INVOKESTATIC_com_ss_bytertc_engine_loader_LyraxSoLoadState_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(soLibraryName);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[LYRAX_SO_LOAD] isLyraxNativeReady: loaded ");
                    sbLIZ2.append(soLibraryName);
                    sbLIZ2.append(" successfully");
                    LyraxPluginConfig.safeLogW("LyraxSoLoadState", C2188811AlT.LIZIZ(sbLIZ2));
                    z = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Dynamic Feature ");
                    sbLIZ3.append(soLibraryName);
                    sbLIZ3.append(".so is not ready!");
                    LyraxPluginConfig.safeLogE("LyraxSoLoadState", C2188811AlT.LIZIZ(sbLIZ3), th);
                    z = false;
                }
                sLoaded = Boolean.valueOf(z);
                return z;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static void INVOKESTATIC_com_ss_bytertc_engine_loader_LyraxSoLoadState_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
