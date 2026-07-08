package com.ss.android.ugc.aweme.plugin.personalizednuj;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PreLoginConfig {

    @C09CT("login_signup_panel_size")
    public final Integer loginSignupPanelSize;

    @C09CT("login_signup_panel_skip_style")
    public final Integer loginSignupPanelSkipStyle;

    @C09CT("login_signup_panel_type")
    public final Integer loginSignupPanelType;

    public PreLoginConfig() {
        this(0, 0, 0);
    }

    public PreLoginConfig(Integer num, Integer num2, Integer num3) {
        this.loginSignupPanelSkipStyle = num;
        this.loginSignupPanelType = num2;
        this.loginSignupPanelSize = num3;
    }
}
