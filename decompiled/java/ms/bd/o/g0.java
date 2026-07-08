package ms.bd.o;

import X.C786410Ut5;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;
import ms.bd.o.i2.b;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        i2 i2VarLIZIZ = i2.LIZIZ(a.LIZIZ.LIZ);
        synchronized (i2VarLIZIZ) {
            i2VarLIZIZ.LLIZLLLIL = j;
            i2VarLIZIZ.LLJ = i;
            i2VarLIZIZ.LLIZ = false;
            synchronized (i2VarLIZIZ.LLILZLL) {
                try {
                    i2VarLIZIZ.LLILZLL.clear();
                    i2VarLIZIZ.LLJJI.LIZIZ(i2VarLIZIZ.LLILZLL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            HandlerThread handlerThread = new HandlerThread((String) k.a(16777217, 0, 0L, "855592", new byte[]{36, 46, 110, 64, 8, 33, 55, 17, 118, 81, 33, 37, 67, 64, 2}));
            i2VarLIZIZ.LLILLJJLI = handlerThread;
            handlerThread.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(i2VarLIZIZ.LLILLJJLI));
            i2VarLIZIZ.LL = bPEAHandler;
            if (i2VarLIZIZ.LLILLL) {
                C786410Ut5.LJLIIL(10000L, bPEAHandler, i2VarLIZIZ.new b());
            } else {
                i2VarLIZIZ.LJ();
            }
        }
        return null;
    }
}
