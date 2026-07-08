package com.ss.android.ugc.aweme.topic.movie.favorite.api;

import X.C326150CqT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface MovieCollectionListApi {
    public static final C326150CqT LIZ = C326150CqT.LIZ;

    @InterfaceC1501160pAQ("/tiktok/topic/movie/collections/v1/")
    Object getMovieCollectionList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, InterfaceC1364105Vn<? super MovieCollectionListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/spotlight/tv_film/ip/collection_status/update")
    Object updateIPLeaderboardCollectionStatus(@InterfaceC1485405rg IPLeaderboardCollectionStatusUpdateRequest iPLeaderboardCollectionStatusUpdateRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
