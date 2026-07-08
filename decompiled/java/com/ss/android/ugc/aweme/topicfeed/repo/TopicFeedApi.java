package com.ss.android.ugc.aweme.topicfeed.repo;

import X.C0CQT;
import X.C1620430sGn;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedApi implements ITopicFeedApi {
    public static final TopicFeedApi LIZIZ = new TopicFeedApi();
    public final /* synthetic */ ITopicFeedApi LIZ = (ITopicFeedApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(ITopicFeedApi.class);

    @Override // com.ss.android.ugc.aweme.topicfeed.repo.ITopicFeedApi
    @InterfaceC1501160pAQ("{data_source_path}")
    @InterfaceC1501320pAg(2)
    public ListenableFuture<ComposePbAndJson<C1620430sGn, FeedItemList>> fetchTopicFeedList(@InterfaceC1501060pAG(encode = true, value = "data_source_path") String str, @InterfaceC1501070pAH("topic_id") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("is_mock_provider") int i3, @InterfaceC1501070pAH("mock_info") String str2) {
        return this.LIZ.fetchTopicFeedList(str, i, i2, i3, str2);
    }
}
