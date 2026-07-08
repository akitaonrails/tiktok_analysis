package com.ss.ugc.effectplatform.model.net;

import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectNameModel implements Serializable {
    public String name;

    public EffectNameModel() {
        this(null);
    }

    public EffectNameModel(String str) {
        this.name = str;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
