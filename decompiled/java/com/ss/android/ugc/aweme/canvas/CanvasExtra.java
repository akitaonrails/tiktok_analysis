package com.ss.android.ugc.aweme.canvas;

import X.C09CT;
import X.C574820Mga;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CanvasExtra implements Serializable {
    public static final C574820Mga Companion = new Object() { // from class: X.0Mga
    };

    @C09CT(alternate = {"d"}, value = "duration")
    public final int duration;

    @C09CT("enableVVInteract")
    public final boolean enableVVInteract;

    @C09CT("forwardCanvasExtra")
    public ForwardCanvasExtra forwardCanvasExtra;

    @C09CT("canvasGesture")
    public final CanvasGestureConfig gestureConfig;

    @C09CT(alternate = {"c"}, value = "height")
    public final int height;

    @C09CT("rotation")
    public final int rotation;

    @C09CT(alternate = {"g"}, value = "scaleMaxLimit")
    public final float scaleMaxLimit;

    @C09CT(alternate = {"f"}, value = "scaleMinLimit")
    public final float scaleMinLimit;

    @C09CT("speed")
    public final float speed;

    @C09CT("startTime")
    public final long startTime;

    @C09CT("surface_top_margin")
    public final int surfaceTopMargin;

    @C09CT(alternate = {"a"}, value = "type")
    public final int type;

    @C09CT(alternate = {"b"}, value = "width")
    public final int width;

    public CanvasExtra() {
        this(0, 0, 0, 0, 0, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false), null, 1.0f, 0L, 0);
    }

    public final CanvasExtra copy(int i, int i2, int i3, int i4, int i5, float f, float f2, boolean z, CanvasGestureConfig canvasGestureConfig, ForwardCanvasExtra forwardCanvasExtra, float f3, long j, int i6) {
        return new CanvasExtra(i, i2, i3, i4, i5, f, f2, z, canvasGestureConfig, forwardCanvasExtra, f3, j, i6);
    }

    public String toString() {
        return "CanvasExtra(type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", surfaceTopMargin=" + this.surfaceTopMargin + ", duration=" + this.duration + ", scaleMinLimit=" + this.scaleMinLimit + ", scaleMaxLimit=" + this.scaleMaxLimit + ", enableVVInteract=" + this.enableVVInteract + ", gestureConfig=" + this.gestureConfig + ", forwardCanvasExtra=" + this.forwardCanvasExtra + ", speed=" + this.speed + ", startTime=" + this.startTime + ", rotation=" + this.rotation + ')';
    }

    public final long getEndTime() {
        return this.startTime + ((long) this.duration);
    }

    public final void setForwardCanvasExtra(ForwardCanvasExtra forwardCanvasExtra) {
        this.forwardCanvasExtra = forwardCanvasExtra;
    }

    public CanvasExtra(int i, int i2, int i3, int i4, int i5, float f, float f2, boolean z, CanvasGestureConfig canvasGestureConfig, ForwardCanvasExtra forwardCanvasExtra, float f3, long j, int i6) {
        this.type = i;
        this.width = i2;
        this.height = i3;
        this.surfaceTopMargin = i4;
        this.duration = i5;
        this.scaleMinLimit = f;
        this.scaleMaxLimit = f2;
        this.enableVVInteract = z;
        this.gestureConfig = canvasGestureConfig;
        this.forwardCanvasExtra = forwardCanvasExtra;
        this.speed = f3;
        this.startTime = j;
        this.rotation = i6;
    }
}
