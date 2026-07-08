package com.bytedance.vmsdk.wasm;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class RegisterWebAssembly {
    public static native long loadWasmFactory();

    public static long registerWebAssembly() {
        try {
            INVOKESTATIC_com_bytedance_vmsdk_wasm_RegisterWebAssembly_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("wasm");
            return loadWasmFactory();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static void INVOKESTATIC_com_bytedance_vmsdk_wasm_RegisterWebAssembly_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
