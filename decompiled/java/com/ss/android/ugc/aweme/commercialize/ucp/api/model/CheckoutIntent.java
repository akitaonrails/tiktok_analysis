package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutIntent implements Serializable {

    @C09CT("items")
    public final List<CheckoutLineItemContext> items;

    @C09CT("pass_through")
    @C09CS(PassThroughGsonAdapterFactory.class)
    public final Map<String, String> passThrough;

    @C09CT("seller_profile_id")
    public final String sellerProfileId;

    @C09CT("source")
    public final String source;

    public final CheckoutIntent copy(List<CheckoutLineItemContext> list, String str, String str2, Map<String, String> map) {
        return new CheckoutIntent(list, str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutIntent)) {
            return false;
        }
        CheckoutIntent checkoutIntent = (CheckoutIntent) obj;
        return Intrinsics.LJFF(this.items, checkoutIntent.items) && Intrinsics.LJFF(this.source, checkoutIntent.source) && Intrinsics.LJFF(this.sellerProfileId, checkoutIntent.sellerProfileId) && Intrinsics.LJFF(this.passThrough, checkoutIntent.passThrough);
    }

    public int hashCode() {
        List<CheckoutLineItemContext> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sellerProfileId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.passThrough;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutIntent(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", sellerProfileId=");
        sbLIZ.append(this.sellerProfileId);
        sbLIZ.append(", passThrough=");
        sbLIZ.append(this.passThrough);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutIntent(List<CheckoutLineItemContext> list, String str, String str2, Map<String, String> map) {
        this.items = list;
        this.source = str;
        this.sellerProfileId = str2;
        this.passThrough = map;
    }
}
