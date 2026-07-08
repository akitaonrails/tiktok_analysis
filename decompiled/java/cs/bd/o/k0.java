package cs.bd.o;

import X.C08PQ;
import X.C08XO;
import X.C2110608Oq;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int[] iArr;
        C08XO c08xoLIZ = C08XO.LIZ(C2110608Oq.LIZIZ.LIZ);
        synchronized (c08xoLIZ) {
            int size = ((ArrayList) c08xoLIZ.LIZIZ).size();
            if (size > 0) {
                if (size == 1) {
                    iArr = new int[]{((Integer) ListProtector.get(c08xoLIZ.LIZIZ, 0)).intValue()};
                } else {
                    try {
                        List<Integer> list = c08xoLIZ.LIZIZ;
                        int i = size - 10;
                        if (i <= 0) {
                            i = 0;
                        }
                        List listSubList = ((ArrayList) list).subList(i, size);
                        int[] iArr2 = new int[listSubList.size()];
                        for (int i2 = 0; i2 < listSubList.size(); i2++) {
                            iArr2[i2] = ((Integer) listSubList.get(i2)).intValue();
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
