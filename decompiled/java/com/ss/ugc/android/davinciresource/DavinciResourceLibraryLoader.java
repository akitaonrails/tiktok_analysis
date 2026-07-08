package com.ss.ugc.android.davinciresource;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes13.dex */
public final class DavinciResourceLibraryLoader {
    public static final DavinciResourceLibraryLoader INSTANCE = new DavinciResourceLibraryLoader();
    public static volatile boolean hasLoadedLibrary;

    public final void loadLibrary() {
        if (hasLoadedLibrary) {
            return;
        }
        synchronized (this) {
            try {
                if (!hasLoadedLibrary) {
                    try {
                        Librarian.LJFF("DavinciResourceJni");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        INVOKESTATIC_com_ss_ugc_android_davinciresource_DavinciResourceLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("DavinciResourceJni");
                    }
                    hasLoadedLibrary = true;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static void INVOKESTATIC_com_ss_ugc_android_davinciresource_DavinciResourceLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
