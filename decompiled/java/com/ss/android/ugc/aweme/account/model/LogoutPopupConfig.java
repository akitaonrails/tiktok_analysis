package com.ss.android.ugc.aweme.account.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class LogoutPopupConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("description")
    public final String description;

    @C09CT("show_learn_more")
    public final boolean shouldShowLearnMore;

    @C09CT("title")
    public final String title;

    public LogoutPopupConfig() {
        this("", "", false);
    }

    public LogoutPopupConfig(String str, String str2, boolean z) {
        this.title = str;
        this.description = str2;
        this.shouldShowLearnMore = z;
    }
}
