package com.ss.android.ugc.aweme.account.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PushChallengeInfoMsg {
    public static final int $stable = 8;

    @C09CT("extra_str")
    public String extra;

    @C09CT("text")
    public String text;

    @C09CT("title")
    public String title;

    @C09CT("open_url")
    public String url;

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public PushChallengeInfoMsg(String str, String str2, String str3, String str4) {
        this.url = str;
        this.title = str2;
        this.text = str3;
        this.extra = str4;
    }
}
