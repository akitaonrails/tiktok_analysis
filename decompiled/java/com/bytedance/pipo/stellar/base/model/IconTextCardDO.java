package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class IconTextCardDO extends BaseWidgetDO {

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("icon_position")
    public final String iconPosition;

    @C09CT("icon_space")
    public final String iconSpace;

    @C09CT("link")
    public final LinkData link;

    @C09CT("link_space")
    public final String linkSpace;

    @C09CT("padding")
    public final MarginDO padding;

    @C09CT("sub_title")
    public final TextDO subTitle;

    @C09CT("title")
    public final TextDO title;

    @C09CT("title_space")
    public final String titleSpace;

    public IconTextCardDO() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final IconTextCardDO copy(MarginDO marginDO, ImageDO imageDO, String str, String str2, TextDO textDO, String str3, TextDO textDO2, LinkData linkData, String str4) {
        return new IconTextCardDO(marginDO, imageDO, str, str2, textDO, str3, textDO2, linkData, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconTextCardDO)) {
            return false;
        }
        IconTextCardDO iconTextCardDO = (IconTextCardDO) obj;
        return Intrinsics.LJFF(this.padding, iconTextCardDO.padding) && Intrinsics.LJFF(this.icon, iconTextCardDO.icon) && Intrinsics.LJFF(this.iconPosition, iconTextCardDO.iconPosition) && Intrinsics.LJFF(this.iconSpace, iconTextCardDO.iconSpace) && Intrinsics.LJFF(this.title, iconTextCardDO.title) && Intrinsics.LJFF(this.titleSpace, iconTextCardDO.titleSpace) && Intrinsics.LJFF(this.subTitle, iconTextCardDO.subTitle) && Intrinsics.LJFF(this.link, iconTextCardDO.link) && Intrinsics.LJFF(this.linkSpace, iconTextCardDO.linkSpace);
    }

    public int hashCode() {
        MarginDO marginDO = this.padding;
        int iHashCode = (marginDO == null ? 0 : marginDO.hashCode()) * 31;
        ImageDO imageDO = this.icon;
        int iHashCode2 = (iHashCode + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        String str = this.iconPosition;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconSpace;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextDO textDO = this.title;
        int iHashCode5 = (iHashCode4 + (textDO == null ? 0 : textDO.hashCode())) * 31;
        String str3 = this.titleSpace;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextDO textDO2 = this.subTitle;
        int iHashCode7 = (iHashCode6 + (textDO2 == null ? 0 : textDO2.hashCode())) * 31;
        LinkData linkData = this.link;
        int iHashCode8 = (iHashCode7 + (linkData == null ? 0 : linkData.hashCode())) * 31;
        String str4 = this.linkSpace;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconTextCardDO(padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", iconPosition=");
        sbLIZ.append(this.iconPosition);
        sbLIZ.append(", iconSpace=");
        sbLIZ.append(this.iconSpace);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", titleSpace=");
        sbLIZ.append(this.titleSpace);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", linkSpace=");
        sbLIZ.append(this.linkSpace);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ImageDO getIcon() {
        return this.icon;
    }

    public final String getIconPosition() {
        return this.iconPosition;
    }

    public final String getIconSpace() {
        return this.iconSpace;
    }

    public final LinkData getLink() {
        return this.link;
    }

    public final String getLinkSpace() {
        return this.linkSpace;
    }

    public final MarginDO getPadding() {
        return this.padding;
    }

    public final TextDO getSubTitle() {
        return this.subTitle;
    }

    public final TextDO getTitle() {
        return this.title;
    }

    public final String getTitleSpace() {
        return this.titleSpace;
    }

    public IconTextCardDO(MarginDO marginDO, ImageDO imageDO, String str, String str2, TextDO textDO, String str3, TextDO textDO2, LinkData linkData, String str4) {
        super(null, null, 1, null, null);
        this.padding = marginDO;
        this.icon = imageDO;
        this.iconPosition = str;
        this.iconSpace = str2;
        this.title = textDO;
        this.titleSpace = str3;
        this.subTitle = textDO2;
        this.link = linkData;
        this.linkSpace = str4;
    }
}
