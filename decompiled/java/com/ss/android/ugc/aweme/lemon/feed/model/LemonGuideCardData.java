package com.ss.android.ugc.aweme.lemon.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes17.dex */
public final class LemonGuideCardData {

    @C09CT("button_text_negative")
    public final String buttonTextNegative;

    @C09CT("button_text_positive")
    public final String buttonTextPositive;

    @C09CT("image")
    public final UrlModel image;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("jump_type")
    public final int jumpType;

    @C09CT("style")
    public final int style;

    @C09CT("user_group")
    public final String userGroup;

    public LemonGuideCardData() {
        this(0, null, null, null, 0, null, null);
    }

    public LemonGuideCardData(int i, UrlModel urlModel, String str, String str2, int i2, String str3, String str4) {
        this.style = i;
        this.image = urlModel;
        this.buttonTextNegative = str;
        this.buttonTextPositive = str2;
        this.jumpType = i2;
        this.jumpLink = str3;
        this.userGroup = str4;
    }
}
