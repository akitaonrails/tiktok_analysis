package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderPendingCacheV1 implements Serializable {

    @C09CT("items")
    public final List<LocalOrderWrapper> items;

    @C09CT("updated_at")
    public final long updatedAt;

    @C09CT("version")
    public final int version;

    public OrderPendingCacheV1() {
        this(0, 0L, null, 7, null);
    }

    public final OrderPendingCacheV1 copy(int i, long j, List<LocalOrderWrapper> list) {
        return new OrderPendingCacheV1(i, j, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPendingCacheV1)) {
            return false;
        }
        OrderPendingCacheV1 orderPendingCacheV1 = (OrderPendingCacheV1) obj;
        return this.version == orderPendingCacheV1.version && this.updatedAt == orderPendingCacheV1.updatedAt && Intrinsics.LJFF(this.items, orderPendingCacheV1.items);
    }

    public int hashCode() {
        return (((this.version * 31) + C786410Ut5.Y2(this.updatedAt)) * 31) + this.items.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderPendingCacheV1(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", updatedAt=");
        sbLIZ.append(this.updatedAt);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OrderPendingCacheV1(int i, long j, List<LocalOrderWrapper> list) {
        this.version = i;
        this.updatedAt = j;
        this.items = list;
    }

    public OrderPendingCacheV1(int i, long j, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? System.currentTimeMillis() : j, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
