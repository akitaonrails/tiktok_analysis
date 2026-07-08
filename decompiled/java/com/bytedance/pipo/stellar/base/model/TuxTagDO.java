package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TuxTagDO extends BaseWidgetDO {

    @C09CT("background_color")
    public final ColorDO backgroundColor;

    @C09CT("corner")
    public final CornerDO corner;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("padding")
    public final MarginDO padding;

    @C09CT("text")
    public final TextDO text;

    public TuxTagDO() {
        this(null, null, null, null, null);
    }

    public final TuxTagDO copy(TextDO textDO, CornerDO cornerDO, ImageDO imageDO, ColorDO colorDO, MarginDO marginDO) {
        return new TuxTagDO(textDO, cornerDO, imageDO, colorDO, marginDO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TuxTagDO)) {
            return false;
        }
        TuxTagDO tuxTagDO = (TuxTagDO) obj;
        return Intrinsics.LJFF(this.text, tuxTagDO.text) && Intrinsics.LJFF(this.corner, tuxTagDO.corner) && Intrinsics.LJFF(this.icon, tuxTagDO.icon) && Intrinsics.LJFF(this.backgroundColor, tuxTagDO.backgroundColor) && Intrinsics.LJFF(this.padding, tuxTagDO.padding);
    }

    public int hashCode() {
        TextDO textDO = this.text;
        int iHashCode = (textDO == null ? 0 : textDO.hashCode()) * 31;
        CornerDO cornerDO = this.corner;
        int iHashCode2 = (iHashCode + (cornerDO == null ? 0 : cornerDO.hashCode())) * 31;
        ImageDO imageDO = this.icon;
        int iHashCode3 = (iHashCode2 + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        ColorDO colorDO = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        MarginDO marginDO = this.padding;
        return iHashCode4 + (marginDO != null ? marginDO.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxTagDO(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", corner=");
        sbLIZ.append(this.corner);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ColorDO getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerDO getCorner() {
        return this.corner;
    }

    public final ImageDO getIcon() {
        return this.icon;
    }

    public final MarginDO getPadding() {
        return this.padding;
    }

    public final TextDO getText() {
        return this.text;
    }

    public TuxTagDO(TextDO textDO, CornerDO cornerDO, ImageDO imageDO, ColorDO colorDO, MarginDO marginDO) {
        super(null, null, 1, null, null);
        this.text = textDO;
        this.corner = cornerDO;
        this.icon = imageDO;
        this.backgroundColor = colorDO;
        this.padding = marginDO;
    }
}
