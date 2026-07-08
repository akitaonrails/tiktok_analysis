package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AgeAppealMenu {

    @C09CT("appeal_date")
    public final String appealDate;

    @C09CT("url")
    public final String appealURL;

    @C09CT("show_age_appeal_menu")
    public final boolean showAgeAppealMenu;

    @C09CT("show_icon")
    public final boolean showIcon;

    public AgeAppealMenu(boolean z, boolean z2, String str, String str2) {
        this.showAgeAppealMenu = z;
        this.showIcon = z2;
        this.appealURL = str;
        this.appealDate = str2;
    }
}
