package com.ss.android.ugc.aweme.api;

import X.AbstractC19484711Kz;
import X.C1158770gGB;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;

/* JADX INFO: loaded from: classes19.dex */
public interface PaidSeriesLiveApi {
    @InterfaceC1501170pAR("/tiktok/v1/paid_content/live/add")
    AbstractC19484711Kz<BaseResponse> addSeriesToLive(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("room_id") long j2);

    @InterfaceC1501170pAR("/tiktok/v1/paid_content/live/del")
    AbstractC19484711Kz<BaseResponse> deleteSeries(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("delete_mode") int i);

    @InterfaceC1501160pAQ("/tiktok/v1/paid_content/live/list")
    AbstractC19484711Kz<PaidSeriesLiveListResponse> getLivePaidSeriesList(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/tiktok/v1/paid_content/live/num ")
    AbstractC19484711Kz<PaidSeriesLiveNumResponse> getSeriesNum(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/tiktok/v1/paid_content/live/introduce")
    AbstractC19484711Kz<BaseResponse> introduceSeries(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("cancel_pin") boolean z, @InterfaceC1501070pAH("operation_time") C1158770gGB c1158770gGB);

    @InterfaceC1501170pAR("/tiktok/v1/paid_content/live/top")
    AbstractC19484711Kz<BaseResponse> moveSeriesToTop(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("room_id") long j2);

    @InterfaceC1501160pAQ("/tiktok/v1/paid_content/live/pop")
    AbstractC19484711Kz<PaidCollectionDetailResponse> popSeries(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("collection_id") long j2);

    @InterfaceC1501170pAR("/tiktok/v1/paid_content/live/del")
    AbstractC19484711Kz<BaseResponse> removeSeriesFromLive(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("delete_mode") int i);
}
