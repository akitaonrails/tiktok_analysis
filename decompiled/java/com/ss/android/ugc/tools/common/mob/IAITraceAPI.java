package com.ss.android.ugc.tools.common.mob;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface IAITraceAPI {
    @InterfaceC1501170pAR("/tiktok/v1/aigc/trace")
    Object aigcTrace(@InterfaceC1485405rg AiTraceRequestBody aiTraceRequestBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
