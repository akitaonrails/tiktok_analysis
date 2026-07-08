package com.ss.android.ugc.aweme.stemfeed.repo;

import X.C1620410sGl;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: loaded from: classes25.dex */
public interface IStemFeedApi {
    @InterfaceC1501160pAQ("tiktok/feed/stem/v2")
    @InterfaceC1501320pAg(2)
    ListenableFuture<ComposePbAndJson<C1620410sGl, FeedItemList>> fetchStemFeedList(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("is_mock_provider") int i2, @InterfaceC1501070pAH("mock_info") String str);
}
