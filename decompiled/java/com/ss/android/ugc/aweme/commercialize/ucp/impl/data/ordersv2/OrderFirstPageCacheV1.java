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
public final class OrderFirstPageCacheV1 implements Serializable {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("items")
    public final List<LocalOrderWrapper> items;

    @C09CT("updated_at")
    public final long updatedAt;

    @C09CT("version")
    public final int version;

    public OrderFirstPageCacheV1() {
        this(0, 0L, 0L, false, null, 31, null);
    }

    public final OrderFirstPageCacheV1 copy(int i, long j, long j2, boolean z, List<LocalOrderWrapper> list) {
        return new OrderFirstPageCacheV1(i, j, j2, z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderFirstPageCacheV1)) {
            return false;
        }
        OrderFirstPageCacheV1 orderFirstPageCacheV1 = (OrderFirstPageCacheV1) obj;
        return this.version == orderFirstPageCacheV1.version && this.updatedAt == orderFirstPageCacheV1.updatedAt && this.cursor == orderFirstPageCacheV1.cursor && this.hasMore == orderFirstPageCacheV1.hasMore && Intrinsics.LJFF(this.items, orderFirstPageCacheV1.items);
    }

    public int hashCode() {
        return (((((((this.version * 31) + C786410Ut5.Y2(this.updatedAt)) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.items.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderFirstPageCacheV1(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", updatedAt=");
        sbLIZ.append(this.updatedAt);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OrderFirstPageCacheV1(int i, long j, long j2, boolean z, List<LocalOrderWrapper> list) {
        this.version = i;
        this.updatedAt = j;
        this.cursor = j2;
        this.hasMore = z;
        this.items = list;
    }

    public OrderFirstPageCacheV1(int i, long j, long j2, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? System.currentTimeMillis() : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
