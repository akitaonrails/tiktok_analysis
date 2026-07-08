package com.ss.android.ugc.awemepushlib.interaction;

import X.C0W9A;
import X.C0WZX;
import X.C13LQ;
import X.C1701330uNH;
import X.C1720106oR;
import X.C1906580ziK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import Y.AfS101S0300000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideSamsungExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideXiaomiExp;
import com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationSettingPageAuthGuideServiceImpl implements INotificationSettingPageAuthGuideService {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService
    public final void LIZJ() {
        this.LIZ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService
    public final boolean LIZIZ() {
        return Intrinsics.LJFF(C0W9A.LIZIZ(), "oppo");
    }

    @Override // com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService
    public final boolean LIZLLL() {
        String strLIZIZ = C0W9A.LIZIZ();
        String strLIZ = C0W9A.LIZ();
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"13", "14", "15"});
        boolean zContains = setLJLIIL.contains(strLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("contains: ");
        sbLIZ.append(zContains);
        sbLIZ.append(", androidVersion: ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(", brand: ");
        sbLIZ.append(Build.BRAND);
        sbLIZ.append(", manufacturer: ");
        sbLIZ.append(Build.MANUFACTURER);
        sbLIZ.append(", getManufacturerName: ");
        sbLIZ.append(C0W9A.LIZIZ());
        C1720106oR.LJI("NotificationSettingPageAuthGuideHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (setLJLIIL.contains(strLIZ)) {
            return NotificationSettingPageAuthGuideXiaomiExp.INSTANCE.shouldShowXiaomiAuthGuide(strLIZIZ) || NotificationSettingPageAuthGuideSamsungExp.INSTANCE.shouldShowSamsungAuthGuide(strLIZIZ) || NotificationSettingPageAuthGuideExp.INSTANCE.shouldShowAuthGuide(strLIZIZ);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService
    public final Class<? extends Activity> LJ() {
        return NotificationSettingPageAuthGuideActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService
    public final void LIZ(Context context, Intent intent, Intent intent2) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, context);
        C2204961BRm.LJJJJJL(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxzmANobxXoKP6jm5m8EHW4nJWYn8zvb+bFAOVTi8prZIgJD4xjheG1lLNCVb37YebvTtvQr+RR", null));
        C1906580ziK.LIZJ().LIZJ().LJLIIL(1L).LJJLJLI(new AfS101S0300000_3(this, context, intent, 0));
    }
}
