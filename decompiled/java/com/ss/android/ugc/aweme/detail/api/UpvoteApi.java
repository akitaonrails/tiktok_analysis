package com.ss.android.ugc.aweme.detail.api;

import X.C0CQT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501240pAY;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteApi implements IUpvoteApi {
    public static final UpvoteApi LIZIZ = new UpvoteApi();
    public final /* synthetic */ IUpvoteApi LIZ = (IUpvoteApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IUpvoteApi.class);

    @Override // com.ss.android.ugc.aweme.detail.api.IUpvoteApi
    @InterfaceC1501240pAY("tiktok/v1/upvote/feed")
    public ListenableFuture<UpvoteFeedListResponse> getUpvoteFeedList(@InterfaceC1501070pAH("page_control") String str, @InterfaceC1501070pAH("client_viewed_gids") String str2, @InterfaceC1501070pAH("top_upvoter_uids") String str3) {
        return this.LIZ.getUpvoteFeedList(str, str2, str3);
    }
}
