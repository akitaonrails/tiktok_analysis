package com.ss.android.ugc.aweme.compliance.api.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StrictModeConfig {

    @C09CT("fuse_api_ids")
    public final List<Integer> fuseApiIds;

    public StrictModeConfig() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StrictModeConfig) && Intrinsics.LJFF(this.fuseApiIds, ((StrictModeConfig) obj).fuseApiIds);
    }

    public final int hashCode() {
        return this.fuseApiIds.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrictModeConfig(fuseApiIds=");
        sbLIZ.append(this.fuseApiIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StrictModeConfig(List<Integer> list) {
        this.fuseApiIds = list;
    }

    public StrictModeConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
