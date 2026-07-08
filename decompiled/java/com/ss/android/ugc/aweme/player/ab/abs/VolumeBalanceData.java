package com.ss.android.ugc.aweme.player.ab.abs;

/* JADX INFO: loaded from: classes24.dex */
public final class VolumeBalanceData {
    public float pregain = 0.25f;
    public float threshold = -18.0f;
    public float ratio = 8.0f;
    public float predelay = 0.007f;

    public final float getPredelay() {
        return this.predelay;
    }

    public final float getPregain() {
        return this.pregain;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public final void setPredelay(float f) {
        this.predelay = f;
    }

    public final void setPregain(float f) {
        this.pregain = f;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setThreshold(float f) {
        this.threshold = f;
    }
}
