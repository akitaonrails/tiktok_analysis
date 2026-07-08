package com.bytedance.vcloud.strategy;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ttkmedia.datacenter.common.DataCenterLibLoader;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class StrategyCenterJniLoader {
    public static volatile boolean isDebugLibEnable;
    public static volatile boolean isLibraryLoaded;

    public static boolean copyFile(File file, File file2, boolean z) {
        return false;
    }

    public static void loadDebugLib(Context context) {
    }

    public static boolean moveFile(File file, File file2, boolean z) {
        return false;
    }

    public static synchronized void loadCustomLibrary() {
        try {
            INVOKESTATIC_com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("AndroidPitayaProxy");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void INVOKESTATIC_com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static synchronized void loadLibrary(Context context) {
        if (isLibraryLoaded) {
            return;
        }
        try {
            DataCenterLibLoader.loadLibrary();
            INVOKESTATIC_com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("starship_sdk");
            INVOKESTATIC_com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("preload");
            isLibraryLoaded = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
