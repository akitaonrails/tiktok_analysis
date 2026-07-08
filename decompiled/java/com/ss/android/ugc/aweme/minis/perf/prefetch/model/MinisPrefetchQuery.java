package com.ss.android.ugc.aweme.minis.perf.prefetch.model;

import X.C09CT;
import X.C1504370pFb;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPrefetchQuery implements Serializable {
    public static final int $stable = 0;
    public static final C1504370pFb Companion = new Object() { // from class: X.0pFb
    };

    @C09CT("from")
    public final String from;

    @C09CT("key")
    public final String key;

    @C09CT("name")
    public final String name;

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final String value;

    public MinisPrefetchQuery(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.type = str2;
        this.from = str3;
        this.key = str4;
        this.value = str5;
    }
}
