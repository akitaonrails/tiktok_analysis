package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class BottomTabTouchPredictionConfig {

    @C09CT("black_list")
    public final List<String> blackList;

    @C09CT("click_intent_threshold")
    public final double clickIntentThreshold;

    @C09CT("model_params")
    public final TouchIntentModelParams modelParams;

    public BottomTabTouchPredictionConfig() {
        this(0.0d, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTabTouchPredictionConfig)) {
            return false;
        }
        BottomTabTouchPredictionConfig bottomTabTouchPredictionConfig = (BottomTabTouchPredictionConfig) obj;
        return Double.compare(this.clickIntentThreshold, bottomTabTouchPredictionConfig.clickIntentThreshold) == 0 && Intrinsics.LJFF(this.blackList, bottomTabTouchPredictionConfig.blackList) && Intrinsics.LJFF(this.modelParams, bottomTabTouchPredictionConfig.modelParams);
    }

    public final int hashCode() {
        int iX2 = ((C786410Ut5.X2(this.clickIntentThreshold) * 31) + this.blackList.hashCode()) * 31;
        TouchIntentModelParams touchIntentModelParams = this.modelParams;
        return iX2 + (touchIntentModelParams == null ? 0 : touchIntentModelParams.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTabTouchPredictionConfig(clickIntentThreshold=");
        sbLIZ.append(this.clickIntentThreshold);
        sbLIZ.append(", blackList=");
        sbLIZ.append(this.blackList);
        sbLIZ.append(", modelParams=");
        sbLIZ.append(this.modelParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BottomTabTouchPredictionConfig(double d, List<String> list, TouchIntentModelParams touchIntentModelParams) {
        this.clickIntentThreshold = d;
        this.blackList = list;
        this.modelParams = touchIntentModelParams;
    }

    public BottomTabTouchPredictionConfig(double d, List list, TouchIntentModelParams touchIntentModelParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.7d : d, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : touchIntentModelParams);
    }
}
