package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CloseHeatZoneInfo implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("right")
    public final Integer right;

    @C09CT("top")
    public final Integer top;

    @C09CT("width")
    public final Integer width;

    public CloseHeatZoneInfo() {
        this(null, null, null, null);
    }

    public CloseHeatZoneInfo(Integer num, Integer num2, Integer num3, Integer num4) {
        this.height = num;
        this.width = num2;
        this.top = num3;
        this.right = num4;
    }
}
