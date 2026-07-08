package com.ss.android.ugc.aweme.api;

import X.AbstractC19484711Kz;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IPaidSeriesLiveApiService {
    AbstractC19484711Kz<BaseResponse> LIZ(long j);

    AbstractC19484711Kz LIZIZ(long j, long j2);

    AbstractC19484711Kz<BaseResponse> addSeriesToLive(long j, long j2);

    AbstractC19484711Kz<PaidSeriesLiveNumResponse> getSeriesNum(long j);
}
