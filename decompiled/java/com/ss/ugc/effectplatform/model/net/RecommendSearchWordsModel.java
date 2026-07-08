package com.ss.ugc.effectplatform.model.net;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendSearchWordsModel implements Serializable {
    public List<EffectNameModel> effects;
    public String search_tips;

    public RecommendSearchWordsModel() {
        this(null, null);
    }

    public final void setEffects(List<EffectNameModel> list) {
        this.effects = list;
    }

    public final void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public RecommendSearchWordsModel(String str, List<EffectNameModel> list) {
        this.search_tips = str;
        this.effects = list;
    }
}
