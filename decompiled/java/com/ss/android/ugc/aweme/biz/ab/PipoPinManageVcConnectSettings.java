package com.ss.android.ugc.aweme.biz.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PipoPinManageVcConnectSettings {
    public static final PipoPinManageVcConnectModel LIZ = new PipoPinManageVcConnectModel(null, null, null, null);

    public static final class PipoPinManageVcConnectModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("enable_cancel_report")
        public final Boolean enableCancelReport;

        @C09CT("enable_flow_duration")
        public final Boolean enableFlowDuration;

        @C09CT("enable_flow_end_notification")
        public final Boolean enableFlowEndNotification;

        public PipoPinManageVcConnectModel() {
            this(null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PipoPinManageVcConnectModel)) {
                return false;
            }
            PipoPinManageVcConnectModel pipoPinManageVcConnectModel = (PipoPinManageVcConnectModel) obj;
            return Intrinsics.LJFF(this.enable, pipoPinManageVcConnectModel.enable) && Intrinsics.LJFF(this.enableCancelReport, pipoPinManageVcConnectModel.enableCancelReport) && Intrinsics.LJFF(this.enableFlowDuration, pipoPinManageVcConnectModel.enableFlowDuration) && Intrinsics.LJFF(this.enableFlowEndNotification, pipoPinManageVcConnectModel.enableFlowEndNotification);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.enableCancelReport;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.enableFlowDuration;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.enableFlowEndNotification;
            return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PipoPinManageVcConnectModel(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", enableCancelReport=");
            sbLIZ.append(this.enableCancelReport);
            sbLIZ.append(", enableFlowDuration=");
            sbLIZ.append(this.enableFlowDuration);
            sbLIZ.append(", enableFlowEndNotification=");
            sbLIZ.append(this.enableFlowEndNotification);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PipoPinManageVcConnectModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.enable = bool;
            this.enableCancelReport = bool2;
            this.enableFlowDuration = bool3;
            this.enableFlowEndNotification = bool4;
        }
    }
}
