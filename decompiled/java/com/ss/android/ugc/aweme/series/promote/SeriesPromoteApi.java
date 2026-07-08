package com.ss.android.ugc.aweme.series.promote;

import X.AbstractC19484711Kz;
import X.C040I;
import X.C1581000rFC;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes25.dex */
public interface SeriesPromoteApi {
    public static final C1581000rFC LIZ = C1581000rFC.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/creator/record_event")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    AbstractC19484711Kz<BaseResponse> logPromoteImpression(@C040I PromoteImpressionEvent promoteImpressionEvent);
}
