package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class EdpAmeEntranceOptConfigData implements Serializable {

    @C09CT("big_banner_background_url")
    public final String bigBannerBgUrl;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("middle_banner_background_url")
    public final String middleBannerBgUrl;

    @C09CT("small_banner_background_url")
    public final String smallBannerBgUrl;

    @C09CT("text_color")
    public final String textColor;

    public EdpAmeEntranceOptConfigData() {
        this(false, "", "", "", "", "");
    }

    public EdpAmeEntranceOptConfigData(boolean z, String str, String str2, String str3, String str4, String str5) {
        this.enable = z;
        this.bigBannerBgUrl = str;
        this.iconUrl = str2;
        this.textColor = str3;
        this.middleBannerBgUrl = str4;
        this.smallBannerBgUrl = str5;
    }
}
