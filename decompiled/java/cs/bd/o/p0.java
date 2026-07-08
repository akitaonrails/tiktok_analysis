package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Context context = C2110608Oq.LIZIZ.LIZ;
        String[] strArrSplit = str.split("\\|");
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, str2).edit();
        editorEdit.putString(str3, (String) obj);
        editorEdit.commit();
        return null;
    }
}
