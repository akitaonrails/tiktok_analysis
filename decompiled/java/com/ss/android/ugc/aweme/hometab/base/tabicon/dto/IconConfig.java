package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class IconConfig {

    @C09CT("icon_select_dark")
    public final String iconSelectDarkUrl;

    @C09CT("icon_select_light")
    public final String iconSelectLightUrl;

    @C09CT("icon_unselect_dark")
    public final String iconUnSelectDarkUrl;

    @C09CT("icon_unselect_light")
    public final String iconUnSelectLightUrl;

    public IconConfig() {
        this(null, null, null, null);
    }

    public final int hashCode() {
        String str = this.iconSelectLightUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconSelectDarkUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUnSelectLightUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUnSelectDarkUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public IconConfig(String str, String str2, String str3, String str4) {
        this.iconSelectLightUrl = str;
        this.iconSelectDarkUrl = str2;
        this.iconUnSelectLightUrl = str3;
        this.iconUnSelectDarkUrl = str4;
    }
}
