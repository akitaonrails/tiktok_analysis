package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IntentionConfig implements Serializable {

    @C09CT("urgency_events")
    public final List<String> urgencyEvents;

    @C09CT("version")
    public final String version;

    public IntentionConfig() {
        this(null, null);
    }

    public IntentionConfig(List<String> list, String str) {
        this.urgencyEvents = list;
        this.version = str;
    }
}
