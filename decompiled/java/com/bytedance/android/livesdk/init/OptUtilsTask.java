package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C0J9X;
import X.C1161920gLG;
import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
public class OptUtilsTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "opt_utils_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        GlobalContext.setApplicationContext(context);
        try {
            Class.forName("com.bytedance.android.livesdk.utils.LiveAppBundleUtils");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0J9X.LIZ(context);
        LiveAppBundleUtils.initCoreSOLoader();
    }
}
