package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class VolumeAdjustmentExperimentParams implements Serializable {
    public static final int $stable = 0;

    @C09CT("db_range")
    public final double dbRange;

    @C09CT("default_pos")
    public final float defaultPos;

    @C09CT("optimization_on")
    public final boolean enabled;

    public VolumeAdjustmentExperimentParams() {
        this(false, 0.0d, 0.5f);
    }

    public VolumeAdjustmentExperimentParams(boolean z, double d, float f) {
        this.enabled = z;
        this.dbRange = d;
        this.defaultPos = f;
    }
}
