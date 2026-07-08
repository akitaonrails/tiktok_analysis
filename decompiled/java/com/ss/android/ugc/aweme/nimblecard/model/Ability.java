package com.ss.android.ugc.aweme.nimblecard.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class Ability {

    @C09CT("params")
    public final Map<String, String> params;

    @C09CT("tag")
    public final String tag;

    @C09CT("value")
    public final List<String> value;

    public Ability(String str, List<String> list, Map<String, String> map) {
        this.tag = str;
        this.value = list;
        this.params = map;
    }
}
