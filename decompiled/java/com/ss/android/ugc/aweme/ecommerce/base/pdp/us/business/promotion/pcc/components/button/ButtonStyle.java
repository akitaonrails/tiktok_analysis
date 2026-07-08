package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ButtonStyle {

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("corner_radius")
    public final Integer cornerRadius;

    @C09CT("height")
    public final Integer height;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("padding")
    public final Padding padding;

    @C09CT("width")
    public final Integer width;

    public ButtonStyle() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonStyle)) {
            return false;
        }
        ButtonStyle buttonStyle = (ButtonStyle) obj;
        return Intrinsics.LJFF(this.buttonType, buttonStyle.buttonType) && Intrinsics.LJFF(this.cornerRadius, buttonStyle.cornerRadius) && Intrinsics.LJFF(this.backgroundColor, buttonStyle.backgroundColor) && Intrinsics.LJFF(this.icon, buttonStyle.icon) && Intrinsics.LJFF(this.width, buttonStyle.width) && Intrinsics.LJFF(this.height, buttonStyle.height) && Intrinsics.LJFF(this.padding, buttonStyle.padding);
    }

    public final int hashCode() {
        Integer num = this.buttonType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.cornerRadius;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num3 = this.width;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Padding padding = this.padding;
        return iHashCode6 + (padding != null ? padding.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonStyle(buttonType=");
        sbLIZ.append(this.buttonType);
        sbLIZ.append(", cornerRadius=");
        sbLIZ.append(this.cornerRadius);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ButtonStyle(Integer num, Integer num2, CommonColor commonColor, Icon icon, Integer num3, Integer num4, Padding padding) {
        this.buttonType = num;
        this.cornerRadius = num2;
        this.backgroundColor = commonColor;
        this.icon = icon;
        this.width = num3;
        this.height = num4;
        this.padding = padding;
    }
}
