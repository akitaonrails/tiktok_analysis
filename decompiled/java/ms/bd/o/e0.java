package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import ms.bd.o.b;
import ms.bd.o.i2;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Object[] array;
        i2 i2VarLIZIZ = i2.LIZIZ(a.LIZIZ.LIZ);
        synchronized (i2VarLIZIZ) {
            LinkedList linkedList = new LinkedList();
            synchronized (i2VarLIZIZ.LLILZLL) {
                try {
                    Iterator<i2.d> it2 = i2VarLIZIZ.LLILZLL.iterator();
                    while (it2.hasNext()) {
                        linkedList.add(i2.LIZ(it2.next()));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            array = linkedList.toArray();
        }
        return array;
    }
}
