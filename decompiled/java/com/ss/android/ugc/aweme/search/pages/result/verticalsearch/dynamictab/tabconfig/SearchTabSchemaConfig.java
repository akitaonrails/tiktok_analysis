package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabSchemaConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("default_schema")
    public final String defaultSchema;

    @C09CT("key_of_settings")
    public final String keyOfSettings;

    public SearchTabSchemaConfig() {
        this(null, null);
    }

    public SearchTabSchemaConfig(String str, String str2) {
        this.keyOfSettings = str;
        this.defaultSchema = str2;
    }
}
