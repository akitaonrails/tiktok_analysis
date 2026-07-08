package com.ss.ugc.effectplatform.model.net;

import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public class GetCustomizedEffectIDData implements Serializable {
    public String effect_id;

    public GetCustomizedEffectIDData() {
        this(null);
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public GetCustomizedEffectIDData(String str) {
        this.effect_id = str;
    }

    public void setEffect_id(String str) {
        this.effect_id = str;
    }
}
