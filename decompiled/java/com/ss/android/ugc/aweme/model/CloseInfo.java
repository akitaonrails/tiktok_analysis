package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CloseInfo implements Serializable {

    @C09CT("circle_background")
    public final Boolean circleBackground;

    @C09CT("heat_zone")
    public final CloseHeatZoneInfo closeHeatZoneInfo;

    @C09CT("icon")
    public final String iconInfo;

    public CloseInfo() {
        this(null, null, null);
    }

    public CloseInfo(CloseHeatZoneInfo closeHeatZoneInfo, String str, Boolean bool) {
        this.closeHeatZoneInfo = closeHeatZoneInfo;
        this.iconInfo = str;
        this.circleBackground = bool;
    }
}
