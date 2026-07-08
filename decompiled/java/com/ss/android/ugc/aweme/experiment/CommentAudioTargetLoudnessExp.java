package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentAudioTargetLoudnessExp {
    public static final BalanceConfig LIZ = new BalanceConfig(false, -12.0d);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(239));

    public static final class BalanceConfig {

        @C09CT("enable_balance")
        public final boolean enable;

        @C09CT("target_loudness")
        public final double targetLoudness;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceConfig)) {
                return false;
            }
            BalanceConfig balanceConfig = (BalanceConfig) obj;
            return this.enable == balanceConfig.enable && Double.compare(this.targetLoudness, balanceConfig.targetLoudness) == 0;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.X2(this.targetLoudness);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BalanceConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", targetLoudness=");
            sbLIZ.append(this.targetLoudness);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BalanceConfig(boolean z, double d) {
            this.enable = z;
            this.targetLoudness = d;
        }
    }
}
