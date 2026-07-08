package com.ss.android.ugc.aweme.pipo.errorsdk;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorActionUIData {

    @C09CT("error_content_text")
    public final String errorText;

    @C09CT("error_title_text")
    public final String errorTitle;

    @C09CT("icon_type")
    public final String iconType;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("primary_button")
    public final ErrorActionButton primaryButton;

    @C09CT("secondary_button")
    public final ErrorActionButton secondaryButton;

    @C09CT("show_back")
    public final Boolean showBack;

    @C09CT("show_close")
    public final Boolean showClose;

    @C09CT("third_level_button")
    public final ErrorActionButton thirdButton;

    @C09CT("type")
    public final String type;

    public ErrorActionUIData() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public ErrorActionUIData(String str, String str2, String str3, String str4, String str5, ErrorActionButton errorActionButton, ErrorActionButton errorActionButton2, ErrorActionButton errorActionButton3, Boolean bool, Boolean bool2) {
        this.type = str;
        this.errorTitle = str2;
        this.errorText = str3;
        this.iconUrl = str4;
        this.iconType = str5;
        this.primaryButton = errorActionButton;
        this.secondaryButton = errorActionButton2;
        this.thirdButton = errorActionButton3;
        this.showClose = bool;
        this.showBack = bool2;
    }
}
