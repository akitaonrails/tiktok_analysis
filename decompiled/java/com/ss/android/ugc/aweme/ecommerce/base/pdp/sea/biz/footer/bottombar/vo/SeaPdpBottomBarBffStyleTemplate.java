package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBarBffStyleTemplate {

    @C09CT("bg_color")
    public final CommonColor bgColor;

    @C09CT("desc_color")
    public final CommonColor descColor;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("margin")
    public final List<Float> margin;

    @C09CT("sub_desc_color")
    public final CommonColor subDescColor;

    public SeaPdpBottomBarBffStyleTemplate() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffStyleTemplate)) {
            return false;
        }
        SeaPdpBottomBarBffStyleTemplate seaPdpBottomBarBffStyleTemplate = (SeaPdpBottomBarBffStyleTemplate) obj;
        return Intrinsics.LJFF(this.bgColor, seaPdpBottomBarBffStyleTemplate.bgColor) && Intrinsics.LJFF(this.margin, seaPdpBottomBarBffStyleTemplate.margin) && Intrinsics.LJFF(this.enable, seaPdpBottomBarBffStyleTemplate.enable) && Intrinsics.LJFF(this.descColor, seaPdpBottomBarBffStyleTemplate.descColor) && Intrinsics.LJFF(this.subDescColor, seaPdpBottomBarBffStyleTemplate.subDescColor);
    }

    public final int hashCode() {
        CommonColor commonColor = this.bgColor;
        int iHashCode = (commonColor == null ? 0 : commonColor.hashCode()) * 31;
        List<Float> list = this.margin;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CommonColor commonColor2 = this.descColor;
        int iHashCode4 = (iHashCode3 + (commonColor2 == null ? 0 : commonColor2.hashCode())) * 31;
        CommonColor commonColor3 = this.subDescColor;
        return iHashCode4 + (commonColor3 != null ? commonColor3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffStyleTemplate(bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", margin=");
        sbLIZ.append(this.margin);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", descColor=");
        sbLIZ.append(this.descColor);
        sbLIZ.append(", subDescColor=");
        sbLIZ.append(this.subDescColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffStyleTemplate(CommonColor commonColor, List<Float> list, Boolean bool, CommonColor commonColor2, CommonColor commonColor3) {
        this.bgColor = commonColor;
        this.margin = list;
        this.enable = bool;
        this.descColor = commonColor2;
        this.subDescColor = commonColor3;
    }
}
