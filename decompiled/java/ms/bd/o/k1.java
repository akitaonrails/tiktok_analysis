package ms.bd.o;

import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        String[] strArrSplit = str.split((String) k.a(16777217, 0, 0L, "b52489", new byte[]{79, 43}));
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, str2).edit();
        editorEdit.putString(str3, (String) obj);
        editorEdit.commit();
        return null;
    }
}
