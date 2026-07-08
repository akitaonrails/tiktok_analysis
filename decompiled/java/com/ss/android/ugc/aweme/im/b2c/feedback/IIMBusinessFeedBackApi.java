package com.ss.android.ugc.aweme.im.b2c.feedback;

import X.C1723006ou;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface IIMBusinessFeedBackApi {
    public static final C1723006ou LIZ = C1723006ou.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/feedback/upload")
    Object reportEvent(@InterfaceC1485405rg FeedBackRequestBody feedBackRequestBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
