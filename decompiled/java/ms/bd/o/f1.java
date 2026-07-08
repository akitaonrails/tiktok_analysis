package ms.bd.o;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int[] iArr;
        z2 z2VarLIZ = z2.LIZ(a.LIZIZ.LIZ);
        synchronized (z2VarLIZ) {
            int size = z2VarLIZ.LIZIZ.size();
            if (size > 0) {
                if (size == 1) {
                    iArr = new int[]{((Integer) ListProtector.get(z2VarLIZ.LIZIZ, 0)).intValue()};
                } else {
                    try {
                        List<Integer> list = z2VarLIZ.LIZIZ;
                        int i2 = size - 10;
                        if (i2 <= 0) {
                            i2 = 0;
                        }
                        List<Integer> listSubList = list.subList(i2, size);
                        int[] iArr2 = new int[listSubList.size()];
                        for (int i3 = 0; i3 < listSubList.size(); i3++) {
                            iArr2[i3] = listSubList.get(i3).intValue();
                        }
                        return iArr2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } else {
                iArr = new int[0];
            }
            return iArr;
        }
    }
}
