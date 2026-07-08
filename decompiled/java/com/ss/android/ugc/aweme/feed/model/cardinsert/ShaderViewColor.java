package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShaderViewColor implements Serializable {

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("color1")
    public String color1;

    @C09CT("color2")
    public String color2;

    @C09CT("color3")
    public String color3;

    @C09CT("color4")
    public String color4;

    @C09CT("lightness")
    public String lightness;

    public ShaderViewColor() {
        this("", "", "", "", "", "");
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getColor1() {
        return this.color1;
    }

    public final String getColor2() {
        return this.color2;
    }

    public final String getColor3() {
        return this.color3;
    }

    public final String getColor4() {
        return this.color4;
    }

    public final String getLightness() {
        return this.lightness;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setColor1(String str) {
        this.color1 = str;
    }

    public final void setColor2(String str) {
        this.color2 = str;
    }

    public final void setColor3(String str) {
        this.color3 = str;
    }

    public final void setColor4(String str) {
        this.color4 = str;
    }

    public final void setLightness(String str) {
        this.lightness = str;
    }

    public ShaderViewColor(String str, String str2, String str3, String str4, String str5, String str6) {
        this.color1 = str;
        this.color2 = str2;
        this.color3 = str3;
        this.color4 = str4;
        this.bgColor = str5;
        this.lightness = str6;
    }
}
