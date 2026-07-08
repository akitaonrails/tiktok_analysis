package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vo.SeaPdpAction;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRichTextContainerRightData {

    @C09CT("action")
    public final Map<String, SeaPdpAction> action;

    @C09CT("arrow_color")
    public final CommonColor arrowColor;

    @C09CT("custom_icon")
    public final Icon customIcon;

    @C09CT("layout")
    public final Integer layout;

    @C09CT("padding")
    public final List<Float> padding;

    @C09CT("rich_text")
    public final ECRichText richText;

    @C09CT("show_arrow")
    public final Boolean showArrow;

    @C09CT("show_mode")
    public final Integer showMode;

    @C09CT("space")
    public final Integer space;

    public SeaPdpRichTextContainerRightData() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichTextContainerRightData)) {
            return false;
        }
        SeaPdpRichTextContainerRightData seaPdpRichTextContainerRightData = (SeaPdpRichTextContainerRightData) obj;
        return Intrinsics.LJFF(this.padding, seaPdpRichTextContainerRightData.padding) && Intrinsics.LJFF(this.layout, seaPdpRichTextContainerRightData.layout) && Intrinsics.LJFF(this.showArrow, seaPdpRichTextContainerRightData.showArrow) && Intrinsics.LJFF(this.arrowColor, seaPdpRichTextContainerRightData.arrowColor) && Intrinsics.LJFF(this.customIcon, seaPdpRichTextContainerRightData.customIcon) && Intrinsics.LJFF(this.richText, seaPdpRichTextContainerRightData.richText) && Intrinsics.LJFF(this.action, seaPdpRichTextContainerRightData.action) && Intrinsics.LJFF(this.space, seaPdpRichTextContainerRightData.space) && Intrinsics.LJFF(this.showMode, seaPdpRichTextContainerRightData.showMode);
    }

    public final int hashCode() {
        List<Float> list = this.padding;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.layout;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.showArrow;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CommonColor commonColor = this.arrowColor;
        int iHashCode4 = (iHashCode3 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        Icon icon = this.customIcon;
        int iHashCode5 = (iHashCode4 + (icon == null ? 0 : icon.hashCode())) * 31;
        ECRichText eCRichText = this.richText;
        int iHashCode6 = (iHashCode5 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Map<String, SeaPdpAction> map = this.action;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num2 = this.space;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.showMode;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpRichTextContainerRightData(padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", showArrow=");
        sbLIZ.append(this.showArrow);
        sbLIZ.append(", arrowColor=");
        sbLIZ.append(this.arrowColor);
        sbLIZ.append(", customIcon=");
        sbLIZ.append(this.customIcon);
        sbLIZ.append(", richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", space=");
        sbLIZ.append(this.space);
        sbLIZ.append(", showMode=");
        sbLIZ.append(this.showMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpRichTextContainerRightData(List<Float> list, Integer num, Boolean bool, CommonColor commonColor, Icon icon, ECRichText eCRichText, Map<String, SeaPdpAction> map, Integer num2, Integer num3) {
        this.padding = list;
        this.layout = num;
        this.showArrow = bool;
        this.arrowColor = commonColor;
        this.customIcon = icon;
        this.richText = eCRichText;
        this.action = map;
        this.space = num2;
        this.showMode = num3;
    }
}
