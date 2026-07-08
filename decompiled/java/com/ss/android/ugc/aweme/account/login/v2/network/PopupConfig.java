package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PopupConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("description")
    public final String description;

    @C09CT("learn_more_link")
    public final String learnMoreLink;

    @C09CT("placeholder_text")
    public final String placeholderText;

    @C09CT("title")
    public final String title;

    public PopupConfig(String str, String str2, String str3, String str4) {
        this.title = str;
        this.description = str2;
        this.placeholderText = str3;
        this.learnMoreLink = str4;
    }
}
