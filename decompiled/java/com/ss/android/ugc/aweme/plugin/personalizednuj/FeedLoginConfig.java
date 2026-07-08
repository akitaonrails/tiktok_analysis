package com.ss.android.ugc.aweme.plugin.personalizednuj;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedLoginConfig {

    @C09CT("is_enabled")
    public final Boolean isEnabled;

    @C09CT("login_panel_size")
    public final Integer loginPanelSize;

    @C09CT("login_panel_style")
    public final Integer loginPanelStyle;

    @C09CT("login_panel_type")
    public final Integer loginPanelType;

    @C09CT("show_on_vv")
    public final Integer showOnVV;

    public FeedLoginConfig() {
        this(Boolean.FALSE, 0, 0, 0, 0);
    }

    public FeedLoginConfig(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.isEnabled = bool;
        this.showOnVV = num;
        this.loginPanelSize = num2;
        this.loginPanelType = num3;
        this.loginPanelStyle = num4;
    }
}
