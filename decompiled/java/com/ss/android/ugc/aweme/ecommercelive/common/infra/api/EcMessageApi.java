package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C0NSX;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface EcMessageApi {
    public static final C0NSX LIZ = C0NSX.LIZ;

    @InterfaceC1501170pAR("/aweme/v1/oec/live/short_touch/refresh")
    Object refreshShortTouch(@InterfaceC1485405rg RefreshShortTouchRequestBody refreshShortTouchRequestBody, InterfaceC1364105Vn<? super BaseResponse<RefreshShortTouchResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/v1/shop/marketing_interactive/task/register")
    Object registerTask(@InterfaceC1485405rg RegisterTaskRequestBody registerTaskRequestBody, InterfaceC1364105Vn<? super BaseResponse<Object>> interfaceC1364105Vn);
}
