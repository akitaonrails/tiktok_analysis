package com.ss.android.ugc.aweme.topic.movie.detail.api;

import X.C613290O3r;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface MovieDetailApi {
    public static final C613290O3r LIZ = C613290O3r.LIZ;

    @InterfaceC1501170pAR("tiktok/v1/spotlight/promotion_entity_collection_status/update")
    Object collectMovie(@InterfaceC1501070pAH("promotion_entity_id") String str, @InterfaceC1501070pAH("collection_status") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/topic/movie/detail/v1/")
    Object getMovieDetail(@InterfaceC1501070pAH("movie_id") String str, InterfaceC1364105Vn<? super MovieDetailResp> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/topic/movie/itemlist/v1/")
    Object getMovieVideos(@InterfaceC1501070pAH("movie_id") String str, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("page_extra") String str2, InterfaceC1364105Vn<? super MovieVideosResp> interfaceC1364105Vn);

    @InterfaceC1501170pAR("tiktok/topic/movie/uncollect/v1/")
    Object unCollectMovie(@InterfaceC1501070pAH("movie_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
