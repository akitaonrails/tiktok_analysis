package com.bytedance.android.livesdk.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PerfItemConfig {
    public static final TypeAdapter ADAPTER = new PerfItemConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("b")
    public float base;

    @C09CT("p_list")
    public List<ScorePiecewise> pieces;

    @C09CT("w")
    public float weight;

    public PerfItemConfig() {
        this(null, 0.0f, 0.0f);
    }

    public final float getBase() {
        return this.base;
    }

    public final List<ScorePiecewise> getPieces() {
        return this.pieces;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setBase(float f) {
        this.base = f;
    }

    public final void setPieces(List<ScorePiecewise> list) {
        this.pieces = list;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public PerfItemConfig(List<ScorePiecewise> list, float f, float f2) {
        this.pieces = list;
        this.base = f;
        this.weight = f2;
    }
}
