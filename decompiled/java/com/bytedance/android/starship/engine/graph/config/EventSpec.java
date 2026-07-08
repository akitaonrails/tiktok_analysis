package com.bytedance.android.starship.engine.graph.config;

import X.C09CS;
import X.C09CT;
import X.EnumC1308010k8t;

/* JADX INFO: loaded from: classes21.dex */
public final class EventSpec {

    @C09CT("name")
    public final String name;

    @C09CT("source")
    @C09CS(EventSourceAdapter.class)
    public final EnumC1308010k8t source;

    public EventSpec() {
        this(EnumC1308010k8t.CUSTOM, null);
    }

    public EventSpec(EnumC1308010k8t enumC1308010k8t, String str) {
        this.source = enumC1308010k8t;
        this.name = str;
    }
}
