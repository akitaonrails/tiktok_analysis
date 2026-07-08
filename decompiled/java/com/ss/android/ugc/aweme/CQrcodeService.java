package com.ss.android.ugc.aweme;

import X.C0WZX;
import X.C1701330uNH;
import X.C1AF0;
import X.C2204961BRm;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService;

/* JADX INFO: loaded from: classes2.dex */
public final class CQrcodeService implements ICQrcodeService {
    @Override // com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService
    public final boolean LIZ() {
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_cqrcode_intercept", true);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return zLIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService
    public final void LIZIZ(Activity activity) {
        String str = CQRCodeFailActivity._pnsPageId;
        Intent intent = new Intent(activity, (Class<?>) CQRCodeFailActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMmZUbzB2Derxj61ltpwDqJfdp0=", null));
    }
}
