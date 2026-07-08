package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.C517110KPt;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionCreatorSpecificSkuNotificationTaskPgc extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "SubscriptionCreatorSpecificSkuNotificationTask";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
        if (iSubscribeService == null || iSubscribeService.ei() == null) {
            return;
        }
        C517110KPt.LJIIL();
    }
}
