package com.ss.mediakit.medialoader;

import X.C08TM;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;

/* JADX INFO: loaded from: classes4.dex */
public class AVMDLLibraryManager {
    public static boolean dependBoringSSl = true;
    public static boolean dependVcn = true;
    public static boolean enableV2 = false;
    public static IAVMDLLibraryLoader libraryLoader = null;
    public static int loadLevel = 0;
    public static boolean needBase = true;
    public static boolean needP2PLib;
    public static boolean needTTnetLib;
    public static boolean useShadowVersion;

    public static synchronized boolean loadLibraries() {
        boolean zTryLoadLibray;
        tryLoadSSL();
        tryLoadVcn();
        if (needBase) {
            tryLoadLibray(4);
        }
        if (enableV2) {
            zTryLoadLibray = tryLoadLibray(16);
            if (!zTryLoadLibray) {
                if (useShadowVersion) {
                    useShadowVersion = false;
                    zTryLoadLibray = tryLoadLibray(16);
                }
            }
            if (!zTryLoadLibray) {
            }
        }
        zTryLoadLibray = tryLoadLibray(8);
        if (needP2PLib) {
            tryLoadLibray(1);
        }
        if (needTTnetLib) {
            tryLoadLibray(2);
        }
        return zTryLoadLibray;
    }

    public static boolean tryLoadSSL() {
        boolean zLoadLibrary;
        if (shouldLoadLib(32)) {
            zLoadLibrary = libraryLoader.loadLibrary("ttcrypto");
            if (zLoadLibrary && (zLoadLibrary = libraryLoader.loadLibrary("ttboringssl"))) {
                return zLoadLibrary;
            }
        } else {
            zLoadLibrary = false;
        }
        try {
            if (!dependBoringSSl) {
                return zLoadLibrary;
            }
            C08TM.LIZ();
            zLoadLibrary = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLoadLibrary;
        }
    }

    public static boolean tryLoadVcn() {
        boolean zLoadLibrary;
        if (!dependVcn) {
            return true;
        }
        if (shouldLoadLib(64) && (zLoadLibrary = libraryLoader.loadLibrary("vcn"))) {
            return zLoadLibrary;
        }
        boolean zTryLoadVcnlib = VcnlibloadWrapper.tryLoadVcnlib();
        return zTryLoadVcnlib ? VcnlibloadWrapper.tryLoadVcnverifylib() : zTryLoadVcnlib;
    }

    public static void INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLLibraryManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static synchronized void setBoringSSLDependency(boolean z) {
        dependBoringSSl = z;
    }

    public static synchronized void setEnableV2(boolean z) {
        enableV2 = z;
    }

    public static synchronized void setLibraryLoadLevel(int i) {
        loadLevel = i;
    }

    public static synchronized void setLibraryLoader(IAVMDLLibraryLoader iAVMDLLibraryLoader) {
        libraryLoader = iAVMDLLibraryLoader;
    }

    public static synchronized void setNeedBase(boolean z) {
        needBase = z;
    }

    public static synchronized void setNeedP2PLib(boolean z) {
        needP2PLib = z;
    }

    public static synchronized void setNeedTTnetLib(boolean z) {
        needTTnetLib = z;
    }

    public static synchronized void setUseShadowVersion(boolean z) {
        useShadowVersion = z;
    }

    public static synchronized void setVcnDependency(boolean z) {
        dependVcn = z;
    }

    public static boolean shouldLoadLib(int i) {
        if (libraryLoader == null || i <= 0 || (loadLevel & i) != i) {
            return false;
        }
        return true;
    }

    public static boolean tryLoadLibray(int i) {
        String str;
        boolean zLoadLibrary = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            return false;
                        }
                        if (useShadowVersion) {
                            str = "avmdls";
                        } else {
                            str = "avmdlv2";
                        }
                    } else {
                        str = "avmdl";
                    }
                } else {
                    str = "avmdlbase";
                }
            } else {
                str = "avmdlttnet";
            }
        } else {
            str = "avmdlp2p";
        }
        if (!shouldLoadLib(i) || !(zLoadLibrary = libraryLoader.loadLibrary(str))) {
            try {
                INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLLibraryManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return zLoadLibrary;
    }
}
