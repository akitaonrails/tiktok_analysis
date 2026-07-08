package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PageInfoData implements Serializable {

    @C09CT("poi_secondary_page_bottom_bar_enable")
    public final Boolean poiSecondaryPageEnableBottomBar;

    @C09CT("shelf_component_info_list")
    public final List<ShelfComponentInfo> shelfComponentList;

    public PageInfoData() {
        this(null, null);
    }

    public PageInfoData(List<ShelfComponentInfo> list, Boolean bool) {
        this.shelfComponentList = list;
        this.poiSecondaryPageEnableBottomBar = bool;
    }
}
