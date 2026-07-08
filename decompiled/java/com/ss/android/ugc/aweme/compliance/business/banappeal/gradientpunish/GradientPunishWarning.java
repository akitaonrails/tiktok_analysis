package com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GradientPunishWarning {
    public static final int $stable = 0;

    @C09CT("toast_text")
    public final String bubbleText;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT("popup_confirm")
    public final String dialogButton;

    @C09CT("popup_text")
    public final String dialogMessage;

    @C09CT("warn_type")
    public final int warnType;

    public GradientPunishWarning() {
        this("", "", "", 0, "");
    }

    public GradientPunishWarning(String str, String str2, String str3, int i, String str4) {
        this.dialogMessage = str;
        this.dialogButton = str2;
        this.bubbleText = str3;
        this.warnType = i;
        this.detailUrl = str4;
    }
}
