package com.ss.mediakit.medialoader;

import X.C08FF;
import X.C0VSF;
import X.C0VSJ;
import X.C2188811AlT;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class AVMDLLibraryLoader {
    public static boolean isAVMDLP2PV2DebugLibEnable;
    public static boolean isAVMDLV2DebugLibEnable;
    public static boolean isDebugConfFileLoaded;
    public static boolean isMDLTTQuicHeLoaderDebugLibEnable;
    public static boolean isMediaIOCoreDebugLibEnable;
    public static boolean isVcnDebugLibEnable;

    public static boolean copyFile(File file, File file2, boolean z) {
        return false;
    }

    public static String getDebugLibPath(Context context, LibType libType) {
        return "";
    }

    public static boolean isDebugLibEnabled(Context context, LibType libType) {
        return false;
    }

    public static boolean loadDebugLib(Context context, LibType libType) {
        return false;
    }

    public static boolean moveFile(File file, File file2, boolean z) {
        return false;
    }

    public enum LibType {
        vcn,
        avmdlv2,
        avmdlp2pv2,
        mdlttkmedianetloader,
        avmdlbase;

        public static LibType valueOf(String str) {
            return (LibType) C08FF.LIZ(LibType.class, str);
        }
    }

    public static void INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static File getDebugDir(Context context) {
        return new C0VSJ("");
    }

    public static String getFullLibName(LibType libType) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lib");
        sbLIZ.append(libType.name());
        sbLIZ.append(".so");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void loadDebugConfFile(Context context) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new C0VSF(new C0VSJ(getDebugDir(context), "vc_vod_mdl.debug")));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return;
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (line.startsWith("debug_vod_vcn:")) {
                        isVcnDebugLibEnable = line.contains(":on");
                    } else if (line.startsWith("debug_vod_avmdlv2:")) {
                        isAVMDLV2DebugLibEnable = line.contains(":on");
                    } else if (line.startsWith("debug_vod_avmdlp2pv2:")) {
                        isAVMDLP2PV2DebugLibEnable = line.contains(":on");
                    } else if (line.startsWith("debug_vod_mdlttquicheloader:")) {
                        isMDLTTQuicHeLoaderDebugLibEnable = line.contains(":on");
                    } else if (line.startsWith("debug_vod_mediaiocore:")) {
                        isMediaIOCoreDebugLibEnable = line.contains(":on");
                    }
                } else {
                    isDebugConfFileLoaded = true;
                    bufferedReader.close();
                    return;
                }
            } finally {
            }
            TryCatchGuardChecker.doCheck(e);
            return;
        }
    }

    public static boolean loadDefaultLib(LibType libType) {
        boolean zTryLoadVcnlib;
        String str;
        try {
            if (libType == LibType.vcn) {
                zTryLoadVcnlib = VcnlibloadWrapper.tryLoadVcnlib();
            } else {
                LibType libType2 = LibType.avmdlbase;
                if (libType == libType2) {
                    INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(libType2.name());
                } else {
                    LibType libType3 = LibType.avmdlp2pv2;
                    if (libType == libType3) {
                        INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLLibraryLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(libType3.name());
                    } else {
                        zTryLoadVcnlib = false;
                    }
                }
                zTryLoadVcnlib = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(libType);
            sbLIZ.append(", load default lib ");
            if (!zTryLoadVcnlib) {
                str = "failed";
            } else {
                str = "success";
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return zTryLoadVcnlib;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static boolean loadLibrary(Context context, LibType libType) {
        if (context != null && isDebugLibEnabled(context, libType)) {
            if (loadDebugLib(context, libType)) {
                return true;
            }
            return loadDefaultLib(libType);
        }
        return loadDefaultLib(libType);
    }
}
