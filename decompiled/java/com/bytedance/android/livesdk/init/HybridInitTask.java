package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import com.bytedance.android.live.browser.IHybridPBService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.ILiveSparkService;

/* JADX INFO: loaded from: classes18.dex */
public class HybridInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "hybrid_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).io0();
        ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).fT();
        ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).preload();
        ((IHybridPBService) C1161920gLG.LIZJ(IHybridPBService.class)).ux1();
    }
}
