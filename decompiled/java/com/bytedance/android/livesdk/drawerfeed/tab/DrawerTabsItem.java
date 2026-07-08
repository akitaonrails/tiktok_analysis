package com.bytedance.android.livesdk.drawerfeed.tab;

import X.C09CT;
import java.util.List;
import webcast.api.feed.TabItemInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawerTabsItem {

    @C09CT("sub_tabs")
    public final List<TabItemInfo> subTabs;

    @C09CT("tab_name")
    public final String tabName;

    @C09CT("tab_type")
    public final String tabType;

    public DrawerTabsItem(String str, String str2, List<TabItemInfo> list) {
        this.tabType = str;
        this.tabName = str2;
        this.subTabs = list;
    }
}
