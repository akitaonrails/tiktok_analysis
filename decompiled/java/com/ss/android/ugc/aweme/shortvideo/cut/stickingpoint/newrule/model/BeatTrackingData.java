package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class BeatTrackingData {

    @C09CT("duration_ms")
    public final int durationMs;

    @C09CT("energy")
    public final List<Double> energy;

    @C09CT("time")
    public final List<Integer> timeMs;

    @C09CT("value")
    public final List<Integer> value;

    public BeatTrackingData() {
        this(0, null, null, null, 15, null);
    }

    public BeatTrackingData(int i, List<Integer> list, List<Integer> list2, List<Double> list3) {
        this.durationMs = i;
        this.timeMs = list;
        this.value = list2;
        this.energy = list3;
    }

    public BeatTrackingData(int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? C13BV.INSTANCE : list3);
    }
}
