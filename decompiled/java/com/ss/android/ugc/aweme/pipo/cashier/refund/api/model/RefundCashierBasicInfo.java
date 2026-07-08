package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierBasicInfo {

    @C09CT("empty_refund_options_content")
    public final EmptyRefundOptionsContent emptyRefundOptionsContent;

    @C09CT("refund_options")
    public final List<RefundOption> refundOptions;

    @C09CT("refund_options_subtitle")
    public final String refundOptionsSubtitle;

    @C09CT("refund_options_title")
    public final String refundOptionsTitle;

    public RefundCashierBasicInfo() {
        this(null, null, null, null);
    }

    public RefundCashierBasicInfo(String str, String str2, EmptyRefundOptionsContent emptyRefundOptionsContent, List<RefundOption> list) {
        this.refundOptionsTitle = str;
        this.refundOptionsSubtitle = str2;
        this.emptyRefundOptionsContent = emptyRefundOptionsContent;
        this.refundOptions = list;
    }
}
