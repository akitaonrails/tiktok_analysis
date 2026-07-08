package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundMethodData {

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("credit_token")
    public final String creditToken;

    @C09CT("refund_method_details")
    public final List<Object> refundMethodDetails;

    public RefundMethodData() {
        this(null, null, null);
    }

    public RefundMethodData(Configuration configuration, String str, List<Object> list) {
        this.configuration = configuration;
        this.creditToken = str;
        this.refundMethodDetails = list;
    }
}
