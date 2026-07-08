package com.bytedance.pitaya.cep_engine.inner;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class JniCaller {
    public static final JniCaller LIZ = new JniCaller();

    public static final native void callNoParamsCallback(long j);

    public static final native String collectCrashInfo();

    public static final native void init();

    static {
        try {
            LoadSoLancet.LIZJ("CepEngine");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("CepEngine");
            LoadSoLancet.LJ(jUptimeMillis, "CepEngine");
            LoadSoLancet.LIZLLL(jUptimeMillis, "CepEngine");
            LoadSoLancet.LIZIZ("CepEngine");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AppLogNewUtils.onEventV3("cep_load_failed", new JSONObject().put("module", "engine").put("reason", String.valueOf(th)));
        }
    }
}
