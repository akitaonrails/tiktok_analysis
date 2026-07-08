package com.ss.android.ugc.aweme.longpress;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class LongPressPanelMoveTipConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("link_text")
    public final String linkText;

    @C09CT("move_tips_display_count")
    public final Integer moveTipDisplayCount;

    @C09CT("tip_text")
    public final String tipText;

    public LongPressPanelMoveTipConfig() {
        this(null, null, null, null);
    }

    public LongPressPanelMoveTipConfig(Integer num, Boolean bool, String str, String str2) {
        this.moveTipDisplayCount = num;
        this.enable = bool;
        this.tipText = str;
        this.linkText = str2;
    }
}
