package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class Resource {

    @C09CT("cache_key")
    public final String cache_key;

    @C09CT("key")
    public final String key;

    @C09CT("path")
    public final String path;

    @C09CT("type")
    public final String type;

    public Resource() {
        this(null, null, null, null);
    }

    public Resource(String str, String str2, String str3, String str4) {
        this.type = str;
        this.path = str2;
        this.key = str3;
        this.cache_key = str4;
    }
}
