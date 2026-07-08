package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TabPreloadTimingConfig {

    @C09CT("bottom_tab_preload_config")
    public final BottomTabPreloadConfig bottomTabPreloadConfig;

    @C09CT("top_tab_preload_config")
    public final TopTabPreloadConfig topTabPreloadConfig;

    public TabPreloadTimingConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPreloadTimingConfig)) {
            return false;
        }
        TabPreloadTimingConfig tabPreloadTimingConfig = (TabPreloadTimingConfig) obj;
        return Intrinsics.LJFF(this.topTabPreloadConfig, tabPreloadTimingConfig.topTabPreloadConfig) && Intrinsics.LJFF(this.bottomTabPreloadConfig, tabPreloadTimingConfig.bottomTabPreloadConfig);
    }

    public final int hashCode() {
        TopTabPreloadConfig topTabPreloadConfig = this.topTabPreloadConfig;
        int iHashCode = (topTabPreloadConfig == null ? 0 : topTabPreloadConfig.hashCode()) * 31;
        BottomTabPreloadConfig bottomTabPreloadConfig = this.bottomTabPreloadConfig;
        return iHashCode + (bottomTabPreloadConfig != null ? bottomTabPreloadConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabPreloadTimingConfig(topTabPreloadConfig=");
        sbLIZ.append(this.topTabPreloadConfig);
        sbLIZ.append(", bottomTabPreloadConfig=");
        sbLIZ.append(this.bottomTabPreloadConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TabPreloadTimingConfig(TopTabPreloadConfig topTabPreloadConfig, BottomTabPreloadConfig bottomTabPreloadConfig) {
        this.topTabPreloadConfig = topTabPreloadConfig;
        this.bottomTabPreloadConfig = bottomTabPreloadConfig;
    }
}
