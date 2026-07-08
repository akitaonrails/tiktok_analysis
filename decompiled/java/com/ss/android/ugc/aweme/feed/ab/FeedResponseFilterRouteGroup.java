package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FeedResponseFilterRouteGroup {
    public static final int $stable = 8;

    @C09CT("diff_types")
    public final List<String> diffTypes;

    @C09CT("route")
    public final int route;

    public FeedResponseFilterRouteGroup() {
        this(0, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedResponseFilterRouteGroup)) {
            return false;
        }
        FeedResponseFilterRouteGroup feedResponseFilterRouteGroup = (FeedResponseFilterRouteGroup) obj;
        return this.route == feedResponseFilterRouteGroup.route && Intrinsics.LJFF(this.diffTypes, feedResponseFilterRouteGroup.diffTypes);
    }

    public int hashCode() {
        return (this.route * 31) + this.diffTypes.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedResponseFilterRouteGroup(route=");
        sbLIZ.append(this.route);
        sbLIZ.append(", diffTypes=");
        sbLIZ.append(this.diffTypes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedResponseFilterRouteGroup(int i, List<String> list) {
        this.route = i;
        this.diffTypes = list;
    }

    public FeedResponseFilterRouteGroup(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
