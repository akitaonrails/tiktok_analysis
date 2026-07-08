package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class NxETMapExperimentModel {

    @C09CT("enable_map_refer")
    public final boolean enableMapRefer;

    @C09CT("enable_snapshot")
    public final boolean enableSnapshot;

    public NxETMapExperimentModel() {
        this(false, false);
    }

    public NxETMapExperimentModel(boolean z, boolean z2) {
        this.enableMapRefer = z;
        this.enableSnapshot = z2;
    }
}
