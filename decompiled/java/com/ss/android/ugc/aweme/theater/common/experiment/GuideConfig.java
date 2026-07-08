package com.ss.android.ugc.aweme.theater.common.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class GuideConfig {

    @C09CT("daily_show_limit")
    public final int dayShowLimit;

    @C09CT("dismiss_click_num")
    public final int totalShowLimit;

    public GuideConfig() {
        this(1, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideConfig)) {
            return false;
        }
        GuideConfig guideConfig = (GuideConfig) obj;
        return this.dayShowLimit == guideConfig.dayShowLimit && this.totalShowLimit == guideConfig.totalShowLimit;
    }

    public final int hashCode() {
        return (this.dayShowLimit * 31) + this.totalShowLimit;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideConfig(dayShowLimit=");
        sbLIZ.append(this.dayShowLimit);
        sbLIZ.append(", totalShowLimit=");
        sbLIZ.append(this.totalShowLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GuideConfig(int i, int i2) {
        this.dayShowLimit = i;
        this.totalShowLimit = i2;
    }
}
