package com.ss.android.ugc.aweme.explore.api;

import X.C1515820pY4;
import X.C15O7;
import X.C1841820y1s;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicUpdateResponse;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicsResponse;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface ExploreTopicFeedRetrofit {
    public static final C1841820y1s LIZ = C1841820y1s.LIZ;

    @InterfaceC1501160pAQ("/tiktok/feed/explore/custom/topic/list/v1")
    C15O7<ExploreCustomTopicsResponse> queryAllCustomTopicsApi();

    @InterfaceC1501170pAR("/tiktok/feed/explore/custom/feed/v1")
    C15O7<ExploreTopicAwemeListResponse> queryCustomFeedApi(@InterfaceC1485405rg ExploreTopicFeedRequestParams exploreTopicFeedRequestParams);

    @InterfaceC2174608fY
    @InterfaceC1501170pAR("/tiktok/feed/explore/custom/feed/v1")
    C15O7<C1515820pY4<ExploreTopicAwemeListResponse>> queryCustomFeedApiByChunk(@InterfaceC1485405rg ExploreTopicFeedRequestParams exploreTopicFeedRequestParams);

    @InterfaceC1501170pAR("/tiktok/feed/explore/custom/topic/update/v1")
    C15O7<ExploreCustomTopicUpdateResponse> updateCustomTopics(@InterfaceC1485405rg ExploreTopicRequestParams exploreTopicRequestParams);
}
