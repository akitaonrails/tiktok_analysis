package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageDO extends BaseWidgetDO {

    @C09CT("background")
    public final IconBackgroundDO background;

    @C09CT("badge")
    public final StellarBadgeDO badge;

    @C09CT("icon_color")
    public final ColorDO color;

    @C09CT("dark")
    public final Image dark;

    @C09CT("height")
    public final String height;

    @C09CT("icon_token")
    public final String iconToken;

    @C09CT("light")
    public final Image light;

    @C09CT("icon_name")
    public final String name;

    @C09CT("retry_count")
    public final Integer retryCount;

    @C09CT("scale_type")
    public final Integer scaleType;

    @C09CT("type")
    public final Integer type;

    @C09CT("width")
    public final String width;

    public ImageDO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final ImageDO copy(Integer num, String str, String str2, String str3, ColorDO colorDO, IconBackgroundDO iconBackgroundDO, Image image, Image image2, Integer num2, String str4, Integer num3, StellarBadgeDO stellarBadgeDO) {
        return new ImageDO(num, str, str2, str3, colorDO, iconBackgroundDO, image, image2, num2, str4, num3, stellarBadgeDO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageDO)) {
            return false;
        }
        ImageDO imageDO = (ImageDO) obj;
        return Intrinsics.LJFF(this.type, imageDO.type) && Intrinsics.LJFF(this.width, imageDO.width) && Intrinsics.LJFF(this.height, imageDO.height) && Intrinsics.LJFF(this.name, imageDO.name) && Intrinsics.LJFF(this.color, imageDO.color) && Intrinsics.LJFF(this.background, imageDO.background) && Intrinsics.LJFF(this.light, imageDO.light) && Intrinsics.LJFF(this.dark, imageDO.dark) && Intrinsics.LJFF(this.scaleType, imageDO.scaleType) && Intrinsics.LJFF(this.iconToken, imageDO.iconToken) && Intrinsics.LJFF(this.retryCount, imageDO.retryCount) && Intrinsics.LJFF(this.badge, imageDO.badge);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.width;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.height;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ColorDO colorDO = this.color;
        int iHashCode5 = (iHashCode4 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        IconBackgroundDO iconBackgroundDO = this.background;
        int iHashCode6 = (iHashCode5 + (iconBackgroundDO == null ? 0 : iconBackgroundDO.hashCode())) * 31;
        Image image = this.light;
        int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.dark;
        int iHashCode8 = (iHashCode7 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num2 = this.scaleType;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.iconToken;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.retryCount;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        StellarBadgeDO stellarBadgeDO = this.badge;
        return iHashCode11 + (stellarBadgeDO != null ? stellarBadgeDO.hashCode() : 0);
    }

    public String toString() {
        return "ImageDO(type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", name=" + this.name + ", color=" + this.color + ", background=" + this.background + ", light=" + this.light + ", dark=" + this.dark + ", scaleType=" + this.scaleType + ", iconToken=" + this.iconToken + ", retryCount=" + this.retryCount + ", badge=" + this.badge + ')';
    }

    public final IconBackgroundDO getBackground() {
        return this.background;
    }

    public final StellarBadgeDO getBadge() {
        return this.badge;
    }

    public final ColorDO getColor() {
        return this.color;
    }

    public final Image getDark() {
        return this.dark;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getIconToken() {
        return this.iconToken;
    }

    public final Image getLight() {
        return this.light;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final Integer getScaleType() {
        return this.scaleType;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getWidth() {
        return this.width;
    }

    public ImageDO(Integer num, String str, String str2, String str3, ColorDO colorDO, IconBackgroundDO iconBackgroundDO, Image image, Image image2, Integer num2, String str4, Integer num3, StellarBadgeDO stellarBadgeDO) {
        super(null, null, 1, null, null);
        this.type = num;
        this.width = str;
        this.height = str2;
        this.name = str3;
        this.color = colorDO;
        this.background = iconBackgroundDO;
        this.light = image;
        this.dark = image2;
        this.scaleType = num2;
        this.iconToken = str4;
        this.retryCount = num3;
        this.badge = stellarBadgeDO;
    }
}
