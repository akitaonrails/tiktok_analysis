package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Context context = C2110608Oq.LIZIZ.LIZ;
        ApplicationInfo applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 0);
        String str2 = applicationInfoV3.sourceDir;
        return str2 == null ? applicationInfoV3.publicSourceDir : str2;
    }
}
