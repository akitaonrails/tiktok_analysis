package ms.bd.o;

import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        boolean z;
        i2 i2VarLIZIZ = i2.LIZIZ(a.LIZIZ.LIZ);
        synchronized (i2VarLIZIZ) {
            synchronized (i2VarLIZIZ.LLILZLL) {
                try {
                    if (i2VarLIZIZ.LLILZLL.size() >= i2VarLIZIZ.LLJ) {
                        z = true;
                    } else {
                        z = false;
                    }
                } finally {
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
