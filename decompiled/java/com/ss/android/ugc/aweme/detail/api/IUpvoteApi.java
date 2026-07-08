package com.ss.android.ugc.aweme.detail.api;

import X.InterfaceC1501070pAH;
import X.InterfaceC1501240pAY;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes22.dex */
public interface IUpvoteApi {
    @InterfaceC1501240pAY("tiktok/v1/upvote/feed")
    ListenableFuture<UpvoteFeedListResponse> getUpvoteFeedList(@InterfaceC1501070pAH("page_control") String str, @InterfaceC1501070pAH("client_viewed_gids") String str2, @InterfaceC1501070pAH("top_upvoter_uids") String str3);
}
