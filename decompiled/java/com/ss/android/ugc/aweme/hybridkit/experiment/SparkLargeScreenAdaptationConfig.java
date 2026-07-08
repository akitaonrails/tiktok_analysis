package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkLargeScreenAdaptationConfig {

    @C09CT("enable_activity_auto_adaptation")
    public final boolean enableActivityAutoAdaptation;

    @C09CT("enable_global_props")
    public final boolean enableGlobalProps;

    @C09CT("enable_popup_auto_adaptation")
    public final boolean enablePopupAutoAdaptation;

    public SparkLargeScreenAdaptationConfig() {
        this(true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparkLargeScreenAdaptationConfig)) {
            return false;
        }
        SparkLargeScreenAdaptationConfig sparkLargeScreenAdaptationConfig = (SparkLargeScreenAdaptationConfig) obj;
        return this.enableGlobalProps == sparkLargeScreenAdaptationConfig.enableGlobalProps && this.enableActivityAutoAdaptation == sparkLargeScreenAdaptationConfig.enableActivityAutoAdaptation && this.enablePopupAutoAdaptation == sparkLargeScreenAdaptationConfig.enablePopupAutoAdaptation;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enableGlobalProps) * 31) + C786410Ut5.Z2(this.enableActivityAutoAdaptation)) * 31) + C786410Ut5.Z2(this.enablePopupAutoAdaptation);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkLargeScreenAdaptationConfig(enableGlobalProps=");
        sbLIZ.append(this.enableGlobalProps);
        sbLIZ.append(", enableActivityAutoAdaptation=");
        sbLIZ.append(this.enableActivityAutoAdaptation);
        sbLIZ.append(", enablePopupAutoAdaptation=");
        sbLIZ.append(this.enablePopupAutoAdaptation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SparkLargeScreenAdaptationConfig(boolean z, boolean z2, boolean z3) {
        this.enableGlobalProps = z;
        this.enableActivityAutoAdaptation = z2;
        this.enablePopupAutoAdaptation = z3;
    }
}
