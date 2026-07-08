package com.ss.android.ugc.aweme.toplive.repo;

import X.C09SO;
import X.C11NZ;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import webcast.api.feed.ToplivePageData;

/* JADX INFO: loaded from: classes8.dex */
public interface IToplivePageApi {
    @InterfaceC1501160pAQ("/webcast/feed/")
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> getMoreFeed(@InterfaceC1501070pAH("req_from") String str);

    @InterfaceC1501160pAQ("/webcast/feed/toplive_page/")
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    C11NZ<BaseResponse<ToplivePageData, FeedExtra>> getToplivePage(@InterfaceC1501070pAH("is_non_personalized") int i, @InterfaceC1501070pAH("item_ids_str") String str, @InterfaceC1501070pAH("debug") boolean z, @InterfaceC1501070pAH("enable_http_dns") boolean z2, @InterfaceC1501070pAH("async_you_may_like") boolean z3, @InterfaceC1501070pAH("is_preload") boolean z4);
}
