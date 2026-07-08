package com.bytedance.android.livesdk.feed.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.feed.FollowRecommendListResponse;

/* JADX INFO: loaded from: classes.dex */
public interface FollowRecommendApi {
    @InterfaceC1501160pAQ("/webcast/feed/follow_recommend_list/")
    C11NZ<FollowRecommendListResponse> getRecommendList(@InterfaceC1501070pAH("req_from") String str);

    @InterfaceC1501160pAQ("/webcast/feed/follow_recommend_user_block/")
    C11NZ<Object> removeRecommendUser(@InterfaceC1501070pAH("blocked_user_id") String str);
}
