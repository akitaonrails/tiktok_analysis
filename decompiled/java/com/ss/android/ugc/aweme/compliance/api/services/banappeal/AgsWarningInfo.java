package com.ss.android.ugc.aweme.compliance.api.services.banappeal;

import X.C09CT;
import X.C1250840ieg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AgsWarningInfo implements Serializable {
    public static final int $stable = 0;
    public static final C1250840ieg Companion = new Object() { // from class: X.0ieg
    };

    @C09CT("button_close_text")
    public final String buttonCloseText;

    @C09CT("button_detail_text")
    public final String buttonDetailText;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT("warning_desc")
    public final String warningDesc;

    @C09CT("warning_level")
    public final int warningLevel;

    @C09CT("warning_title")
    public final String warningTitle;

    public AgsWarningInfo(String str, String str2, String str3, String str4, String str5, int i) {
        this.buttonCloseText = str;
        this.buttonDetailText = str2;
        this.warningDesc = str3;
        this.warningTitle = str4;
        this.detailUrl = str5;
        this.warningLevel = i;
    }
}
