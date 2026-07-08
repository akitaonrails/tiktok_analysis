package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class AwemeTextLabelModel implements Serializable {

    @C09CT("color")
    public String bgColor;

    @C09CT("by_source")
    public String bySource;

    @C09CT("by_text")
    public String byText;

    @C09CT("by_uid")
    public long byUid;

    @C09CT("compliance_color")
    public int complianceColor;

    @C09CT("compliance_position")
    public int compliancePosition;

    @C09CT("corner_radius")
    public int corner_radius;

    @C09CT("enable_show")
    public boolean enableShow;

    @C09CT("compliance_has_icon")
    public boolean hasIcon;

    @C09CT("compliance_icon_type")
    public int iconType;

    @C09CT("compliance_bg_color")
    public int labelBgColor;

    @C09CT("text")
    public String labelName;

    @C09CT("compliance_text_color")
    public int labelTextColor;

    @C09CT("type")
    public int labelType;

    @C09CT("show_seconds")
    public float showSeconds;

    @C09CT("label_style_type")
    public int styleType;

    @C09CT("color_text")
    public String textColor;

    @C09CT("white_color")
    public String whiteBgColor;

    @C09CT("white_color_text")
    public String whiteTextColor;

    @C09CT("height")
    public int height = -1;

    @C09CT("font")
    public int font = -1;

    public boolean isAdHollowText() {
        return !TextUtils.isEmpty(this.textColor) && this.textColor.endsWith("00000000");
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public int getComplianceColor() {
        return this.complianceColor;
    }

    public int getCompliancePosition() {
        return this.compliancePosition;
    }

    public int getCornerRadius() {
        return this.corner_radius;
    }

    public int getFont() {
        return this.font;
    }

    public int getHeight() {
        return this.height;
    }

    public int getIconType() {
        return this.iconType;
    }

    public int getLabelBgColor() {
        return this.labelBgColor;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public int getLabelTextColor() {
        return this.labelTextColor;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public float getShowSeconds() {
        return this.showSeconds;
    }

    public int getStyleType() {
        return this.styleType;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getWhiteBgColor() {
        return this.whiteBgColor;
    }

    public String getWhiteTextColor() {
        return this.whiteTextColor;
    }

    public boolean isEnableShow() {
        return this.enableShow;
    }

    public boolean isHasIcon() {
        return this.hasIcon;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setEnableShow(boolean z) {
        this.enableShow = z;
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setShowSeconds(float f) {
        this.showSeconds = f;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
