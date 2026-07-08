package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TabCleanScoreParams {

    @C09CT("idle_coefficient")
    public final float idleCoefficient;

    @C09CT("idle_weight")
    public final float idleWeight;

    @C09CT("solaria_max")
    public final int solariaMax;

    @C09CT("solaria_weight")
    public final float solariaWeight;

    @C09CT("unread_weight")
    public final float unreadWeight;

    public TabCleanScoreParams() {
        this(0.2f, 0.005f, 0.2f, 0.6f, 3);
    }

    public TabCleanScoreParams(float f, float f2, float f3, float f4, int i) {
        this.idleWeight = f;
        this.idleCoefficient = f2;
        this.unreadWeight = f3;
        this.solariaWeight = f4;
        this.solariaMax = i;
    }
}
