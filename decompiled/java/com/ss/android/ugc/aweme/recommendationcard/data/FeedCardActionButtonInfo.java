package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedCardActionButtonInfo {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("color")
    public final String color;

    @C09CT("need_show")
    public final Boolean needShow;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    public FeedCardActionButtonInfo(Boolean bool, String str, String str2, String str3, String str4) {
        this.needShow = bool;
        this.text = str;
        this.bgColor = str2;
        this.color = str3;
        this.schema = str4;
    }
}
