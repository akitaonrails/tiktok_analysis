package ms.bd.o;

import X.C786410Ut5;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        ApplicationInfo applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 0);
        String str2 = applicationInfoV3.sourceDir;
        if (str2 == null) {
            return applicationInfoV3.publicSourceDir;
        }
        return str2;
    }
}
