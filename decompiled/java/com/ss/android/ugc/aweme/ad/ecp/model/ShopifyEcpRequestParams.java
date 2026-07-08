package com.ss.android.ugc.aweme.ad.ecp.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopifyEcpRequestParams {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("checkout")
    public final ShopifyEcpCheckout checkout;

    @C09CT("delegate")
    public final List<String> delegate;

    public ShopifyEcpRequestParams() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopifyEcpRequestParams)) {
            return false;
        }
        ShopifyEcpRequestParams shopifyEcpRequestParams = (ShopifyEcpRequestParams) obj;
        return Intrinsics.LJFF(this.delegate, shopifyEcpRequestParams.delegate) && Intrinsics.LJFF(this.checkout, shopifyEcpRequestParams.checkout);
    }

    public final int hashCode() {
        List<String> list = this.delegate;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ShopifyEcpCheckout shopifyEcpCheckout = this.checkout;
        return iHashCode + (shopifyEcpCheckout != null ? shopifyEcpCheckout.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopifyEcpRequestParams(delegate=");
        sbLIZ.append(this.delegate);
        sbLIZ.append(", checkout=");
        sbLIZ.append(this.checkout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopifyEcpRequestParams(List<String> list, ShopifyEcpCheckout shopifyEcpCheckout) {
        this.delegate = list;
        this.checkout = shopifyEcpCheckout;
    }
}
