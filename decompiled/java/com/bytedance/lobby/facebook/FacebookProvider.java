package com.bytedance.lobby.facebook;

import X.C0W7K;
import X.C20144713rx;
import X.C2277811EDr;
import X.C786410Ut5;
import X.C820350WGb;
import X.C833690Wn9;
import android.app.Application;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;

/* JADX INFO: loaded from: classes14.dex */
public class FacebookProvider<T> extends BaseProvider<T> {
    public final Application LLILZ;

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() throws Exception {
        boolean zLJI = MethodIDManager.LJI(202295);
        if (FacebookSdk.LJII()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        String str = this.LLILLL.LIZJ;
        C0W7K.LIZIZ(str, "applicationId");
        FacebookSdk.LIZJ = str;
        try {
            FacebookSdk.LJIIJ(C786410Ut5.M3(this.LLILZ));
            C820350WGb.LIZ(new String[]{"LDU"}, new C20144713rx(939524611));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C833690Wn9.LIZ) {
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw e;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public FacebookProvider(Application application, C2277811EDr c2277811EDr) {
        super(application, c2277811EDr);
        this.LLILZ = application;
    }
}
