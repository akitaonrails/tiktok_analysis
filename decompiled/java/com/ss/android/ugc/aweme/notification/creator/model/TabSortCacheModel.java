package com.ss.android.ugc.aweme.notification.creator.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class TabSortCacheModel {
    public static final int $stable = 8;

    @C09CT("sort_id")
    public int sortType;

    @C09CT("tab_id")
    public int tabId;

    public final void setSortType(int i) {
        this.sortType = i;
    }

    public final void setTabId(int i) {
        this.tabId = i;
    }

    public TabSortCacheModel(int i, int i2) {
        this.tabId = i;
        this.sortType = i2;
    }
}
