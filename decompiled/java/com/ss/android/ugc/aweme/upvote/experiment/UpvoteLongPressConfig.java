package com.ss.android.ugc.aweme.upvote.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class UpvoteLongPressConfig {

    @C09CT("alpha_delay_ms")
    public final long alphaDelayMs;

    @C09CT("animation_duration_ms")
    public final long animationDuration;

    @C09CT("on_low_device")
    public final boolean downgradeMock;

    @C09CT("enable_long_press")
    public final boolean enableLongPress;

    @C09CT("long_press_min_duration_android")
    public final long longPressTriggerMs;

    @C09CT("position_duration_ms")
    public final long positionDurationMs;

    @C09CT("position_x_animation_curve")
    public final List<Float> positionXAnimationCurve;

    @C09CT("position_y_animation_curve")
    public final List<Float> positionYAnimationCurve;

    @C09CT("progress_animation_curve")
    public final List<Float> progressAnimationCurve;

    @C09CT("rotate_loop_count")
    public final long rotateLoopCount;

    @C09CT("success_progress_threshold")
    public final float successThreshold;

    @C09CT("vibration_count")
    public final int vibrationCount;

    @C09CT("vibration_count_android")
    public final int vibrationCountAndroid;

    @C09CT("reduce_duration_ms")
    public final long zoomOutDurationMs;

    public UpvoteLongPressConfig() {
        this(false, 1, 1200L, 4L, false, C1697810uHb.LJIIJJI(Float.valueOf(0.6f), Float.valueOf(0.0f), Float.valueOf(0.3f), Float.valueOf(1.0f)), 0.96f, 350L, C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJIIJJI(Float.valueOf(0.56f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.44f)), 700L, 250L, 0, 0L);
    }

    public UpvoteLongPressConfig(boolean z, int i, long j, long j2, boolean z2, List<Float> list, float f, long j3, List<Float> list2, List<Float> list3, long j4, long j5, int i2, long j6) {
        this.enableLongPress = z;
        this.vibrationCount = i;
        this.animationDuration = j;
        this.rotateLoopCount = j2;
        this.downgradeMock = z2;
        this.progressAnimationCurve = list;
        this.successThreshold = f;
        this.positionDurationMs = j3;
        this.positionXAnimationCurve = list2;
        this.positionYAnimationCurve = list3;
        this.alphaDelayMs = j4;
        this.zoomOutDurationMs = j5;
        this.vibrationCountAndroid = i2;
        this.longPressTriggerMs = j6;
    }
}
