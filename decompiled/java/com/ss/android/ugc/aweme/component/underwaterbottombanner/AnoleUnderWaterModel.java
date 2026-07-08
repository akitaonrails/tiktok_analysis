package com.ss.android.ugc.aweme.component.underwaterbottombanner;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleUnderWaterModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("jump_data")
    public AnoleJumpData jumpData;

    @C09CT("under_water_status")
    public Map<String, String> underWaterStatus;

    public final void setJumpData(AnoleJumpData anoleJumpData) {
        this.jumpData = anoleJumpData;
    }

    public final void setUnderWaterStatus(Map<String, String> map) {
        this.underWaterStatus = map;
    }

    public AnoleUnderWaterModel(Map<String, String> map, AnoleJumpData anoleJumpData) {
        this.underWaterStatus = map;
        this.jumpData = anoleJumpData;
    }
}
