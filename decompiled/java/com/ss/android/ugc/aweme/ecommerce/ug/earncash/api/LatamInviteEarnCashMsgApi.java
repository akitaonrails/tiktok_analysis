package com.ss.android.ugc.aweme.ecommerce.ug.earncash.api;

import X.C406801i6;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LatamInviteEarnCashMsgApi {
    public static final C406801i6 LIZ = C406801i6.LIZ;

    @InterfaceC1501170pAR("/api/v1/latam_ug/jumanji/get_activity_direct_message")
    Object fetchDirectMsgList(@InterfaceC1485405rg DirectMessageRequest directMessageRequest, InterfaceC1364105Vn<? super BaseResponse<LatamInviteEarnCashResponse>> interfaceC1364105Vn);
}
