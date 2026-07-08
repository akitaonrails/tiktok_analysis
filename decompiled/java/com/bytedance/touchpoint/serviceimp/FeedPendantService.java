package com.bytedance.touchpoint.serviceimp;

import X.C01GW;
import X.C1893440zN8;
import X.C1897020zSu;
import com.bytedance.touchpoint.api.service.IFeedPendantService;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.feed.lite.LiteFeedTimerPendantManger;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedPendantService implements IFeedPendantService {
    @Override // com.bytedance.touchpoint.api.service.IFeedPendantService
    public final void LIZ(String str) {
        C1897020zSu c1897020zSu = C1897020zSu.LIZ;
        C1897020zSu.LJFF();
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        C1893440zN8.LIZ().LIZLLL(22, str, "", null, true, false, null);
        LiteFeedTimerPendantManger.LLJLLL.getValue().LIZLLL(22, str, "", null, true, false, null);
    }
}
