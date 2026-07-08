package com.ss.android.ugc.aweme.im.b2c.event;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface IB2CEventHandleApi {
    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/event_handle/post")
    Object reportEvent(@InterfaceC1485405rg B2CEventRequestBody b2CEventRequestBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
