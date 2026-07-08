package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class UploadSpeedDetectionMapping {
    public static final TypeAdapter ADAPTER;

    @C09CT("hd_60_min")
    public float hd_60_min;

    @C09CT("hd_min")
    public float hd_min;

    @C09CT("ld_min")
    public float ld_min;

    @C09CT("sd_min")
    public float sd_min;

    @C09CT("uhd_60_min")
    public float uhd_60_min;

    @C09CT("uhd_min")
    public float uhd_min;

    static {
        NormalGson.singleton();
        ADAPTER = new UploadSpeedDetectionMapping_OptTypeAdapter();
    }

    public UploadSpeedDetectionMapping() {
        this(0.5f, 1.5f, 2.5f, 4.0f, 6.0f, 6.0f);
    }

    public final float getHd_60_min() {
        return this.hd_60_min;
    }

    public final float getHd_min() {
        return this.hd_min;
    }

    public final float getLd_min() {
        return this.ld_min;
    }

    public final float getSd_min() {
        return this.sd_min;
    }

    public final float getUhd_60_min() {
        return this.uhd_60_min;
    }

    public final float getUhd_min() {
        return this.uhd_min;
    }

    public final void setHd_60_min(float f) {
        this.hd_60_min = f;
    }

    public final void setHd_min(float f) {
        this.hd_min = f;
    }

    public final void setLd_min(float f) {
        this.ld_min = f;
    }

    public final void setSd_min(float f) {
        this.sd_min = f;
    }

    public final void setUhd_60_min(float f) {
        this.uhd_60_min = f;
    }

    public final void setUhd_min(float f) {
        this.uhd_min = f;
    }

    public UploadSpeedDetectionMapping(float f, float f2, float f3, float f4, float f5, float f6) {
        this.ld_min = f;
        this.sd_min = f2;
        this.hd_min = f3;
        this.hd_60_min = f4;
        this.uhd_min = f5;
        this.uhd_60_min = f6;
    }
}
