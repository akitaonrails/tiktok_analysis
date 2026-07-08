package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TargetConfig {

    @C09CT("clean_list")
    public final List<String> cleanList;

    @C09CT("strategy")
    public final int strategy;

    @C09CT("white_list")
    public final List<String> whiteList;

    public TargetConfig() {
        this(null, null, 0, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetConfig)) {
            return false;
        }
        TargetConfig targetConfig = (TargetConfig) obj;
        return Intrinsics.LJFF(this.whiteList, targetConfig.whiteList) && Intrinsics.LJFF(this.cleanList, targetConfig.cleanList) && this.strategy == targetConfig.strategy;
    }

    public final int hashCode() {
        return (((this.whiteList.hashCode() * 31) + this.cleanList.hashCode()) * 31) + this.strategy;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TargetConfig(whiteList=");
        sbLIZ.append(this.whiteList);
        sbLIZ.append(", cleanList=");
        sbLIZ.append(this.cleanList);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.strategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TargetConfig(List<String> list, List<String> list2, int i) {
        this.whiteList = list;
        this.cleanList = list2;
        this.strategy = i;
    }

    public TargetConfig(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C1697810uHb.LJIIJJI("For You", "HOME") : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, (i2 & 4) != 0 ? 1 : i);
    }
}
