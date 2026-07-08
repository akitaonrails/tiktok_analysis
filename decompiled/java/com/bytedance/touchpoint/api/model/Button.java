package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Button {

    @C09CT("background_color")
    public String bgColor;

    @C09CT("content")
    public Content content;

    @C09CT("jump_link")
    public String jumpLink;

    public Button(String str, Content content, String str2) {
        this.bgColor = str;
        this.content = content;
        this.jumpLink = str2;
    }
}
