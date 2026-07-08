package com.bytedance.android.livesdk.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ScorePiecewise {
    public static final TypeAdapter ADAPTER;

    @C09CT("e")
    public float edge;

    @C09CT("f")
    public float factor;

    static {
        NormalGson.singleton();
        ADAPTER = new ScorePiecewise_OptTypeAdapter();
    }

    public ScorePiecewise() {
        this(0.0f, 0.0f);
    }

    public final float getEdge() {
        return this.edge;
    }

    public final float getFactor() {
        return this.factor;
    }

    public final void setEdge(float f) {
        this.edge = f;
    }

    public final void setFactor(float f) {
        this.factor = f;
    }

    public ScorePiecewise(float f, float f2) {
        this.edge = f;
        this.factor = f2;
    }
}
