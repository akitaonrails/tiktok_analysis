package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BannerDO extends BaseWidgetDO {

    @C09CT("arrow_icon")
    public final ImageDO arrowIcon;

    @C09CT("image")
    public final ImageDO image;

    @C09CT("sub_title")
    public final TextDO subTitle;

    @C09CT("title")
    public final TextDO title;

    public BannerDO() {
        this(null, null, null, null);
    }

    public final BannerDO copy(ImageDO imageDO, TextDO textDO, TextDO textDO2, ImageDO imageDO2) {
        return new BannerDO(imageDO, textDO, textDO2, imageDO2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDO)) {
            return false;
        }
        BannerDO bannerDO = (BannerDO) obj;
        return Intrinsics.LJFF(this.image, bannerDO.image) && Intrinsics.LJFF(this.title, bannerDO.title) && Intrinsics.LJFF(this.subTitle, bannerDO.subTitle) && Intrinsics.LJFF(this.arrowIcon, bannerDO.arrowIcon);
    }

    public int hashCode() {
        ImageDO imageDO = this.image;
        int iHashCode = (imageDO == null ? 0 : imageDO.hashCode()) * 31;
        TextDO textDO = this.title;
        int iHashCode2 = (iHashCode + (textDO == null ? 0 : textDO.hashCode())) * 31;
        TextDO textDO2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (textDO2 == null ? 0 : textDO2.hashCode())) * 31;
        ImageDO imageDO2 = this.arrowIcon;
        return iHashCode3 + (imageDO2 != null ? imageDO2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerDO(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", arrowIcon=");
        sbLIZ.append(this.arrowIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ImageDO getArrowIcon() {
        return this.arrowIcon;
    }

    public final ImageDO getImage() {
        return this.image;
    }

    public final TextDO getSubTitle() {
        return this.subTitle;
    }

    public final TextDO getTitle() {
        return this.title;
    }

    public BannerDO(ImageDO imageDO, TextDO textDO, TextDO textDO2, ImageDO imageDO2) {
        super(null, null, 1, null, null);
        this.image = imageDO;
        this.title = textDO;
        this.subTitle = textDO2;
        this.arrowIcon = imageDO2;
    }
}
