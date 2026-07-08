package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class EcSvPipConfigVarsModel {

    @C09CT("notch_animation_duration_ms")
    public final long notchAnimationDurationMs;

    @C09CT("pip_animation_duration_ms")
    public final long pipAnimationDurationMs;

    @C09CT("snap_to_edge_animation_duration_ms")
    public final long snapToEdgeAnimationDurationMs;

    @C09CT("swipe_to_dismiss_velocity_threshold_android")
    public final long swipeToDismissVelocityThresholdAndroid;

    public EcSvPipConfigVarsModel() {
        this(250L, 300L, 500L, 6000L);
    }

    public EcSvPipConfigVarsModel(long j, long j2, long j3, long j4) {
        this.notchAnimationDurationMs = j;
        this.pipAnimationDurationMs = j2;
        this.snapToEdgeAnimationDurationMs = j3;
        this.swipeToDismissVelocityThresholdAndroid = j4;
    }
}
