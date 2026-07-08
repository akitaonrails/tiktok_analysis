package com.ss.android.ugc.gamora.recorder.layout.duration;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraLayoutDurationStrategyParams {

    @C09CT("duration_threshold")
    public final long durationThreshold;

    @C09CT("live_photo_loop_count")
    public final int livePhotoLoopCount;

    @C09CT("strategy")
    public final String strategyType;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraLayoutDurationStrategyParams(strategyType=");
        sbLIZ.append(this.strategyType);
        sbLIZ.append(", durationThreshold=");
        sbLIZ.append(this.durationThreshold);
        sbLIZ.append(", livePhotoLoopCount=");
        sbLIZ.append(this.livePhotoLoopCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CameraLayoutDurationStrategyParams() {
        this("default", 0L, 0);
    }

    public CameraLayoutDurationStrategyParams(String str, long j, int i) {
        this.strategyType = str;
        this.durationThreshold = j;
        this.livePhotoLoopCount = i;
    }
}
