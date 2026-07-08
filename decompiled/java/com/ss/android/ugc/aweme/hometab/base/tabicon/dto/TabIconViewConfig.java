package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class TabIconViewConfig {

    @C09CT("icon_config")
    public final IconConfig iconConfig;

    @C09CT("icon_size")
    public final IconSizeConfig iconSizeConfig;

    public TabIconViewConfig() {
        this(null, null);
    }

    public final int hashCode() {
        IconConfig iconConfig = this.iconConfig;
        int iHashCode = (iconConfig == null ? 0 : iconConfig.hashCode()) * 31;
        IconSizeConfig iconSizeConfig = this.iconSizeConfig;
        return iHashCode + (iconSizeConfig != null ? iconSizeConfig.hashCode() : 0);
    }

    public TabIconViewConfig(IconConfig iconConfig, IconSizeConfig iconSizeConfig) {
        this.iconConfig = iconConfig;
        this.iconSizeConfig = iconSizeConfig;
    }
}
