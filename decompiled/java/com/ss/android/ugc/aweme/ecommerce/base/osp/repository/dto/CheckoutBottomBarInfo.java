package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckoutBottomBarInfo {

    @C09CT("bill_items")
    public List<BillItem> billItems;

    public CheckoutBottomBarInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutBottomBarInfo) && Intrinsics.LJFF(this.billItems, ((CheckoutBottomBarInfo) obj).billItems);
    }

    public final int hashCode() {
        List<BillItem> list = this.billItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutBottomBarInfo(billItems=");
        sbLIZ.append(this.billItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutBottomBarInfo(List<BillItem> list) {
        this.billItems = list;
    }
}
