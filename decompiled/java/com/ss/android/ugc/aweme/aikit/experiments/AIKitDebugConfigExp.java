package com.ss.android.ugc.aweme.aikit.experiments;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class AIKitDebugConfigExp {
    public static final AIKitDebugConfig LIZ = new AIKitDebugConfig(false, true);

    public static final class AIKitDebugConfig {

        @C09CT("generation_fail_auto_analysis")
        public final boolean generationFailAutoAnalysis;

        @C09CT("generation_fail_auto_dialog")
        public final boolean generationFailAutoDialog;

        public AIKitDebugConfig() {
            this(false, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AIKitDebugConfig)) {
                return false;
            }
            AIKitDebugConfig aIKitDebugConfig = (AIKitDebugConfig) obj;
            return this.generationFailAutoDialog == aIKitDebugConfig.generationFailAutoDialog && this.generationFailAutoAnalysis == aIKitDebugConfig.generationFailAutoAnalysis;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.generationFailAutoDialog) * 31) + C786410Ut5.Z2(this.generationFailAutoAnalysis);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIKitDebugConfig(generationFailAutoDialog=");
            sbLIZ.append(this.generationFailAutoDialog);
            sbLIZ.append(", generationFailAutoAnalysis=");
            sbLIZ.append(this.generationFailAutoAnalysis);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AIKitDebugConfig(boolean z, boolean z2) {
            this.generationFailAutoDialog = z;
            this.generationFailAutoAnalysis = z2;
        }
    }
}
