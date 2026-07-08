package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareWarnInfo implements Serializable {
    public boolean hasShown;

    @C09CT("learn_more_text")
    public final String learnMoreText;

    @C09CT("learn_more_url")
    public final String learnMoreUrl;

    @C09CT("sub_title_1")
    public final String subTitle1;

    @C09CT("sub_title_2")
    public final String subTitle2;

    @C09CT("title")
    public final String title;

    public ShareWarnInfo() {
        this("", "", "", "", "", false);
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public ShareWarnInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.title = str;
        this.subTitle1 = str2;
        this.subTitle2 = str3;
        this.learnMoreText = str4;
        this.learnMoreUrl = str5;
        this.hasShown = z;
    }
}
