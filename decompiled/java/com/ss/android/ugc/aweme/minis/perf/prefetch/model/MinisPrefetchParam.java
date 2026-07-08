package com.ss.android.ugc.aweme.minis.perf.prefetch.model;

import X.C09CT;
import X.C1504360pFa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPrefetchParam implements Serializable {

    @C09CT("from")
    public final String from;

    @C09CT("key")
    public final String key;

    @C09CT("name")
    public String name;

    @C09CT("type")
    public final String type;
    public static final C1504360pFa Companion = new Object() { // from class: X.0pFa
    };
    public static final int $stable = 8;

    public final void setName(String str) {
        this.name = str;
    }

    public MinisPrefetchParam(String str, String str2, String str3, String str4) {
        this.name = str;
        this.type = str2;
        this.from = str3;
        this.key = str4;
    }
}
