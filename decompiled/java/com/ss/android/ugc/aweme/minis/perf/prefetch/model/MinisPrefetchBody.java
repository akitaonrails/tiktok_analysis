package com.ss.android.ugc.aweme.minis.perf.prefetch.model;

import X.C09CT;
import X.C1504350pFZ;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPrefetchBody implements Serializable {
    public static final int $stable = 0;
    public static final C1504350pFZ Companion = new Object() { // from class: X.0pFZ
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

    public final String getFrom() {
        return this.from;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public MinisPrefetchBody(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.type = str2;
        this.from = str3;
        this.key = str4;
        this.value = str5;
    }
}
