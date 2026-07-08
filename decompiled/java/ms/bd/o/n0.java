package ms.bd.o;

import X.C786410Ut5;
import android.content.Context;
import android.content.pm.Signature;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 64).signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            return signatureArr[0].toByteArray();
        }
        return null;
    }
}
