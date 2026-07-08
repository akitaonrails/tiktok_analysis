package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderSnapshotV2 implements Serializable {

    @C09CT("cursor")
    public final Long _cursor;

    @C09CT("has_more")
    public final Boolean _hasMore;

    @C09CT("items")
    public final List<LocalOrderWrapper> items;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSnapshotV2)) {
            return false;
        }
        OrderSnapshotV2 orderSnapshotV2 = (OrderSnapshotV2) obj;
        return Intrinsics.LJFF(this.items, orderSnapshotV2.items) && Intrinsics.LJFF(this._cursor, orderSnapshotV2._cursor) && Intrinsics.LJFF(this._hasMore, orderSnapshotV2._hasMore);
    }

    public int hashCode() {
        List<LocalOrderWrapper> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this._cursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this._hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderSnapshotV2(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", _cursor=");
        sbLIZ.append(this._cursor);
        sbLIZ.append(", _hasMore=");
        sbLIZ.append(this._hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getCursor() {
        Long l = this._cursor;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean getHasMore() {
        Boolean bool = this._hasMore;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public OrderSnapshotV2(List<LocalOrderWrapper> list, Long l, Boolean bool) {
        this.items = list;
        this._cursor = l;
        this._hasMore = bool;
    }
}
