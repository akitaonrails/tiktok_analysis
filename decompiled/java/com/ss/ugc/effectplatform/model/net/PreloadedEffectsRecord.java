package com.ss.ugc.effectplatform.model.net;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadedEffectsRecord implements Serializable {
    public List<PreloadEffectModel> effect_list;

    public final List<PreloadEffectModel> getEffect_list() {
        return this.effect_list;
    }

    public PreloadedEffectsRecord(List<PreloadEffectModel> list) {
        this.effect_list = list;
    }

    public final void setEffect_list(List<PreloadEffectModel> list) {
        this.effect_list = list;
    }
}
