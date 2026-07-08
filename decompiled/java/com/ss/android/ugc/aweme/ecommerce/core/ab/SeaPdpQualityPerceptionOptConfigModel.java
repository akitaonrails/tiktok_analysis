package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpQualityPerceptionOptConfigModel {

    @C09CT("font_color_opt")
    public final Boolean fontColorOpt;

    @C09CT("logistics_module_top_divider_expand")
    public final Boolean logisticsModuleTopDividerExpand;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpQualityPerceptionOptConfigModel)) {
            return false;
        }
        SeaPdpQualityPerceptionOptConfigModel seaPdpQualityPerceptionOptConfigModel = (SeaPdpQualityPerceptionOptConfigModel) obj;
        return Intrinsics.LJFF(this.fontColorOpt, seaPdpQualityPerceptionOptConfigModel.fontColorOpt) && Intrinsics.LJFF(this.logisticsModuleTopDividerExpand, seaPdpQualityPerceptionOptConfigModel.logisticsModuleTopDividerExpand);
    }

    public final int hashCode() {
        Boolean bool = this.fontColorOpt;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.logisticsModuleTopDividerExpand;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpQualityPerceptionOptConfigModel(fontColorOpt=");
        sbLIZ.append(this.fontColorOpt);
        sbLIZ.append(", logisticsModuleTopDividerExpand=");
        sbLIZ.append(this.logisticsModuleTopDividerExpand);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpQualityPerceptionOptConfigModel() {
        this(Boolean.FALSE, Boolean.FALSE);
    }

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.fontColorOpt, Boolean.TRUE);
    }

    public SeaPdpQualityPerceptionOptConfigModel(Boolean bool, Boolean bool2) {
        this.fontColorOpt = bool;
        this.logisticsModuleTopDividerExpand = bool2;
    }
}
