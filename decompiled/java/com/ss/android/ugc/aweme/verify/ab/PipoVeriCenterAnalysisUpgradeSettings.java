package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoVeriCenterAnalysisUpgradeSettings {
    public static final PipoVeriCenterAnalysisUpgradeModel LIZ = new PipoVeriCenterAnalysisUpgradeModel(null, null, null, null, null);

    public static final class PipoVeriCenterAnalysisUpgradeModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("enable_background_snapshot")
        public final Boolean enableBackgroundSnapshot;

        @C09CT("enable_forgot_pin_return_listen")
        public final Boolean enableForgotPinReturnListen;

        @C09CT("enable_input_quality_fields")
        public final Boolean enableInputQualityFields;

        @C09CT("enable_network_monitor")
        public final Boolean enableNetworkMonitor;

        public PipoVeriCenterAnalysisUpgradeModel() {
            this(null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PipoVeriCenterAnalysisUpgradeModel)) {
                return false;
            }
            PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModel = (PipoVeriCenterAnalysisUpgradeModel) obj;
            return Intrinsics.LJFF(this.enable, pipoVeriCenterAnalysisUpgradeModel.enable) && Intrinsics.LJFF(this.enableNetworkMonitor, pipoVeriCenterAnalysisUpgradeModel.enableNetworkMonitor) && Intrinsics.LJFF(this.enableBackgroundSnapshot, pipoVeriCenterAnalysisUpgradeModel.enableBackgroundSnapshot) && Intrinsics.LJFF(this.enableInputQualityFields, pipoVeriCenterAnalysisUpgradeModel.enableInputQualityFields) && Intrinsics.LJFF(this.enableForgotPinReturnListen, pipoVeriCenterAnalysisUpgradeModel.enableForgotPinReturnListen);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.enableNetworkMonitor;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.enableBackgroundSnapshot;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.enableInputQualityFields;
            int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.enableForgotPinReturnListen;
            return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PipoVeriCenterAnalysisUpgradeModel(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", enableNetworkMonitor=");
            sbLIZ.append(this.enableNetworkMonitor);
            sbLIZ.append(", enableBackgroundSnapshot=");
            sbLIZ.append(this.enableBackgroundSnapshot);
            sbLIZ.append(", enableInputQualityFields=");
            sbLIZ.append(this.enableInputQualityFields);
            sbLIZ.append(", enableForgotPinReturnListen=");
            sbLIZ.append(this.enableForgotPinReturnListen);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PipoVeriCenterAnalysisUpgradeModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
            this.enable = bool;
            this.enableNetworkMonitor = bool2;
            this.enableBackgroundSnapshot = bool3;
            this.enableInputQualityFields = bool4;
            this.enableForgotPinReturnListen = bool5;
        }
    }
}
