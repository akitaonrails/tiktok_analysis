package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class ExpansionVoucher {

    @C09CT("basic_voucher_info")
    public final VoucherInfo basicVoucherInfo;

    @C09CT("display_form")
    public final int displayForm;

    @C09CT("expanded_voucher_info")
    public final VoucherInfo expandedVoucherInfo;

    @C09CT("final_display_voucher_info")
    public final VoucherInfo finalVoucherInfo;

    public ExpansionVoucher() {
        this(0, null, null, null);
    }

    public ExpansionVoucher(int i, VoucherInfo voucherInfo, VoucherInfo voucherInfo2, VoucherInfo voucherInfo3) {
        this.displayForm = i;
        this.basicVoucherInfo = voucherInfo;
        this.expandedVoucherInfo = voucherInfo2;
        this.finalVoucherInfo = voucherInfo3;
    }
}
