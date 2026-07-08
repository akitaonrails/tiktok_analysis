package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes28.dex */
public final class SkeletonOptConfig {
    public static final int $stable = 0;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("item_count")
    public final int itemCount;

    @C09CT("shimmer_effect")
    public final boolean shimmerEffect;

    public SkeletonOptConfig() {
        this(false, false, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkeletonOptConfig)) {
            return false;
        }
        SkeletonOptConfig skeletonOptConfig = (SkeletonOptConfig) obj;
        return this.enable == skeletonOptConfig.enable && this.shimmerEffect == skeletonOptConfig.shimmerEffect && this.itemCount == skeletonOptConfig.itemCount;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.shimmerEffect)) * 31) + this.itemCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkeletonOptConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", shimmerEffect=");
        sbLIZ.append(this.shimmerEffect);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.itemCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SkeletonOptConfig(boolean z, boolean z2, int i) {
        this.enable = z;
        this.shimmerEffect = z2;
        this.itemCount = i;
    }
}
