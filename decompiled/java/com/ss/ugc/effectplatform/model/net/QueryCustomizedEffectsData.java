package com.ss.ugc.effectplatform.model.net;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QueryCustomizedEffectsData implements Serializable {
    public List<? extends Effect> effects;
    public List<String> url_prefix;
    public List<String> url_prefix2;

    public QueryCustomizedEffectsData() {
        this(null, null, null);
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix2() {
        return this.url_prefix2;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix2(List<String> list) {
        this.url_prefix2 = list;
    }

    public QueryCustomizedEffectsData(List<String> list, List<String> list2, List<? extends Effect> list3) {
        this.url_prefix = list;
        this.url_prefix2 = list2;
        this.effects = list3;
    }
}
