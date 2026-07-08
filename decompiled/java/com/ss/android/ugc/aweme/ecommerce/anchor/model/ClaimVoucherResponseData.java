package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class ClaimVoucherResponseData {

    @C09CT("can_retry")
    public final Boolean canRetry;

    @C09CT("voucher")
    public final PanelVoucherInfo voucher;

    public ClaimVoucherResponseData() {
        this(null, null);
    }

    public ClaimVoucherResponseData(Boolean bool, PanelVoucherInfo panelVoucherInfo) {
        this.canRetry = bool;
        this.voucher = panelVoucherInfo;
    }
}
