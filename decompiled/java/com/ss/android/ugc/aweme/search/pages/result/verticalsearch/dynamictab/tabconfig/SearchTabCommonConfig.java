package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTabCommonConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("btm")
    public final String btm;

    @C09CT("enable_search_filter")
    public final Boolean enableSearchFilter;

    @C09CT("is_native_first_request")
    public final Boolean isNativeFirstRequest;

    @C09CT("is_visible")
    public final Boolean isVisible;

    @C09CT("tab_name")
    public final String tabName;

    @C09CT("tab_play_config")
    public final SearchTabPlayConfig tabPlayConfig;

    public SearchTabCommonConfig() {
        this(Boolean.FALSE, null, "", Boolean.FALSE, Boolean.TRUE, null);
    }

    public final Boolean isNativeFirstRequest() {
        return this.isNativeFirstRequest;
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    public SearchTabCommonConfig(Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, SearchTabPlayConfig searchTabPlayConfig) {
        this.isVisible = bool;
        this.tabName = str;
        this.btm = str2;
        this.enableSearchFilter = bool2;
        this.isNativeFirstRequest = bool3;
        this.tabPlayConfig = searchTabPlayConfig;
    }
}
