package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomCheckoutOcpOptModel {

    @C09CT("empty_payment_info_when_current_available")
    public final boolean emptyPaymentInfoWhenCurrentAvailable;

    @C09CT("enable_ocp_log")
    public final boolean enableOcpLog;

    @C09CT("enable_payment_summary_optimize")
    public final boolean enablePaymentSummaryOptimize;

    @C09CT("enable_retry_cashier")
    public final boolean enableRetryCashier;

    @C09CT("param_keys_to_be_removed")
    public final List<String> paramKeysToBeRemoved;

    public EcomCheckoutOcpOptModel() {
        this(false, false, null, false, false, 31, null);
    }

    public EcomCheckoutOcpOptModel(boolean z, boolean z2, List<String> list, boolean z3, boolean z4) {
        this.enableRetryCashier = z;
        this.enablePaymentSummaryOptimize = z2;
        this.paramKeysToBeRemoved = list;
        this.enableOcpLog = z3;
        this.emptyPaymentInfoWhenCurrentAvailable = z4;
    }

    public EcomCheckoutOcpOptModel(boolean z, boolean z2, List list, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? Collections.singletonList("image_url") : list, (i & 8) == 0 ? z3 : true, (i & 16) != 0 ? false : z4);
    }
}
