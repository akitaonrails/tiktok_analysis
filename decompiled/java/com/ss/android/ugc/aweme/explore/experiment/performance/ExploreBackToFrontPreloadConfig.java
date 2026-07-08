package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class ExploreBackToFrontPreloadConfig {

    @C09CT("is_enable")
    public final boolean enable;

    @C09CT("need_load_bitmap")
    public final boolean loadBitmap;

    public ExploreBackToFrontPreloadConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreBackToFrontPreloadConfig)) {
            return false;
        }
        ExploreBackToFrontPreloadConfig exploreBackToFrontPreloadConfig = (ExploreBackToFrontPreloadConfig) obj;
        return this.enable == exploreBackToFrontPreloadConfig.enable && this.loadBitmap == exploreBackToFrontPreloadConfig.loadBitmap;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.loadBitmap);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreBackToFrontPreloadConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", loadBitmap=");
        sbLIZ.append(this.loadBitmap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreBackToFrontPreloadConfig(boolean z, boolean z2) {
        this.enable = z;
        this.loadBitmap = z2;
    }
}
