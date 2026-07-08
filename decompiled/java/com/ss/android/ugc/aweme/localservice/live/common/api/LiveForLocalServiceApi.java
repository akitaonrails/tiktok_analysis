package com.ss.android.ugc.aweme.localservice.live.common.api;

import X.C1172970gd5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.BCSwitchStatusRequest;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.BCSwitchStatusResponse;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductDelRequest;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewRequest;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface LiveForLocalServiceApi {
    public static final C1172970gd5 LIZ = C1172970gd5.LIZ;

    @InterfaceC1501170pAR("/api/live/room/product/del/")
    Object delProducts(@InterfaceC1485405rg ProductDelRequest productDelRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live/bc_status/get")
    Object getBCSwitchStatus(@InterfaceC1485405rg BCSwitchStatusRequest bCSwitchStatusRequest, InterfaceC1364105Vn<? super BCSwitchStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live/room/product/overview/")
    Object getRoomProductOverview(@InterfaceC1485405rg ProductOverviewRequest productOverviewRequest, InterfaceC1364105Vn<? super ProductOverviewResponse> interfaceC1364105Vn);
}
