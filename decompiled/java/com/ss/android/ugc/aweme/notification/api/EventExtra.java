package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class EventExtra implements Serializable {
    public static final int $stable = 0;

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String value;

    public EventExtra() {
        this(null, null);
    }

    public EventExtra(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
