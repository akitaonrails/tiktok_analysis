package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LeftSlideConfig implements Serializable {

    @C09CT("distance_threshold")
    public final Float distanceThreshold;

    @C09CT("min_distance_ratio")
    public final Float minDistanceRito;

    @C09CT("min_velocity_ratio")
    public final Float minVelocityRatio;

    public LeftSlideConfig() {
        this(null, null, null);
    }

    public final Float getDistanceThreshold() {
        return this.distanceThreshold;
    }

    public final Float getMinDistanceRito() {
        return this.minDistanceRito;
    }

    public final Float getMinVelocityRatio() {
        return this.minVelocityRatio;
    }

    public LeftSlideConfig(Float f, Float f2, Float f3) {
        this.distanceThreshold = f;
        this.minDistanceRito = f2;
        this.minVelocityRatio = f3;
    }
}
