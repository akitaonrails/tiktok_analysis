package com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCDownloadMockForceFailExp {
    public static final AIGCDownloadMockForceFailConfig LIZ = new AIGCDownloadMockForceFailConfig(false, 7009, "mock_force_fail", 0);

    public static final class AIGCDownloadMockForceFailConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("error_code")
        public final int errorCode;

        @C09CT("error_msg")
        public final String errorMsg;

        @C09CT("fail_until_attempt")
        public final int failUntilAttempt;

        public AIGCDownloadMockForceFailConfig() {
            this(false, 7009, "mock_force_fail", 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIGCDownloadMockForceFailConfig)) {
                return false;
            }
            AIGCDownloadMockForceFailConfig aIGCDownloadMockForceFailConfig = (AIGCDownloadMockForceFailConfig) obj;
            return this.enable == aIGCDownloadMockForceFailConfig.enable && this.errorCode == aIGCDownloadMockForceFailConfig.errorCode && Intrinsics.LJFF(this.errorMsg, aIGCDownloadMockForceFailConfig.errorMsg) && this.failUntilAttempt == aIGCDownloadMockForceFailConfig.failUntilAttempt;
        }

        public final int hashCode() {
            return (((((C786410Ut5.Z2(this.enable) * 31) + this.errorCode) * 31) + this.errorMsg.hashCode()) * 31) + this.failUntilAttempt;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCDownloadMockForceFailConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", errorCode=");
            sbLIZ.append(this.errorCode);
            sbLIZ.append(", errorMsg=");
            sbLIZ.append(this.errorMsg);
            sbLIZ.append(", failUntilAttempt=");
            sbLIZ.append(this.failUntilAttempt);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AIGCDownloadMockForceFailConfig(boolean z, int i, String str, int i2) {
            this.enable = z;
            this.errorCode = i;
            this.errorMsg = str;
            this.failUntilAttempt = i2;
        }
    }
}
