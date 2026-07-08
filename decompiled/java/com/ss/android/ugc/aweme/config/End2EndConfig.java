package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes11.dex */
public final class End2EndConfig {

    @C09CT("comp_search_duration")
    public final int compSearchDurationMs;

    @C09CT("guest_duration")
    public final int recommendDurationMs;

    @C09CT("sug_duration")
    public final int sugDurationMs;

    public End2EndConfig() {
        this(2600, 600, 2000);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(compSearchDurationMs=");
        sbLIZ.append(this.compSearchDurationMs);
        sbLIZ.append(", sugDurationMs=");
        sbLIZ.append(this.sugDurationMs);
        sbLIZ.append(", recommendDurationMs=");
        sbLIZ.append(this.recommendDurationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public End2EndConfig(int i, int i2, int i3) {
        this.compSearchDurationMs = i;
        this.sugDurationMs = i2;
        this.recommendDurationMs = i3;
    }
}
