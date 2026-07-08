package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class ClaimExpansionVoucherResponseData {

    @C09CT("is_success_upgrade")
    public final Boolean isSuccessUpgrade;

    @C09CT("voucher")
    public final PanelVoucherInfo voucher;

    public ClaimExpansionVoucherResponseData() {
        this(null, null);
    }

    public ClaimExpansionVoucherResponseData(PanelVoucherInfo panelVoucherInfo, Boolean bool) {
        this.voucher = panelVoucherInfo;
        this.isSuccessUpgrade = bool;
    }
}
