package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteIconFlipFrequencySettingsModel implements Serializable {

    @C09CT("delay_time_type_a")
    public final long delayTimeTypeA;

    @C09CT("delay_time_type_b")
    public final long delayTimeTypeB;

    @C09CT("promote_icon_flip_max_times")
    public final int promoteIconFlipMaxTimes;

    @C09CT("promote_icon_flip_time_gap")
    public final int promoteIconFlipTimeGap;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final boolean f68switch;

    public final long getDelayTimeTypeA() {
        return this.delayTimeTypeA;
    }

    public final long getDelayTimeTypeB() {
        return this.delayTimeTypeB;
    }

    public final int getPromoteIconFlipMaxTimes() {
        return this.promoteIconFlipMaxTimes;
    }

    public final int getPromoteIconFlipTimeGap() {
        return this.promoteIconFlipTimeGap;
    }

    public final boolean getSwitch() {
        return this.f68switch;
    }

    public PromoteIconFlipFrequencySettingsModel(boolean z, long j, long j2, int i, int i2) {
        this.f68switch = z;
        this.delayTimeTypeA = j;
        this.delayTimeTypeB = j2;
        this.promoteIconFlipMaxTimes = i;
        this.promoteIconFlipTimeGap = i2;
    }
}
