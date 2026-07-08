package com.ss.android.ugc.aweme.share.settings;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MoveTipConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("move_tips_display_count")
    public final Integer moveTipsDisplayCount;

    public MoveTipConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoveTipConfig)) {
            return false;
        }
        MoveTipConfig moveTipConfig = (MoveTipConfig) obj;
        return Intrinsics.LJFF(this.enable, moveTipConfig.enable) && Intrinsics.LJFF(this.moveTipsDisplayCount, moveTipConfig.moveTipsDisplayCount);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.moveTipsDisplayCount;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MoveTipConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", moveTipsDisplayCount=");
        sbLIZ.append(this.moveTipsDisplayCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MoveTipConfig(Boolean bool, Integer num) {
        this.enable = bool;
        this.moveTipsDisplayCount = num;
    }
}
