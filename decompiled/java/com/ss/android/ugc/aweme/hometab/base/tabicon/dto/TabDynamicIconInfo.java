package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;
import X.C0NLR;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class TabDynamicIconInfo {
    public final C0NLR LIZ;

    @C09CT("bottom_tab_view_config")
    public final TabIconViewConfig bottomTabIconConfig;

    @C09CT("ui_id")
    public final String iconId;

    @C09CT("tab_key")
    public final String tabKey;

    @C09CT("time_config_list")
    public final List<IconTimeConfig> timeConfigList;

    @C09CT("top_tab_view_config")
    public final TabIconViewConfig topTabIconConfig;

    public TabDynamicIconInfo() {
        this(null, null, null, null, null, null);
    }

    public static TabDynamicIconInfo LIZ(TabDynamicIconInfo tabDynamicIconInfo, C0NLR c0nlr) {
        return new TabDynamicIconInfo(tabDynamicIconInfo.tabKey, tabDynamicIconInfo.iconId, tabDynamicIconInfo.topTabIconConfig, tabDynamicIconInfo.bottomTabIconConfig, tabDynamicIconInfo.timeConfigList, c0nlr);
    }

    public TabDynamicIconInfo(String str, String str2, TabIconViewConfig tabIconViewConfig, TabIconViewConfig tabIconViewConfig2, List<IconTimeConfig> list, C0NLR c0nlr) {
        this.tabKey = str;
        this.iconId = str2;
        this.topTabIconConfig = tabIconViewConfig;
        this.bottomTabIconConfig = tabIconViewConfig2;
        this.timeConfigList = list;
        this.LIZ = c0nlr;
    }
}
