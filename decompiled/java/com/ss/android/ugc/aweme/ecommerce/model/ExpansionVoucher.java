package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ExpansionVoucher {

    @C09CT("basic_voucher_info")
    public final PanelVoucherInfo basicVoucherInfo;

    @C09CT("display_form")
    public final int displayForm;

    @C09CT("expanded_voucher_info")
    public final PanelVoucherInfo expandedVoucherInfo;

    public ExpansionVoucher() {
        this(0, null, null);
    }

    public ExpansionVoucher(int i, PanelVoucherInfo panelVoucherInfo, PanelVoucherInfo panelVoucherInfo2) {
        this.displayForm = i;
        this.basicVoucherInfo = panelVoucherInfo;
        this.expandedVoucherInfo = panelVoucherInfo2;
    }
}
