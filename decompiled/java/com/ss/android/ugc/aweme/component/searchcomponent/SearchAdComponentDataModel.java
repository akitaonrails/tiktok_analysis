package com.ss.android.ugc.aweme.component.searchcomponent;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdComponentDataModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("anchor_style")
    public final String anchor_style;

    @C09CT("bottom_label_text")
    public final String bottomLabelText;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("color_show_time")
    public final float colorChangeTime;

    @C09CT("corner_radius")
    public final int cornerRadius;

    @C09CT("bg_color")
    public final String ctaBgColor;

    @C09CT("have_arrow")
    public final boolean haveArrow;

    @C09CT("left_padding")
    public final int textMarginStart;

    public SearchAdComponentDataModel() {
        this("", "", 0, false, 0.0f, 0, CardStruct.IStatusCode.DEFAULT, "");
    }

    public final String getAnchor_style() {
        return this.anchor_style;
    }

    public final String getBottomLabelText() {
        return this.bottomLabelText;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final float getColorChangeTime() {
        return this.colorChangeTime;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getCtaBgColor() {
        return this.ctaBgColor;
    }

    public final boolean getHaveArrow() {
        return this.haveArrow;
    }

    public final int getTextMarginStart() {
        return this.textMarginStart;
    }

    public SearchAdComponentDataModel(String str, String str2, int i, boolean z, float f, int i2, String str3, String str4) {
        this.buttonText = str;
        this.ctaBgColor = str2;
        this.textMarginStart = i;
        this.haveArrow = z;
        this.colorChangeTime = f;
        this.cornerRadius = i2;
        this.anchor_style = str3;
        this.bottomLabelText = str4;
    }
}
