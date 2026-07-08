package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AwemeLinkLabel implements Serializable {

    @C09CT("color")
    public final String color;

    @C09CT("color_icon")
    public final String colorIcon;

    @C09CT("color_text")
    public final String colorText;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("show_seconds")
    public final int showSeconds;

    @C09CT("style_type")
    public final int styleType;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final int type;

    @C09CT("white_color_icon")
    public final String whiteColorIcon;

    @C09CT("white_color_text")
    public final String whiteColorText;

    public AwemeLinkLabel(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, UrlModel urlModel) {
        this.color = str;
        this.text = str2;
        this.colorText = str3;
        this.whiteColorText = str4;
        this.type = i;
        this.colorIcon = str5;
        this.whiteColorIcon = str6;
        this.styleType = i2;
        this.showSeconds = i3;
        this.icon = urlModel;
    }
}
