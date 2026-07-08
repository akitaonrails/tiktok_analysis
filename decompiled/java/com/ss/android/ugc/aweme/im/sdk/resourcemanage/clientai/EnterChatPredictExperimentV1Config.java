package com.ss.android.ugc.aweme.im.sdk.resourcemanage.clientai;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes19.dex */
public final class EnterChatPredictExperimentV1Config extends SmartSceneConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_init_pitaya")
    public final boolean enableInitPitaya;

    @C09CT("score_threshold")
    public final float scoreThreshold;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterChatPredictExperimentV1Config)) {
            return false;
        }
        EnterChatPredictExperimentV1Config enterChatPredictExperimentV1Config = (EnterChatPredictExperimentV1Config) obj;
        return Float.compare(this.scoreThreshold, enterChatPredictExperimentV1Config.scoreThreshold) == 0 && this.enable == enterChatPredictExperimentV1Config.enable && this.enableInitPitaya == enterChatPredictExperimentV1Config.enableInitPitaya;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterChatPredictExperimentV1Config(scoreThreshold=");
        sbLIZ.append(this.scoreThreshold);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableInitPitaya=");
        sbLIZ.append(this.enableInitPitaya);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EnterChatPredictExperimentV1Config() {
        this(0.5f, false, false);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.scoreThreshold) * 31) + C786410Ut5.Z2(this.enable)) * 31) + C786410Ut5.Z2(this.enableInitPitaya);
    }

    public EnterChatPredictExperimentV1Config(float f, boolean z, boolean z2) {
        this.scoreThreshold = f;
        this.enable = z;
        this.enableInitPitaya = z2;
    }
}
