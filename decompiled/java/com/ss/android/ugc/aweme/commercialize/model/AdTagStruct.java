package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdTagStruct implements Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("icon")
    public final String icon;

    @C09CT("tag_position")
    public final int position;

    @C09CT("tag_text")
    public final String tagText;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("type")
    public final String type;

    public AdTagStruct() {
        this(0, "", "#", "#", "", "");
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getType() {
        return this.type;
    }

    public AdTagStruct(int i, String str, String str2, String str3, String str4, String str5) {
        this.position = i;
        this.tagText = str;
        this.backgroundColor = str2;
        this.textColor = str3;
        this.icon = str4;
        this.type = str5;
    }
}
