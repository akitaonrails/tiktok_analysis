package ms.bd.o;

import X.C786410Ut5;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final SparseArray<a> LIZ = new SparseArray<>();

    public static abstract class a {
        public Object LIZ(int i, int i2, long j, String str, Object obj) {
            return LIZIZ(j, i2, str, obj);
        }

        public Object LIZIZ(long j, int i, String str, Object obj) {
            return null;
        }
    }

    public static void LIZ(int i, a aVar) {
        SparseArray<a> sparseArray = LIZ;
        a aVar2 = sparseArray.get(i);
        if (aVar2 != null) {
            throw new RuntimeException(C786410Ut5.j4((String) k.a(16777217, 0, 0L, "64962e", new byte[]{98, 37, 10, 74, 12, 118, 117, 23, 109, 99, 41, 118, 88, 71, 10, 123, 38, 1, 109, 116, 105}), new Object[]{aVar2.toString()}));
        }
        sparseArray.put(i, aVar);
    }
}
