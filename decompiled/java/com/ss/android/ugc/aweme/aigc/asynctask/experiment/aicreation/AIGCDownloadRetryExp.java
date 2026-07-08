package com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AIGCDownloadRetryExp {
    public static final AIGCDownloadRetryConfig LIZ = new AIGCDownloadRetryConfig(false, 0, 0, 0.0d, 0, null, false, 127, null);

    public static final AIGCDownloadRetryConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AIGCDownloadRetryConfig aIGCDownloadRetryConfig = LIZ;
        AIGCDownloadRetryConfig aIGCDownloadRetryConfig2 = (AIGCDownloadRetryConfig) c0c64LJIILLIIL.LJJII(AIGCDownloadRetryConfig.class, aIGCDownloadRetryConfig, "aigc_download_retry_config", true);
        return aIGCDownloadRetryConfig2 != null ? aIGCDownloadRetryConfig2 : aIGCDownloadRetryConfig;
    }

    public static final class AIGCDownloadRetryConfig {

        @C09CT("backoff_base_ms")
        public final long backoffBaseMs;

        @C09CT("backoff_multiplier")
        public final double backoffMultiplier;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_http_status_classification")
        public final boolean enableHttpStatusClassification;

        @C09CT("max_backoff_ms")
        public final long maxBackoffMs;

        @C09CT("max_retry")
        public final int maxRetry;

        @C09CT("non_retryable_error_codes")
        public final List<Integer> nonRetryableErrorCodes;

        public AIGCDownloadRetryConfig() {
            this(false, 0, 0L, 0.0d, 0L, null, false, 127, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIGCDownloadRetryConfig)) {
                return false;
            }
            AIGCDownloadRetryConfig aIGCDownloadRetryConfig = (AIGCDownloadRetryConfig) obj;
            return this.enable == aIGCDownloadRetryConfig.enable && this.maxRetry == aIGCDownloadRetryConfig.maxRetry && this.backoffBaseMs == aIGCDownloadRetryConfig.backoffBaseMs && Double.compare(this.backoffMultiplier, aIGCDownloadRetryConfig.backoffMultiplier) == 0 && this.maxBackoffMs == aIGCDownloadRetryConfig.maxBackoffMs && Intrinsics.LJFF(this.nonRetryableErrorCodes, aIGCDownloadRetryConfig.nonRetryableErrorCodes) && this.enableHttpStatusClassification == aIGCDownloadRetryConfig.enableHttpStatusClassification;
        }

        public final int hashCode() {
            return (((((((((((C786410Ut5.Z2(this.enable) * 31) + this.maxRetry) * 31) + C786410Ut5.Y2(this.backoffBaseMs)) * 31) + C786410Ut5.X2(this.backoffMultiplier)) * 31) + C786410Ut5.Y2(this.maxBackoffMs)) * 31) + this.nonRetryableErrorCodes.hashCode()) * 31) + C786410Ut5.Z2(this.enableHttpStatusClassification);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCDownloadRetryConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", maxRetry=");
            sbLIZ.append(this.maxRetry);
            sbLIZ.append(", backoffBaseMs=");
            sbLIZ.append(this.backoffBaseMs);
            sbLIZ.append(", backoffMultiplier=");
            sbLIZ.append(this.backoffMultiplier);
            sbLIZ.append(", maxBackoffMs=");
            sbLIZ.append(this.maxBackoffMs);
            sbLIZ.append(", nonRetryableErrorCodes=");
            sbLIZ.append(this.nonRetryableErrorCodes);
            sbLIZ.append(", enableHttpStatusClassification=");
            sbLIZ.append(this.enableHttpStatusClassification);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AIGCDownloadRetryConfig(boolean z, int i, long j, double d, long j2, List<Integer> list, boolean z2) {
            this.enable = z;
            this.maxRetry = i;
            this.backoffBaseMs = j;
            this.backoffMultiplier = d;
            this.maxBackoffMs = j2;
            this.nonRetryableErrorCodes = list;
            this.enableHttpStatusClassification = z2;
        }

        public AIGCDownloadRetryConfig(boolean z, int i, long j, double d, long j2, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? 1000L : j, (i2 & 8) != 0 ? 2.0d : d, (i2 & 16) != 0 ? 30000L : j2, (i2 & 32) != 0 ? Collections.singletonList(7010) : list, (i2 & 64) != 0 ? true : z2);
        }
    }
}
