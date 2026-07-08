package com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Extra {

    @C09CT("fatal_item_ids")
    public final List<String> fatalItemIds;

    @C09CT("logid")
    public final String logId;

    @C09CT("now")
    public final Long now;

    public Extra() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return Intrinsics.LJFF(this.fatalItemIds, extra.fatalItemIds) && Intrinsics.LJFF(this.logId, extra.logId) && Intrinsics.LJFF(this.now, extra.now);
    }

    public final int hashCode() {
        int iHashCode = this.fatalItemIds.hashCode() * 31;
        String str = this.logId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.now;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extra(fatalItemIds=");
        sbLIZ.append(this.fatalItemIds);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", now=");
        sbLIZ.append(this.now);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Extra(List<String> list, String str, Long l) {
        this.fatalItemIds = list;
        this.logId = str;
        this.now = l;
    }

    public Extra(List list, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : l);
    }
}
