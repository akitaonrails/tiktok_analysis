package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareBubble {

    @C09CT("background_color")
    public String bgColor;

    @C09CT("content")
    public Content content;

    @C09CT("show_after")
    public Integer showAfter;

    public ShareBubble() {
        this(null, null, null);
    }

    public ShareBubble(String str, Content content, Integer num) {
        this.bgColor = str;
        this.content = content;
        this.showAfter = num;
    }
}
