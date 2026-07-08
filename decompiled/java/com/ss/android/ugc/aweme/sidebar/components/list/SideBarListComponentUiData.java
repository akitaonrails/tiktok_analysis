package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C09CT;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SideBarListComponentUiData {

    @C09CT("item_list")
    public final List<SideBarComponentUiData> itemList;

    public SideBarListComponentUiData() {
        this(null);
    }

    public SideBarListComponentUiData(List<SideBarComponentUiData> list) {
        this.itemList = list;
    }
}
