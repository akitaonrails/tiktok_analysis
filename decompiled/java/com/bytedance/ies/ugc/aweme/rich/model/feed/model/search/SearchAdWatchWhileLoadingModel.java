package com.bytedance.ies.ugc.aweme.rich.model.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdWatchWhileLoadingModel implements Serializable {

    @C09CT("enable_click_area_list")
    public final List<String> enableClickAreaList;

    @C09CT("hide_nav_bar")
    public final boolean hideNavbar;

    @C09CT("sheet_ratio")
    public final int sheetRatio = 40;

    public final List<String> getEnableClickAreaList() {
        return this.enableClickAreaList;
    }

    public final boolean getHideNavbar() {
        return this.hideNavbar;
    }

    public final int getSheetRatio() {
        return this.sheetRatio;
    }
}
