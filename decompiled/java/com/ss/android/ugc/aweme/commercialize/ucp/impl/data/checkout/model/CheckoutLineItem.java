package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutLineItem implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("item")
    public final CheckoutItem item;

    @C09CT("quantity")
    public final Integer quantity;

    @C09CT("totals")
    public final List<CheckoutTotal> totals;

    public CheckoutLineItem() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutLineItem)) {
            return false;
        }
        CheckoutLineItem checkoutLineItem = (CheckoutLineItem) obj;
        return Intrinsics.LJFF(this.id, checkoutLineItem.id) && Intrinsics.LJFF(this.item, checkoutLineItem.item) && Intrinsics.LJFF(this.quantity, checkoutLineItem.quantity) && Intrinsics.LJFF(this.totals, checkoutLineItem.totals);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CheckoutItem checkoutItem = this.item;
        int iHashCode2 = (iHashCode + (checkoutItem == null ? 0 : checkoutItem.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<CheckoutTotal> list = this.totals;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutLineItem(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", item=");
        sbLIZ.append(this.item);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(", totals=");
        sbLIZ.append(this.totals);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutLineItem(String str, CheckoutItem checkoutItem, Integer num, List<CheckoutTotal> list) {
        this.id = str;
        this.item = checkoutItem;
        this.quantity = num;
        this.totals = list;
    }
}
