package cs.bd.o;

import com.tts.mobsec.matrix.CSProxy;

/* JADX INFO: loaded from: classes4.dex */
public class l1 extends h1 {
    public long LIZ;

    @Override // cs.bd.o.h1
    public final Object LIZJ(long j) {
        this.LIZ = j;
        return null;
    }

    public final void finalize() throws Throwable {
        CSProxy.a(100663298, 0, this.LIZ, null, null);
        this.LIZ = -1L;
        super.finalize();
    }
}
