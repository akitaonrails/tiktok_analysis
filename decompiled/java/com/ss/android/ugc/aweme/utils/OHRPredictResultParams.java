package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class OHRPredictResultParams implements Serializable {

    @C09CT("confidence")
    public final float confidence;

    @C09CT("hand")
    public final int hand;

    @C09CT("left_percent")
    public final float leftPercent;

    @C09CT("right_percent")
    public final float rightPercent;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OHRPredictResultParams(hand=");
        sbLIZ.append(this.hand);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.confidence);
        sbLIZ.append(", leftPercent=");
        sbLIZ.append(this.leftPercent);
        sbLIZ.append(", rightPercent=");
        sbLIZ.append(this.rightPercent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OHRPredictResultParams(int i, float f, float f2, float f3) {
        this.hand = i;
        this.confidence = f;
        this.leftPercent = f2;
        this.rightPercent = f3;
    }
}
