package com.ss.android.ugc.aweme.pipo.cashier.common.bind.api;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.RedirectDetails;

/* JADX INFO: loaded from: classes27.dex */
public final class BindResponseInfo {

    @C09CT("bind_order_id")
    public final String bindOrderId;

    @C09CT("cashier_action")
    public final String cashierAction;

    @C09CT("redirect_info")
    public final RedirectDetails redirectDetails;

    public BindResponseInfo(RedirectDetails redirectDetails, String str, String str2) {
        this.redirectDetails = redirectDetails;
        this.cashierAction = str;
        this.bindOrderId = str2;
    }
}
