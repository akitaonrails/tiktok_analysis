package com.ss.android.ugc.aweme.minidrama.common.component.service;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaLimitedFreePopUpConfig implements Serializable {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("highlight_color")
    public final String highlightColor;

    @C09CT("highlight_text")
    public final String highlightText;

    @C09CT("pop_up_image_url")
    public final String popUpImageUrl;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public MiniDramaLimitedFreePopUpConfig() {
        this(null, null, null, null, null, null);
    }

    public MiniDramaLimitedFreePopUpConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.subTitle = str2;
        this.buttonText = str3;
        this.highlightText = str4;
        this.highlightColor = str5;
        this.popUpImageUrl = str6;
    }
}
