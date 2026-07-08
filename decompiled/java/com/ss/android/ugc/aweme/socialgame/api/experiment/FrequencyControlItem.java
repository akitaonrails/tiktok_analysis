package com.ss.android.ugc.aweme.socialgame.api.experiment;

import X.C09CT;
import X.EnumC1701506lR;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyControlItem {

    @C09CT("max_show_time_in_interval_days")
    public final int maxShowTimeInInterval;

    @C09CT("max_show_time_in_total")
    public final int maxShowTimeInTotal;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("show_interval_days")
    public final int showIntervalDays;

    public FrequencyControlItem() {
        this(EnumC1701506lR.UNKNOWN_SCENE.getValue(), 3, 1, 1);
    }

    public FrequencyControlItem(int i, int i2, int i3, int i4) {
        this.scene = i;
        this.maxShowTimeInTotal = i2;
        this.maxShowTimeInInterval = i3;
        this.showIntervalDays = i4;
    }
}
