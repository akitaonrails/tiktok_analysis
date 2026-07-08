package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ProgressBar {

    @C09CT("bar_bg_color")
    public String barBgColor;

    @C09CT("bar_color")
    public String barColor;

    @C09CT("bubble_bg_color")
    public String bubbleBgColor;

    @C09CT("bubble_text")
    public Content bubbleText;

    @C09CT("percent")
    public Float percent;

    public ProgressBar(String str, String str2, String str3, Content content, Float f) {
        this.barBgColor = str;
        this.barColor = str2;
        this.bubbleBgColor = str3;
        this.bubbleText = content;
        this.percent = f;
    }
}
