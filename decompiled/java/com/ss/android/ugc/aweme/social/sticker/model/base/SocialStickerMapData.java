package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class SocialStickerMapData implements Serializable {
    public static final int $stable = 8;

    @C09CT("background")
    public SocialStickerColorStyle background;

    @C09CT("custom_data")
    public List<SocialStickerCustomData> customData;

    @C09CT("image")
    public List<SocialStickerImageList> image;

    @C09CT("info")
    public List<SocialStickerTextMetaData> info;

    public SocialStickerMapData() {
        this(null, null, null, null);
    }

    public final SocialStickerColorStyle getBackground() {
        return this.background;
    }

    public final List<SocialStickerCustomData> getCustomData() {
        return this.customData;
    }

    public final List<SocialStickerImageList> getImage() {
        return this.image;
    }

    public final List<SocialStickerTextMetaData> getInfo() {
        return this.info;
    }

    public final void setBackground(SocialStickerColorStyle socialStickerColorStyle) {
        this.background = socialStickerColorStyle;
    }

    public final void setCustomData(List<SocialStickerCustomData> list) {
        this.customData = list;
    }

    public final void setImage(List<SocialStickerImageList> list) {
        this.image = list;
    }

    public final void setInfo(List<SocialStickerTextMetaData> list) {
        this.info = list;
    }

    public SocialStickerMapData(List<SocialStickerImageList> list, List<SocialStickerTextMetaData> list2, List<SocialStickerCustomData> list3, SocialStickerColorStyle socialStickerColorStyle) {
        this.image = list;
        this.info = list2;
        this.customData = list3;
        this.background = socialStickerColorStyle;
    }
}
