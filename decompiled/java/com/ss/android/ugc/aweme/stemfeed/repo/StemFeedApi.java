package com.ss.android.ugc.aweme.stemfeed.repo;

import X.C0CQT;
import X.C1620410sGl;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedApi implements IStemFeedApi {
    public static final StemFeedApi LIZIZ = new StemFeedApi();
    public final /* synthetic */ IStemFeedApi LIZ = (IStemFeedApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IStemFeedApi.class);

    @Override // com.ss.android.ugc.aweme.stemfeed.repo.IStemFeedApi
    @InterfaceC1501160pAQ("tiktok/feed/stem/v2")
    @InterfaceC1501320pAg(2)
    public ListenableFuture<ComposePbAndJson<C1620410sGl, FeedItemList>> fetchStemFeedList(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("is_mock_provider") int i2, @InterfaceC1501070pAH("mock_info") String str) {
        boolean zLJI = MethodIDManager.LJI(202479);
        ListenableFuture<ComposePbAndJson<C1620410sGl, FeedItemList>> listenableFutureFetchStemFeedList = this.LIZ.fetchStemFeedList(i, z, i2, str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return listenableFutureFetchStemFeedList;
    }
}
