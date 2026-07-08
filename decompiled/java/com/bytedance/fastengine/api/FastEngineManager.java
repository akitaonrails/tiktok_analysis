package com.bytedance.fastengine.api;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class FastEngineManager implements ReflectionCall {
    public static final FastEngineManager INSTANCE = new FastEngineManager();
    public static volatile boolean initialized;

    public static final boolean loadFastEngineSo() {
        try {
            try {
                INVOKESTATIC_com_bytedance_fastengine_api_FastEngineManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("ptyjemalloc");
                INVOKESTATIC_com_bytedance_fastengine_api_FastEngineManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fast_engine");
                INVOKESTATIC_com_bytedance_fastengine_api_FastEngineManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("fast_engine_api_loader");
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }

    public static final native boolean nativeInit(JSONObject jSONObject);

    public static void INVOKESTATIC_com_bytedance_fastengine_api_FastEngineManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static final boolean ensureInitialized(JSONObject jSONObject) {
        if (initialized) {
            return true;
        }
        synchronized (INSTANCE) {
            try {
                if (initialized) {
                    return true;
                }
                boolean zNativeInit = false;
                if (!loadFastEngineSo()) {
                    initialized = false;
                    return false;
                }
                try {
                    zNativeInit = nativeInit(jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                initialized = zNativeInit;
                return initialized;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
