package com.ss.android.ugc.aweme.stemfeed.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class WelcomePopup {

    @C09CT("button")
    public String button;

    @C09CT("desc")
    public String desc;

    @C09CT("title")
    public String title;

    public WelcomePopup() {
        this("", "", "");
    }

    public WelcomePopup(String str, String str2, String str3) {
        this.title = str;
        this.desc = str2;
        this.button = str3;
    }
}
