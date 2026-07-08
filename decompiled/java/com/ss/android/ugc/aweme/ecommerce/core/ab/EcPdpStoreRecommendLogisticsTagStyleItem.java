package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPdpStoreRecommendLogisticsTagStyleItem {

    @C09CT("background_color")
    public final EcPdpStoreRecommendColorPair backgroundColor;

    @C09CT("font_size")
    public final Integer fontSize;

    @C09CT("font_weight")
    public final Integer fontWeight;

    @C09CT("icon_size")
    public final Float iconSize;

    @C09CT("show_icon")
    public final Boolean showIcon;

    @C09CT("text_color")
    public final EcPdpStoreRecommendColorPair textColor;

    public EcPdpStoreRecommendLogisticsTagStyleItem() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcPdpStoreRecommendLogisticsTagStyleItem)) {
            return false;
        }
        EcPdpStoreRecommendLogisticsTagStyleItem ecPdpStoreRecommendLogisticsTagStyleItem = (EcPdpStoreRecommendLogisticsTagStyleItem) obj;
        return Intrinsics.LJFF(this.backgroundColor, ecPdpStoreRecommendLogisticsTagStyleItem.backgroundColor) && Intrinsics.LJFF(this.textColor, ecPdpStoreRecommendLogisticsTagStyleItem.textColor) && Intrinsics.LJFF(this.fontSize, ecPdpStoreRecommendLogisticsTagStyleItem.fontSize) && Intrinsics.LJFF(this.fontWeight, ecPdpStoreRecommendLogisticsTagStyleItem.fontWeight) && Intrinsics.LJFF(this.showIcon, ecPdpStoreRecommendLogisticsTagStyleItem.showIcon) && Intrinsics.LJFF(this.iconSize, ecPdpStoreRecommendLogisticsTagStyleItem.iconSize);
    }

    public final int hashCode() {
        EcPdpStoreRecommendColorPair ecPdpStoreRecommendColorPair = this.backgroundColor;
        int iHashCode = (ecPdpStoreRecommendColorPair == null ? 0 : ecPdpStoreRecommendColorPair.hashCode()) * 31;
        EcPdpStoreRecommendColorPair ecPdpStoreRecommendColorPair2 = this.textColor;
        int iHashCode2 = (iHashCode + (ecPdpStoreRecommendColorPair2 == null ? 0 : ecPdpStoreRecommendColorPair2.hashCode())) * 31;
        Integer num = this.fontSize;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fontWeight;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.showIcon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.iconSize;
        return iHashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcPdpStoreRecommendLogisticsTagStyleItem(backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", fontSize=");
        sbLIZ.append(this.fontSize);
        sbLIZ.append(", fontWeight=");
        sbLIZ.append(this.fontWeight);
        sbLIZ.append(", showIcon=");
        sbLIZ.append(this.showIcon);
        sbLIZ.append(", iconSize=");
        sbLIZ.append(this.iconSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcPdpStoreRecommendLogisticsTagStyleItem(EcPdpStoreRecommendColorPair ecPdpStoreRecommendColorPair, EcPdpStoreRecommendColorPair ecPdpStoreRecommendColorPair2, Integer num, Integer num2, Boolean bool, Float f) {
        this.backgroundColor = ecPdpStoreRecommendColorPair;
        this.textColor = ecPdpStoreRecommendColorPair2;
        this.fontSize = num;
        this.fontWeight = num2;
        this.showIcon = bool;
        this.iconSize = f;
    }
}
