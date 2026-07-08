package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Context;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Context context = C2110608Oq.LIZIZ.LIZ;
        Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
