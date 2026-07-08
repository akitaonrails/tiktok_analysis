package com.ss.android.ugc.aweme.ecommerce.base.pdp.libra;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PreloadStepOptions {

    @C09CT("keep_alive")
    public final boolean keepAlive;

    @C09CT("match")
    public final Integer match;

    @C09CT("pending_load")
    public final Boolean pendingLoad;

    @C09CT("pool_capacity")
    public final Integer poolCapacity;

    @C09CT("pool_size")
    public final Integer poolSize;

    public PreloadStepOptions() {
        this(null, Boolean.FALSE, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadStepOptions)) {
            return false;
        }
        PreloadStepOptions preloadStepOptions = (PreloadStepOptions) obj;
        return Intrinsics.LJFF(this.poolCapacity, preloadStepOptions.poolCapacity) && Intrinsics.LJFF(this.pendingLoad, preloadStepOptions.pendingLoad) && this.keepAlive == preloadStepOptions.keepAlive && Intrinsics.LJFF(this.poolSize, preloadStepOptions.poolSize) && Intrinsics.LJFF(this.match, preloadStepOptions.match);
    }

    public final int hashCode() {
        Integer num = this.poolCapacity;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.pendingLoad;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.keepAlive)) * 31;
        Integer num2 = this.poolSize;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.match;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadStepOptions(poolCapacity=");
        sbLIZ.append(this.poolCapacity);
        sbLIZ.append(", pendingLoad=");
        sbLIZ.append(this.pendingLoad);
        sbLIZ.append(", keepAlive=");
        sbLIZ.append(this.keepAlive);
        sbLIZ.append(", poolSize=");
        sbLIZ.append(this.poolSize);
        sbLIZ.append(", match=");
        sbLIZ.append(this.match);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadStepOptions(Integer num, Boolean bool, boolean z, Integer num2, Integer num3) {
        this.poolCapacity = num;
        this.pendingLoad = bool;
        this.keepAlive = z;
        this.poolSize = num2;
        this.match = num3;
    }
}
