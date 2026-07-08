package com.tts.mobsec.matrix;

import X.C08PI;
import X.C08PQ;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CSProxy {
    public static native Object a(int i, int i2, long j, String str, Object obj);

    public static Object b(int i, int i2, long j, String str, Object obj) {
        C08PQ c08pq = C08PI.LIZ.get(i);
        if (c08pq != null) {
            try {
                return c08pq.LIZIZ(i, i2, j, str, obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new RuntimeException(th);
            }
        }
        throw new RuntimeException(C786410Ut5.j4("op code %d is invalid", new Object[]{Integer.valueOf(i)}));
    }
}
