package com.ss.ugc.effectplatform.model;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class GifProviderEffectModel implements Serializable {
    public ProviderEffectModel gifs;
    public String search_tips;

    public GifProviderEffectModel() {
        this(null, null);
    }

    public ProviderEffectModel getGifs() {
        return this.gifs;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public void setGifs(ProviderEffectModel providerEffectModel) {
        this.gifs = providerEffectModel;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel) {
        this.search_tips = str;
        this.gifs = providerEffectModel;
    }
}
