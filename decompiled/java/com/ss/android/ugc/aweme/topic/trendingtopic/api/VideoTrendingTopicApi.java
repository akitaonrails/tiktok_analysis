package com.ss.android.ugc.aweme.topic.trendingtopic.api;

import X.C11NZ;
import X.C15J4;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.topic.trendingtopic.TrendingTopicSettingResponse;

/* JADX INFO: loaded from: classes32.dex */
public interface VideoTrendingTopicApi {
    public static final C15J4 LIZ = C15J4.LIZ;

    @InterfaceC1501200pAU("/tiktok/trends/settings/v1/")
    C11NZ<TrendingTopicSettingResponse> LIZ();

    @InterfaceC1501200pAU("/tiktok/trends/billboard/topics/v1/")
    C11NZ<TrendingTopicListResponse> getTrendingTopicList(@InterfaceC1501070pAH("billboard_type") String str);

    @InterfaceC1501200pAU("/tiktok/trends/search/topic/v1/")
    C11NZ<TrendingTopicSearchResponse> searchTrendingTopicList(@InterfaceC1501070pAH("keyword") String str);
}
