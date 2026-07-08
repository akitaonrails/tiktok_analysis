package com.ss.android.ugc.aweme.feed.api;

import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* JADX INFO: loaded from: classes29.dex */
public interface FeedStatsApi {
    @InterfaceC1501160pAQ("/aweme/v1/aweme/modify/visibility/")
    ListenableFuture<PrivateUrlModel> feedStats(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("type") int i);

    @InterfaceC1501160pAQ("/aweme/v1/aweme/modify/visibility/")
    ListenableFuture<PrivateUrlModel> feedStats(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("video_hide_search") Integer num, @InterfaceC1501070pAH("dont_share") Integer num2, @InterfaceC1501070pAH("dont_share_list") String str2);
}
