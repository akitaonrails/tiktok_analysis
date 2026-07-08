package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.C1EOY;
import X.C469620IbI;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.performance.ApmOfflineDumpDataSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes8.dex */
public class InternalServiceInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "internal_service_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        C1EOY c1eoy = C1EOY.LIZ;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ii2();
        if (ApmOfflineDumpDataSetting.INSTANCE.getValue()) {
            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).dn0(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
        }
        C469620IbI c469620IbI = C469620IbI.LIZ;
        C469620IbI.LJ(false);
    }
}
