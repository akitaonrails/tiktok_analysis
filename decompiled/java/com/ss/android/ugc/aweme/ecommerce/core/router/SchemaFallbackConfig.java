package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SchemaFallbackConfig {

    @C09CT("fallback")
    public final String fallback;

    @C09CT("key")
    public final String key;

    public SchemaFallbackConfig() {
        this("", "");
    }

    public SchemaFallbackConfig(String str, String str2) {
        this.key = str;
        this.fallback = str2;
    }
}
