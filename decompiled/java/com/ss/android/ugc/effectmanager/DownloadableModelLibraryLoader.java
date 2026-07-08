package com.ss.android.ugc.effectmanager;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class DownloadableModelLibraryLoader {
    public static final DownloadableModelLibraryLoader INSTANCE = new DownloadableModelLibraryLoader();
    public static volatile boolean hasLoadedLibrary;

    public final void loadLibrary() {
        if (hasLoadedLibrary) {
            return;
        }
        synchronized (this) {
            try {
                if (!hasLoadedLibrary) {
                    DownloadableModelSupport.sLibraryLoader.loadLibrary("oldep");
                    hasLoadedLibrary = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
