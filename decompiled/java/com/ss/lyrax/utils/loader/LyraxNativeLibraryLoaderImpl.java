package com.ss.lyrax.utils.loader;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class LyraxNativeLibraryLoaderImpl implements LyraxNativeLibraryLoader {
    public static void INVOKESTATIC_com_ss_lyrax_utils_loader_LyraxNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    @Override // com.ss.lyrax.utils.loader.LyraxNativeLibraryLoader
    public boolean load(String str) {
        try {
            INVOKESTATIC_com_ss_lyrax_utils_loader_LyraxNativeLibraryLoaderImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
