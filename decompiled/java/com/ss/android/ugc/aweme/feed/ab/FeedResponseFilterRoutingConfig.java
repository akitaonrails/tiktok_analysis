package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FeedResponseFilterRoutingConfig {
    public static final int $stable = 8;

    @C09CT("default_route")
    public final int defaultRoute;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("groups")
    public final List<FeedResponseFilterRouteGroup> groups;

    public FeedResponseFilterRoutingConfig() {
        this(false, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedResponseFilterRoutingConfig)) {
            return false;
        }
        FeedResponseFilterRoutingConfig feedResponseFilterRoutingConfig = (FeedResponseFilterRoutingConfig) obj;
        return this.enable == feedResponseFilterRoutingConfig.enable && this.defaultRoute == feedResponseFilterRoutingConfig.defaultRoute && Intrinsics.LJFF(this.groups, feedResponseFilterRoutingConfig.groups);
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + this.defaultRoute) * 31) + this.groups.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedResponseFilterRoutingConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", defaultRoute=");
        sbLIZ.append(this.defaultRoute);
        sbLIZ.append(", groups=");
        sbLIZ.append(this.groups);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedResponseFilterRoutingConfig(boolean z, int i, List<FeedResponseFilterRouteGroup> list) {
        this.enable = z;
        this.defaultRoute = i;
        this.groups = list;
    }

    public FeedResponseFilterRoutingConfig(boolean z, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
