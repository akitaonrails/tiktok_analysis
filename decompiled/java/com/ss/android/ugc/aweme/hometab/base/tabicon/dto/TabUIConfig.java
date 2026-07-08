package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class TabUIConfig {

    @C09CT("tab_icon_config")
    public final List<TabDynamicIconInfo> tabIconConfig;

    public TabUIConfig() {
        this(null);
    }

    public TabUIConfig(List<TabDynamicIconInfo> list) {
        this.tabIconConfig = list;
    }
}
