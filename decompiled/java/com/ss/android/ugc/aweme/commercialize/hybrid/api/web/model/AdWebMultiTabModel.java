package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebMultiTabModel implements Serializable {

    @C09CT("current_page_count")
    public int currentPageCount;

    @C09CT("current_page_order")
    public int currentPageOrder;

    @C09CT("current_tab_index")
    public int currentTabIndex;

    @C09CT("current_tab_index_for_update")
    public int currentTabIndexForUpdate;

    @C09CT("last_page_order")
    public int lastPageOrder;

    @C09CT("last_tab_index")
    public int lastTabIndex;

    @C09CT("total_tab_count")
    public int totalTabCount;

    @C09CT("total_tab_count_for_update")
    public int totalTabCountForUpdate;

    public AdWebMultiTabModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final int getCurrentPageCount() {
        return this.currentPageCount;
    }

    public final int getCurrentPageOrder() {
        return this.currentPageOrder;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final int getCurrentTabIndexForUpdate() {
        return this.currentTabIndexForUpdate;
    }

    public final int getLastPageOrder() {
        return this.lastPageOrder;
    }

    public final int getLastTabIndex() {
        return this.lastTabIndex;
    }

    public final int getTotalTabCount() {
        return this.totalTabCount;
    }

    public final int getTotalTabCountForUpdate() {
        return this.totalTabCountForUpdate;
    }

    public final void setCurrentPageCount(int i) {
        this.currentPageCount = i;
    }

    public final void setCurrentPageOrder(int i) {
        this.currentPageOrder = i;
    }

    public final void setCurrentTabIndex(int i) {
        this.currentTabIndex = i;
    }

    public final void setCurrentTabIndexForUpdate(int i) {
        this.currentTabIndexForUpdate = i;
    }

    public final void setLastPageOrder(int i) {
        this.lastPageOrder = i;
    }

    public final void setLastTabIndex(int i) {
        this.lastTabIndex = i;
    }

    public final void setTotalTabCount(int i) {
        this.totalTabCount = i;
    }

    public final void setTotalTabCountForUpdate(int i) {
        this.totalTabCountForUpdate = i;
    }

    public AdWebMultiTabModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.currentTabIndex = i;
        this.totalTabCount = i2;
        this.currentTabIndexForUpdate = i3;
        this.currentPageOrder = i4;
        this.currentPageCount = i5;
        this.totalTabCountForUpdate = i6;
        this.lastTabIndex = i7;
        this.lastPageOrder = i8;
    }
}
