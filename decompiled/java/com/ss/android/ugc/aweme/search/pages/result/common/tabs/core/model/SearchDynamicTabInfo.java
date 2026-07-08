package com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicTabInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("tab_key")
    public final String tabKey;

    public SearchDynamicTabInfo() {
        this("");
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public SearchDynamicTabInfo(String str) {
        this.tabKey = str;
    }
}
