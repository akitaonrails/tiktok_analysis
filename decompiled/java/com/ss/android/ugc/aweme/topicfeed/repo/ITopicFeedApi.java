package com.ss.android.ugc.aweme.topicfeed.repo;

import X.C1620430sGn;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: loaded from: classes25.dex */
public interface ITopicFeedApi {
    @InterfaceC1501160pAQ("{data_source_path}")
    @InterfaceC1501320pAg(2)
    ListenableFuture<ComposePbAndJson<C1620430sGn, FeedItemList>> fetchTopicFeedList(@InterfaceC1501060pAG(encode = true, value = "data_source_path") String str, @InterfaceC1501070pAH("topic_id") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("is_mock_provider") int i3, @InterfaceC1501070pAH("mock_info") String str2);
}
