package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckoutDiscountAggregationConfig {

    @C09CT("discount_types")
    public final List<String> discountTypes;

    @C09CT("enable")
    public final boolean enable;

    public CheckoutDiscountAggregationConfig() {
        this(true, C1697810uHb.LJIIJJI("items_discount", "discount"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutDiscountAggregationConfig)) {
            return false;
        }
        CheckoutDiscountAggregationConfig checkoutDiscountAggregationConfig = (CheckoutDiscountAggregationConfig) obj;
        return this.enable == checkoutDiscountAggregationConfig.enable && Intrinsics.LJFF(this.discountTypes, checkoutDiscountAggregationConfig.discountTypes);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.discountTypes.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutDiscountAggregationConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", discountTypes=");
        sbLIZ.append(this.discountTypes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutDiscountAggregationConfig(boolean z, List<String> list) {
        this.enable = z;
        this.discountTypes = list;
    }
}
