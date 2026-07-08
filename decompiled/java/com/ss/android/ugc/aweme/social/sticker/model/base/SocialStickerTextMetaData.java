package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class SocialStickerTextMetaData implements Serializable {
    public static final int $stable = 8;

    @C09CT("font")
    public String fontResId;

    @C09CT("business_info")
    public BusinessInfo infoData;

    @C09CT("interaction_type")
    public Integer interActionType;

    @C09CT("key")
    public final String key;

    @C09CT("style")
    public SocialStickerColorStyle style;

    @C09CT("text")
    public final String text;

    public SocialStickerTextMetaData() {
        this("", "", null, null, null, null);
    }

    public final String getFontResId() {
        return this.fontResId;
    }

    public final BusinessInfo getInfoData() {
        return this.infoData;
    }

    public final Integer getInterActionType() {
        return this.interActionType;
    }

    public final String getKey() {
        return this.key;
    }

    public final SocialStickerColorStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final void setFontResId(String str) {
        this.fontResId = str;
    }

    public final void setInfoData(BusinessInfo businessInfo) {
        this.infoData = businessInfo;
    }

    public final void setInterActionType(Integer num) {
        this.interActionType = num;
    }

    public final void setStyle(SocialStickerColorStyle socialStickerColorStyle) {
        this.style = socialStickerColorStyle;
    }

    public SocialStickerTextMetaData(String str, String str2, String str3, SocialStickerColorStyle socialStickerColorStyle, BusinessInfo businessInfo, Integer num) {
        this.key = str;
        this.text = str2;
        this.fontResId = str3;
        this.style = socialStickerColorStyle;
        this.infoData = businessInfo;
        this.interActionType = num;
    }
}
