package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        j2 j2VarLIZ = j2.LIZ(a.LIZIZ.LIZ);
        synchronized (j2VarLIZ) {
            if (!j2VarLIZ.LLILLL) {
                HandlerThread handlerThread = new HandlerThread("sensorThread");
                j2VarLIZ.LLILLJJLI = handlerThread;
                handlerThread.start();
                j2VarLIZ.LL = new BPEAHandler(C786410Ut5.W2(j2VarLIZ.LLILLJJLI));
                synchronized (j2VarLIZ) {
                    try {
                        try {
                            SensorManager sensorManager = j2VarLIZ.LLILZ;
                            if (sensorManager != null) {
                                C2204961BRm.LJJLIIIIJ(sensorManager, j2VarLIZ, C2204961BRm.LJJL(sensorManager, 10, new C0WZX("eSwwXgZ0UITWBw==", null)), 3, j2VarLIZ.LL, new C0WZX("eSwwXgZ0UITWBw==", null));
                                SensorManager sensorManager2 = j2VarLIZ.LLILZ;
                                C2204961BRm.LJJLIIIIJ(sensorManager2, j2VarLIZ, C2204961BRm.LJJL(sensorManager2, 9, new C0WZX("eSwwXgZ0UITWBw==", null)), 3, j2VarLIZ.LL, new C0WZX("eSwwXgZ0UITWBw==", null));
                                SensorManager sensorManager3 = j2VarLIZ.LLILZ;
                                C2204961BRm.LJJLIIIIJ(sensorManager3, j2VarLIZ, C2204961BRm.LJJL(sensorManager3, 4, new C0WZX("eSwwXgZ0UITWBw==", null)), 3, j2VarLIZ.LL, new C0WZX("eSwwXgZ0UITWBw==", null));
                                SensorManager sensorManager4 = j2VarLIZ.LLILZ;
                                C2204961BRm.LJJLIIIIJ(sensorManager4, j2VarLIZ, C2204961BRm.LJJL(sensorManager4, 11, new C0WZX("eSwwXgZ0UITWBw==", null)), 3, j2VarLIZ.LL, new C0WZX("eSwwXgZ0UITWBw==", null));
                                SensorManager sensorManager5 = j2VarLIZ.LLILZ;
                                C2204961BRm.LJJLIIIIJ(sensorManager5, j2VarLIZ, C2204961BRm.LJJL(sensorManager5, 1, new C0WZX("eSwwXgZ0UITWBw==", null)), 3, j2VarLIZ.LL, new C0WZX("eSwwXgZ0UITWBw==", null));
                                SensorManager sensorManager6 = j2VarLIZ.LLILZ;
                                C2204961BRm.LJJLIIIIJ(sensorManager6, j2VarLIZ, C2204961BRm.LJJL(sensorManager6, 2, new C0WZX("eSwwXgZ0UITWBw==", null)), 3, j2VarLIZ.LL, new C0WZX("eSwwXgZ0UITWBw==", null));
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Exception th) {
                    }
                    j2VarLIZ.LLILLL = true;
                }
            }
        }
        return null;
    }
}
