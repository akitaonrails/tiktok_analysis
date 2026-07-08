package com.ss.android.ugc.aweme.social.sticker.enteredit.streak;

import X.C09CT;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerColorStyle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class ColorMetaData implements Serializable {
    public static final int $stable = 8;

    @C09CT("bg_color")
    public final String backgroundColor;

    @C09CT("bubble_color")
    public final String bubbleColor;

    @C09CT("info_color")
    public final SocialStickerColorStyle infoColor;

    @C09CT("info_font_effect_id")
    public String infoFontEffectId;

    @C09CT("name_color")
    public final String nameColor;

    @C09CT("shadow_color_style1")
    public final String shadowColorStyle1;

    @C09CT("shadow_color_style2")
    public final String shadowColorStyle2;

    @C09CT("title_color")
    public final String titleColor;

    public ColorMetaData() {
        this("#FFBA9407", "#FF000000", "#FFF1EDDE", "#FFF7F0D4", "#99F7F0D4", "#99DCCF9D", new SocialStickerColorStyle("#FFFFD338", null, null, null, -1), null);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBubbleColor() {
        return this.bubbleColor;
    }

    public final SocialStickerColorStyle getInfoColor() {
        return this.infoColor;
    }

    public final String getInfoFontEffectId() {
        return this.infoFontEffectId;
    }

    public final String getNameColor() {
        return this.nameColor;
    }

    public final String getShadowColorStyle1() {
        return this.shadowColorStyle1;
    }

    public final String getShadowColorStyle2() {
        return this.shadowColorStyle2;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final void setInfoFontEffectId(String str) {
        this.infoFontEffectId = str;
    }

    public ColorMetaData(String str, String str2, String str3, String str4, String str5, String str6, SocialStickerColorStyle socialStickerColorStyle, String str7) {
        this.titleColor = str;
        this.nameColor = str2;
        this.bubbleColor = str3;
        this.backgroundColor = str4;
        this.shadowColorStyle1 = str5;
        this.shadowColorStyle2 = str6;
        this.infoColor = socialStickerColorStyle;
        this.infoFontEffectId = str7;
    }
}
