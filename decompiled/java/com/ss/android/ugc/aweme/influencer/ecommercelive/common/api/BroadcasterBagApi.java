package com.ss.android.ugc.aweme.influencer.ecommercelive.common.api;

import X.C01QH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface BroadcasterBagApi {
    public static final C01QH LIZ = C01QH.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/affiliate/creator/live/start")
    Object creatorReportLiveStart(@InterfaceC1485405rg ReportLiveStartRequest reportLiveStartRequest, InterfaceC1364105Vn<? super BaseResponse<ReportLiveStartResponse>> interfaceC1364105Vn);
}
