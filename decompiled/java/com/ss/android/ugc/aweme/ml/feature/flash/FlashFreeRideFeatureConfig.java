package com.ss.android.ugc.aweme.ml.feature.flash;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class FlashFreeRideFeatureConfig {
    public final String featureSet;
    public final boolean isFlat;
    public final String paramsKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashFreeRideFeatureConfig)) {
            return false;
        }
        FlashFreeRideFeatureConfig flashFreeRideFeatureConfig = (FlashFreeRideFeatureConfig) obj;
        return Intrinsics.LJFF(this.paramsKey, flashFreeRideFeatureConfig.paramsKey) && Intrinsics.LJFF(this.featureSet, flashFreeRideFeatureConfig.featureSet) && this.isFlat == flashFreeRideFeatureConfig.isFlat;
    }

    public int hashCode() {
        return (((this.paramsKey.hashCode() * 31) + this.featureSet.hashCode()) * 31) + C786410Ut5.Z2(this.isFlat);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashFreeRideFeatureConfig(paramsKey=");
        sbLIZ.append(this.paramsKey);
        sbLIZ.append(", featureSet=");
        sbLIZ.append(this.featureSet);
        sbLIZ.append(", isFlat=");
        sbLIZ.append(this.isFlat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashFreeRideFeatureConfig() {
        this("", "", false);
    }

    public final boolean isFlat() {
        return this.isFlat;
    }

    public FlashFreeRideFeatureConfig(String str, String str2, boolean z) {
        this.paramsKey = str;
        this.featureSet = str2;
        this.isFlat = z;
    }
}
