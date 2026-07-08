package com.ss.android.ugc.aweme.ug.config;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class DynamicResource {

    @C09CT("cdnUrl")
    public final String cdnUrl;

    @C09CT("hash")
    public final String hash;

    @C09CT("key")
    public final String key;

    @C09CT("size")
    public final int size;

    public DynamicResource() {
        this("", "", "", 0);
    }

    public DynamicResource(String str, String str2, String str3, int i) {
        this.key = str;
        this.cdnUrl = str2;
        this.hash = str3;
        this.size = i;
    }
}
