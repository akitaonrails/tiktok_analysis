package com.ss.android.ugc.aweme.share.settings;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImSectionConfig {

    @C09CT("calculate_im_estimated_height")
    public final Boolean calculateImEstimatedHeight;

    @C09CT("calculate_im_height_threshold")
    public final Integer calculateImHeightThreshold;

    @C09CT("default_max_display_scale")
    public final Float defaultMaxDisplayScale;

    @C09CT("use_vertical_im")
    public final Boolean useVerticalIms;

    @C09CT("vertical_im_row_count")
    public final Integer verticalImRowCount;

    public ImSectionConfig() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImSectionConfig)) {
            return false;
        }
        ImSectionConfig imSectionConfig = (ImSectionConfig) obj;
        return Intrinsics.LJFF(this.useVerticalIms, imSectionConfig.useVerticalIms) && Intrinsics.LJFF(this.verticalImRowCount, imSectionConfig.verticalImRowCount) && Intrinsics.LJFF(this.calculateImEstimatedHeight, imSectionConfig.calculateImEstimatedHeight) && Intrinsics.LJFF(this.calculateImHeightThreshold, imSectionConfig.calculateImHeightThreshold) && Intrinsics.LJFF(this.defaultMaxDisplayScale, imSectionConfig.defaultMaxDisplayScale);
    }

    public final int hashCode() {
        Boolean bool = this.useVerticalIms;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.verticalImRowCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.calculateImEstimatedHeight;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.calculateImHeightThreshold;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.defaultMaxDisplayScale;
        return iHashCode4 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImSectionConfig(useVerticalIms=");
        sbLIZ.append(this.useVerticalIms);
        sbLIZ.append(", verticalImRowCount=");
        sbLIZ.append(this.verticalImRowCount);
        sbLIZ.append(", calculateImEstimatedHeight=");
        sbLIZ.append(this.calculateImEstimatedHeight);
        sbLIZ.append(", calculateImHeightThreshold=");
        sbLIZ.append(this.calculateImHeightThreshold);
        sbLIZ.append(", defaultMaxDisplayScale=");
        sbLIZ.append(this.defaultMaxDisplayScale);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImSectionConfig(Boolean bool, Integer num, Boolean bool2, Integer num2, Float f) {
        this.useVerticalIms = bool;
        this.verticalImRowCount = num;
        this.calculateImEstimatedHeight = bool2;
        this.calculateImHeightThreshold = num2;
        this.defaultMaxDisplayScale = f;
    }
}
