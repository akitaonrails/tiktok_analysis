package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class IconTimeConfig {

    @C09CT("end_config")
    public final IconInOutConfig endConfig;

    @C09CT("start_config")
    public final IconInOutConfig startConfig;

    public IconTimeConfig() {
        this(null, null);
    }

    public IconTimeConfig(IconInOutConfig iconInOutConfig, IconInOutConfig iconInOutConfig2) {
        this.startConfig = iconInOutConfig;
        this.endConfig = iconInOutConfig2;
    }
}
