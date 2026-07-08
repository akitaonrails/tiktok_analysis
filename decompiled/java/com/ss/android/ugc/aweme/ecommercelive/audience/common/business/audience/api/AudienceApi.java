package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api;

import X.C20153613tO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes31.dex */
public interface AudienceApi {
    public static final C20153613tO LIZ = C20153613tO.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/action/report")
    Object reportAction(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("product_id") String str3, @InterfaceC1501070pAH("action_type") int i, InterfaceC1364105Vn<? super BaseResponse<Object>> interfaceC1364105Vn);
}
