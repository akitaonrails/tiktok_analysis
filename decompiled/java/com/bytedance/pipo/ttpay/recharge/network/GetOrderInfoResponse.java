package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class GetOrderInfoResponse implements Serializable {

    @C09CT("display_payer_supply_info")
    public final DisplayPayerSupplyInfo displayPayerSupplyInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public GetOrderInfoResponse() {
        this(null, null);
    }

    public GetOrderInfoResponse(String str, DisplayPayerSupplyInfo displayPayerSupplyInfo) {
        this.status = str;
        this.displayPayerSupplyInfo = displayPayerSupplyInfo;
    }
}
