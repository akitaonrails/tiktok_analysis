package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import android.hardware.SensorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        j2 j2VarLIZ = j2.LIZ(a.LIZIZ.LIZ);
        synchronized (j2VarLIZ) {
            if (j2VarLIZ.LLILLL) {
                synchronized (j2VarLIZ) {
                    try {
                        try {
                            SensorManager sensorManager = j2VarLIZ.LLILZ;
                            if (sensorManager != null) {
                                C2204961BRm.LJJLIIIJJI(sensorManager, j2VarLIZ, new C0WZX("eSwwXgZ0UITWBw==", null));
                            }
                        } catch (Exception e) {
                        }
                        j2VarLIZ.LLILLJJLI.quit();
                        j2VarLIZ.LLILLL = false;
                    } finally {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return null;
    }
}
