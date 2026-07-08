package com.ss.android.ugc.aweme.ecommerce.network.config;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes24.dex */
public final class EcPbNaPrefetchOptConfig {
    public static final EcPbNativePrefetchOptConfigModel LIZ;

    public static final class EcPbNativePrefetchOptConfigModel {

        @C09CT("cpu_boost_duration_ms")
        public final long cpuBoostDurationMs;

        @C09CT("opt_cpu_boost")
        public final int optCpuBoost;

        @C09CT("opt_defer_dispatch")
        public final int optDeferDispatch;

        @C09CT("opt_handler")
        public final int optHandler;

        @C09CT("opt_normal_template")
        public final int optNormalTemplate;

        @C09CT("opt_pb_template")
        public final int optPbTemplate;

        @C09CT("opt_report")
        public final int optReport;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcPbNativePrefetchOptConfigModel)) {
                return false;
            }
            EcPbNativePrefetchOptConfigModel ecPbNativePrefetchOptConfigModel = (EcPbNativePrefetchOptConfigModel) obj;
            return this.optPbTemplate == ecPbNativePrefetchOptConfigModel.optPbTemplate && this.optNormalTemplate == ecPbNativePrefetchOptConfigModel.optNormalTemplate && this.optReport == ecPbNativePrefetchOptConfigModel.optReport && this.optHandler == ecPbNativePrefetchOptConfigModel.optHandler && this.optDeferDispatch == ecPbNativePrefetchOptConfigModel.optDeferDispatch && this.optCpuBoost == ecPbNativePrefetchOptConfigModel.optCpuBoost && this.cpuBoostDurationMs == ecPbNativePrefetchOptConfigModel.cpuBoostDurationMs;
        }

        public final int hashCode() {
            return (((((((((((this.optPbTemplate * 31) + this.optNormalTemplate) * 31) + this.optReport) * 31) + this.optHandler) * 31) + this.optDeferDispatch) * 31) + this.optCpuBoost) * 31) + C786410Ut5.Y2(this.cpuBoostDurationMs);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcPbNativePrefetchOptConfigModel(optPbTemplate=");
            sbLIZ.append(this.optPbTemplate);
            sbLIZ.append(", optNormalTemplate=");
            sbLIZ.append(this.optNormalTemplate);
            sbLIZ.append(", optReport=");
            sbLIZ.append(this.optReport);
            sbLIZ.append(", optHandler=");
            sbLIZ.append(this.optHandler);
            sbLIZ.append(", optDeferDispatch=");
            sbLIZ.append(this.optDeferDispatch);
            sbLIZ.append(", optCpuBoost=");
            sbLIZ.append(this.optCpuBoost);
            sbLIZ.append(", cpuBoostDurationMs=");
            sbLIZ.append(this.cpuBoostDurationMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcPbNativePrefetchOptConfigModel() {
            this(0, 0, 0, 0, 0, 0, 100L);
        }

        public EcPbNativePrefetchOptConfigModel(int i, int i2, int i3, int i4, int i5, int i6, long j) {
            this.optPbTemplate = i;
            this.optNormalTemplate = i2;
            this.optReport = i3;
            this.optHandler = i4;
            this.optDeferDispatch = i5;
            this.optCpuBoost = i6;
            this.cpuBoostDurationMs = j;
        }
    }

    static {
        EcPbNativePrefetchOptConfigModel ecPbNativePrefetchOptConfigModel = new EcPbNativePrefetchOptConfigModel(0, 0, 0, 0, 0, 0, 100L);
        EcPbNativePrefetchOptConfigModel ecPbNativePrefetchOptConfigModel2 = (EcPbNativePrefetchOptConfigModel) C0C64.LJIILLIIL().LJJII(EcPbNativePrefetchOptConfigModel.class, ecPbNativePrefetchOptConfigModel, "ecom_pb_native_prefetch_config", true);
        if (ecPbNativePrefetchOptConfigModel2 != null) {
            ecPbNativePrefetchOptConfigModel = ecPbNativePrefetchOptConfigModel2;
        }
        LIZ = ecPbNativePrefetchOptConfigModel;
    }
}
