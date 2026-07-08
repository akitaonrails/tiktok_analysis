package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSummarySetting {

    @C09CT("order_summary_style")
    public Integer orderSummaryStyle;

    public OrderSummarySetting() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderSummarySetting) && Intrinsics.LJFF(this.orderSummaryStyle, ((OrderSummarySetting) obj).orderSummaryStyle);
    }

    public final int hashCode() {
        Integer num = this.orderSummaryStyle;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderSummarySetting(orderSummaryStyle=");
        sbLIZ.append(this.orderSummaryStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OrderSummarySetting(Integer num) {
        this.orderSummaryStyle = num;
    }
}
