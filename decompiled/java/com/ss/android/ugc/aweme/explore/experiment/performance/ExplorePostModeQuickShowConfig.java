package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class ExplorePostModeQuickShowConfig {

    @C09CT("delay_init_view")
    public final boolean delayInitView;

    @C09CT("pre_hot")
    public final boolean preHot;

    public ExplorePostModeQuickShowConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExplorePostModeQuickShowConfig)) {
            return false;
        }
        ExplorePostModeQuickShowConfig explorePostModeQuickShowConfig = (ExplorePostModeQuickShowConfig) obj;
        return this.preHot == explorePostModeQuickShowConfig.preHot && this.delayInitView == explorePostModeQuickShowConfig.delayInitView;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.preHot) * 31) + C786410Ut5.Z2(this.delayInitView);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExplorePostModeQuickShowConfig(preHot=");
        sbLIZ.append(this.preHot);
        sbLIZ.append(", delayInitView=");
        sbLIZ.append(this.delayInitView);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExplorePostModeQuickShowConfig(boolean z, boolean z2) {
        this.preHot = z;
        this.delayInitView = z2;
    }
}
