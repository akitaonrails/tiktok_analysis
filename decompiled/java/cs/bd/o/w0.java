package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Context context = C2110608Oq.LIZIZ.LIZ;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
            return new String[]{installSourceInfo.getInstallingPackageName(), installSourceInfo.getOriginatingPackageName(), installSourceInfo.getInitiatingPackageName()};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return null;
        }
    }
}
