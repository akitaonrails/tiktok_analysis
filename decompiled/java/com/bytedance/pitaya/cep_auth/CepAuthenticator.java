package com.bytedance.pitaya.cep_auth;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.pitaya.cep_engine.inner.JniCaller;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes21.dex */
public final class CepAuthenticator implements CepKeeper {
    public static final CepAuthenticator INSTANCE = new CepAuthenticator();
    public static final String TAG = "CepAuthenticator";

    private final native void nativeInit();

    public final void setup() {
        try {
            INVOKESTATIC_com_bytedance_pitaya_cep_auth_CepAuthenticator_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("CepAuth");
            JniCaller jniCaller = JniCaller.LIZ;
            try {
                INSTANCE.nativeInit();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void INVOKESTATIC_com_bytedance_pitaya_cep_auth_CepAuthenticator_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
