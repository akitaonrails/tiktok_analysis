package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ShopOrderListResponseDataModel implements Serializable {

    @C09CT("count")
    public final int count;

    @C09CT("cursor")
    @C09CS(ScientificLongAdapter.class)
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("order_list")
    public final List<ShopOrderDisplayModelV2> orderList;

    public ShopOrderListResponseDataModel() {
        this(0L, 0, false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderListResponseDataModel)) {
            return false;
        }
        ShopOrderListResponseDataModel shopOrderListResponseDataModel = (ShopOrderListResponseDataModel) obj;
        return this.cursor == shopOrderListResponseDataModel.cursor && this.count == shopOrderListResponseDataModel.count && this.hasMore == shopOrderListResponseDataModel.hasMore && Intrinsics.LJFF(this.orderList, shopOrderListResponseDataModel.orderList);
    }

    public int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.cursor) * 31) + this.count) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        List<ShopOrderDisplayModelV2> list = this.orderList;
        return iY2 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrderListResponseDataModel(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", orderList=");
        sbLIZ.append(this.orderList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopOrderListResponseDataModel(long j, int i, boolean z, List<ShopOrderDisplayModelV2> list) {
        this.cursor = j;
        this.count = i;
        this.hasMore = z;
        this.orderList = list;
    }
}
