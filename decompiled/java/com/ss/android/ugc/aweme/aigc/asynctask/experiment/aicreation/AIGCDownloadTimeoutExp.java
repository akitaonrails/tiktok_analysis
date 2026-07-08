package com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCDownloadTimeoutExp {
    public static final AIGCDownloadTimeoutConfig LIZ = new AIGCDownloadTimeoutConfig(false, 60000, 180000);

    public static final class AIGCDownloadTimeoutConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("per_attempt_timeout_ms")
        public final long perAttemptTimeoutMs;

        @C09CT("total_timeout_ms")
        public final long totalTimeoutMs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIGCDownloadTimeoutConfig)) {
                return false;
            }
            AIGCDownloadTimeoutConfig aIGCDownloadTimeoutConfig = (AIGCDownloadTimeoutConfig) obj;
            return this.enable == aIGCDownloadTimeoutConfig.enable && this.perAttemptTimeoutMs == aIGCDownloadTimeoutConfig.perAttemptTimeoutMs && this.totalTimeoutMs == aIGCDownloadTimeoutConfig.totalTimeoutMs;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.perAttemptTimeoutMs)) * 31) + C786410Ut5.Y2(this.totalTimeoutMs);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCDownloadTimeoutConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", perAttemptTimeoutMs=");
            sbLIZ.append(this.perAttemptTimeoutMs);
            sbLIZ.append(", totalTimeoutMs=");
            sbLIZ.append(this.totalTimeoutMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AIGCDownloadTimeoutConfig() {
            this(false, 60000L, 180000L);
        }

        public AIGCDownloadTimeoutConfig(boolean z, long j, long j2) {
            this.enable = z;
            this.perAttemptTimeoutMs = j;
            this.totalTimeoutMs = j2;
        }
    }
}
