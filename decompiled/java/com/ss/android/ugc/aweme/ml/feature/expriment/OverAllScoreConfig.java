package com.ss.android.ugc.aweme.ml.feature.expriment;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class OverAllScoreConfig {
    public final float highScore;
    public final float middleScore;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverAllScoreConfig)) {
            return false;
        }
        OverAllScoreConfig overAllScoreConfig = (OverAllScoreConfig) obj;
        return Float.compare(this.middleScore, overAllScoreConfig.middleScore) == 0 && Float.compare(this.highScore, overAllScoreConfig.highScore) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OverAllScoreConfig(middleScore=");
        sbLIZ.append(this.middleScore);
        sbLIZ.append(", highScore=");
        sbLIZ.append(this.highScore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.middleScore) * 31) + Float.floatToIntBits(this.highScore);
    }

    public OverAllScoreConfig() {
        this(6.9f, 8.7f);
    }

    public OverAllScoreConfig(float f, float f2) {
        this.middleScore = f;
        this.highScore = f2;
    }
}
