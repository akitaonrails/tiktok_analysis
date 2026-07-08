package com.ss.android.ugc.effectmanager;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes27.dex */
public interface DownloadableModelSupportLibraryLoader {
    void loadLibrary(String str);

    public static class SystemLoader implements DownloadableModelSupportLibraryLoader {
        public static void INVOKESTATIC_com_ss_android_ugc_effectmanager_DownloadableModelSupportLibraryLoader$SystemLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
        }

        @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
        public void loadLibrary(String str) {
            INVOKESTATIC_com_ss_android_ugc_effectmanager_DownloadableModelSupportLibraryLoader$SystemLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
        }
    }
}
