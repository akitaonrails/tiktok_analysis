package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class BindConfig implements Serializable {

    @C09CT("keys")
    public final List<String> keys;

    @C09CT("rules")
    public final List<String> ruleIds;

    @C09CT("scene_list")
    public final List<String> scenes;

    public BindConfig() {
        this(null, null, null);
    }

    public BindConfig(List<String> list, List<String> list2, List<String> list3) {
        this.scenes = list;
        this.keys = list2;
        this.ruleIds = list3;
    }
}
