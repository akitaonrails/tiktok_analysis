package com.ss.android.ugc.playerkit.model.meta;

import X.C09CT;
import X.C1473240oRO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class AudioTransparentProcessData implements Serializable {
    public static final C1473240oRO Companion = new Object() { // from class: X.0oRO
    };

    @C09CT("har_lie_bias")
    public Float harLieBias = Float.valueOf(0.0f);

    @C09CT("age_loudness_bias")
    public Float ageLoudnessBias = Float.valueOf(-404.0f);

    public final Float getAgeLoudnessBias() {
        return this.ageLoudnessBias;
    }

    public final Float getHarLieBias() {
        return this.harLieBias;
    }

    public final void setAgeLoudnessBias(Float f) {
        this.ageLoudnessBias = f;
    }

    public final void setHarLieBias(Float f) {
        this.harLieBias = f;
    }
}
