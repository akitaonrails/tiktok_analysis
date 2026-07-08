package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("android_config")
    public final SearchTabAndroidConfig androidConfig;

    @C09CT("api_config")
    public final SearchTabApiConfig apiConfig;

    @C09CT("schema_config")
    public final SearchTabSchemaConfig schemaConfig;

    @C09CT("tab_common_config")
    public final SearchTabCommonConfig tabCommonConfig;

    public SearchTabConfig() {
        this(null, null, null, null);
    }

    public SearchTabConfig(SearchTabCommonConfig searchTabCommonConfig, SearchTabSchemaConfig searchTabSchemaConfig, SearchTabApiConfig searchTabApiConfig, SearchTabAndroidConfig searchTabAndroidConfig) {
        this.tabCommonConfig = searchTabCommonConfig;
        this.schemaConfig = searchTabSchemaConfig;
        this.apiConfig = searchTabApiConfig;
        this.androidConfig = searchTabAndroidConfig;
    }
}
