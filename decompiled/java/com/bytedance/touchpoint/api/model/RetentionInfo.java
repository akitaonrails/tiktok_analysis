package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RetentionInfo {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("click_action")
    public final String clickAction;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("title")
    public final String title;

    public RetentionInfo(String str, String str2, String str3, String str4) {
        this.jumpLink = str;
        this.clickAction = str2;
        this.title = str3;
        this.buttonText = str4;
    }
}
