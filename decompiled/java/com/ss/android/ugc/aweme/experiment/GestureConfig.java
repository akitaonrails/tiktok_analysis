package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class GestureConfig {

    @C09CT("distance_close_to_open_skylight")
    public final float distanceCloseToOpenSkylight;

    @C09CT("distance_close_to_redirection")
    public final float distanceCloseToRedirection;

    @C09CT("distance_open_to_close_skylight")
    public final float distanceOpenToCloseSkylight;

    @C09CT("distance_open_to_redirection")
    public final float distanceOpenToRedirection;

    @C09CT("velocity_close_to_redirection_dp_per_s")
    public final float velocityCloseToRedirection;

    public GestureConfig() {
        this(0.8f, 4.0f, 1300.0f, 0.8f, 0.0f);
    }

    public GestureConfig(float f, float f2, float f3, float f4, float f5) {
        this.distanceOpenToRedirection = f;
        this.distanceCloseToRedirection = f2;
        this.velocityCloseToRedirection = f3;
        this.distanceCloseToOpenSkylight = f4;
        this.distanceOpenToCloseSkylight = f5;
    }
}
