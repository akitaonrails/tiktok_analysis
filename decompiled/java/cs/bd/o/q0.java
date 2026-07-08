package cs.bd.o;

import X.C08PQ;
import X.C0WZX;
import X.C2110608Oq;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) throws Throwable {
        Context context = C2110608Oq.LIZIZ.LIZ;
        String[] strArr = (String[]) obj;
        if (context != null && str != null && strArr != null && strArr.length % 2 == 0) {
            Intent intent = new Intent(str);
            intent.setPackage(context.getPackageName());
            for (int i = 0; i < strArr.length; i += 2) {
                intent.putExtra(strArr[i], strArr[i + 1]);
            }
            C2204961BRm.LJJJJI(context, intent, new C0WZX("dywwXgZ0UITNBQ==", null));
        }
        return null;
    }
}
