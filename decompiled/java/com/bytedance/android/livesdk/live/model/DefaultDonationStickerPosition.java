package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import X.C1085750eMP;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DefaultDonationStickerPosition {
    public static final TypeAdapter ADAPTER;
    public static final C1085750eMP Companion = new Object() { // from class: X.0eMP
    };
    public static final float DEFAULT_POSITION = 0.5f;

    @C09CT("x_ratio")
    public float xRatio;

    @C09CT("y_ratio")
    public float yRatio;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eMP] */
    static {
        NormalGson.singleton();
        ADAPTER = new DefaultDonationStickerPosition_OptTypeAdapter();
    }

    public static final float getDEFAULT_POSITION() {
        Companion.getClass();
        return DEFAULT_POSITION;
    }

    public DefaultDonationStickerPosition() {
        float f = DEFAULT_POSITION;
        this.xRatio = f;
        this.yRatio = f;
    }

    public final float getXRatio() {
        return this.xRatio;
    }

    public final float getYRatio() {
        return this.yRatio;
    }

    public final void setXRatio(float f) {
        this.xRatio = f;
    }

    public final void setYRatio(float f) {
        this.yRatio = f;
    }
}
