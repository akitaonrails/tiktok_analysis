package com.ss.android.ugc.aweme.feed.api;

import X.C01GW;
import X.C0X9S;
import X.C1620570sH1;
import X.C452501pT;
import X.C591450NHr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedCacheForLoadMoreApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C591450NHr());

    public interface FeedCacheForLoadMoreService {
        @InterfaceC1501160pAQ("/tiktok/feed/offline/v2")
        C0X9S<ComposePbAndJson<C1620570sH1, FeedItemList>> offlineFeedList(@InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("count") int i2);

        @InterfaceC1501160pAQ("/tiktok/inspect/item/v1")
        C0X9S<InspectItemResponse> verifyAids(@InterfaceC1501070pAH("item_ids") String str);
    }
}
