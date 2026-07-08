package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutLineItemContext implements Serializable {

    @C09CT("applied_coupons")
    public final List<CheckoutAppliedCoupon> appliedCoupons;

    @C09CT("eligible_for_native_checkout")
    public final boolean eligibleForNativeCheckout;

    @C09CT("external_product_id")
    public final String productId;

    @C09CT("product_snapshot")
    public final CheckoutProductSnapshot productSnapshot;

    @C09CT("quantity")
    public final Integer quantity;

    @C09CT("selected_options")
    public final Map<String, String> selectedOptions;

    @C09CT("variant_id")
    public final String variantId;

    public final CheckoutLineItemContext copy(String str, String str2, Integer num, Map<String, String> map, CheckoutProductSnapshot checkoutProductSnapshot, List<CheckoutAppliedCoupon> list, boolean z) {
        return new CheckoutLineItemContext(str, str2, num, map, checkoutProductSnapshot, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutLineItemContext)) {
            return false;
        }
        CheckoutLineItemContext checkoutLineItemContext = (CheckoutLineItemContext) obj;
        return Intrinsics.LJFF(this.productId, checkoutLineItemContext.productId) && Intrinsics.LJFF(this.variantId, checkoutLineItemContext.variantId) && Intrinsics.LJFF(this.quantity, checkoutLineItemContext.quantity) && Intrinsics.LJFF(this.selectedOptions, checkoutLineItemContext.selectedOptions) && Intrinsics.LJFF(this.productSnapshot, checkoutLineItemContext.productSnapshot) && Intrinsics.LJFF(this.appliedCoupons, checkoutLineItemContext.appliedCoupons) && this.eligibleForNativeCheckout == checkoutLineItemContext.eligibleForNativeCheckout;
    }

    public int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variantId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.selectedOptions;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        CheckoutProductSnapshot checkoutProductSnapshot = this.productSnapshot;
        int iHashCode5 = (iHashCode4 + (checkoutProductSnapshot == null ? 0 : checkoutProductSnapshot.hashCode())) * 31;
        List<CheckoutAppliedCoupon> list = this.appliedCoupons;
        return ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.eligibleForNativeCheckout);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutLineItemContext(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", variantId=");
        sbLIZ.append(this.variantId);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(", selectedOptions=");
        sbLIZ.append(this.selectedOptions);
        sbLIZ.append(", productSnapshot=");
        sbLIZ.append(this.productSnapshot);
        sbLIZ.append(", appliedCoupons=");
        sbLIZ.append(this.appliedCoupons);
        sbLIZ.append(", eligibleForNativeCheckout=");
        sbLIZ.append(this.eligibleForNativeCheckout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutLineItemContext(String str, String str2, Integer num, Map<String, String> map, CheckoutProductSnapshot checkoutProductSnapshot, List<CheckoutAppliedCoupon> list, boolean z) {
        this.productId = str;
        this.variantId = str2;
        this.quantity = num;
        this.selectedOptions = map;
        this.productSnapshot = checkoutProductSnapshot;
        this.appliedCoupons = list;
        this.eligibleForNativeCheckout = z;
    }
}
