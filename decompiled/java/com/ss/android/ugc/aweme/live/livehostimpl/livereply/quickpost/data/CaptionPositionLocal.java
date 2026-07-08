package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class CaptionPositionLocal implements Serializable {
    public static final int $stable = 8;
    public double centerX;
    public double centerY;

    public CaptionPositionLocal() {
        this(0.5d, 0.5d);
    }

    public final double getCenterX() {
        return this.centerX;
    }

    public final double getCenterY() {
        return this.centerY;
    }

    public final void setCenterX(double d) {
        this.centerX = d;
    }

    public final void setCenterY(double d) {
        this.centerY = d;
    }

    public CaptionPositionLocal(double d, double d2) {
        this.centerX = d;
        this.centerY = d2;
    }
}
