package cs.bd.o;

import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.tts.mobsec.matrix.CSProxy;
import cs.bd.o.f1;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements f1.a {
    public final long LIZ;
    public final Context LIZIZ;
    public final q LIZJ;

    public e1(q qVar, Context context, long j) {
        if (context == null) {
            throw new NullPointerException("context could not be null");
        }
        this.LIZJ = qVar;
        this.LIZIZ = C786410Ut5.N3(context);
        this.LIZ = j;
    }

    @Override // cs.bd.o.f1.a
    public final void LIZ(int i) {
        long j = this.LIZ;
        if (j != -1) {
            CSProxy.a(33554441, i, j, null, null);
        }
    }

    @Override // cs.bd.o.f1.a
    public final void LIZIZ(String str) {
        this.LIZJ.LJFF = str;
        long j = this.LIZ;
        if (j != -1) {
            CSProxy.a(33554436, 0, j, str, this.LIZIZ);
        }
    }

    @Override // cs.bd.o.f1.a
    public final void report(String str) {
        if (this.LIZ != -1 && !TextUtils.isEmpty(str)) {
            CSProxy.a(33554433, 0, this.LIZ, str, this.LIZIZ);
        }
    }

    @Override // cs.bd.o.f1.a
    public final void setDeviceID(String str) {
        this.LIZJ.LIZJ = str;
        long j = this.LIZ;
        if (j != -1) {
            CSProxy.a(33554434, 0, j, str, this.LIZIZ);
        }
    }

    @Override // cs.bd.o.f1.a
    public final void setInstallID(String str) {
        this.LIZJ.LJ = str;
        long j = this.LIZ;
        if (j != -1) {
            CSProxy.a(33554435, 0, j, str, this.LIZIZ);
        }
    }
}
