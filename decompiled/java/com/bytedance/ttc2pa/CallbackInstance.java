package com.bytedance.ttc2pa;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes35.dex */
public final class CallbackInstance {
    public static final CallbackInstance LIZ = new CallbackInstance();
    public static final AtomicLong LIZIZ = new AtomicLong(100);
    public static final Map<Long, MoltenFFICallback> LIZJ = new LinkedHashMap();

    public final void LIZ(long j) {
        synchronized (this) {
            try {
                Map<Long, MoltenFFICallback> map = LIZJ;
                if (((MoltenFFICallback) ((LinkedHashMap) map).get(Long.valueOf(j))) == null) {
                    return;
                }
                map.remove(Long.valueOf(j));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
