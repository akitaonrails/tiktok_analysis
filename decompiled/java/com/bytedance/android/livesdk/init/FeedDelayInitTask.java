package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import com.bytedance.android.feed.api.ILiveFeedApiService;

/* JADX INFO: loaded from: classes8.dex */
public class FeedDelayInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "feed_delay_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).np2();
    }
}
