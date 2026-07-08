package com.ss.android.ugc.aweme.feed.spi;

import X.C06D6;
import X.C20684815ws;
import X.C2344009Gk;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.feed.IFeedMonitorService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedMonitorService implements IFeedMonitorService {
    @Override // com.ss.android.ugc.aweme.feed.IFeedMonitorService
    public final List<NetworkPartner> LIZ() {
        return Collections.singletonList(new FeedNetworkPartner());
    }

    @Override // com.ss.android.ugc.aweme.feed.IFeedMonitorService
    public final void LIZIZ(String str, String str2, String str3, boolean z) {
        if (!((Boolean) C06D6.LIZ.getValue()).booleanValue()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("action", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "success");
        c2344009Gk.LJFF("enterFrom", str2);
        c2344009Gk.LJFF("msg", str3);
        C20684815ws.LJIILLIIL("rd_feed_interact_action_to_request_start", c2344009Gk.LIZ);
    }
}
