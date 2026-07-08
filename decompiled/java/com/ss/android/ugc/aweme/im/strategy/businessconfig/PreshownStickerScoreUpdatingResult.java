package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C909130ZlX;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;

/* JADX INFO: loaded from: classes15.dex */
public final class PreshownStickerScoreUpdatingResult extends IBusinessConfig {
    public static final C909130ZlX Companion = new Object() { // from class: X.0ZlX
    };

    @C09CT("score_delta")
    public final int scoreDelta;

    public final PreshownStickerScoreUpdatingResult copy(int i) {
        return new PreshownStickerScoreUpdatingResult(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreshownStickerScoreUpdatingResult) && this.scoreDelta == ((PreshownStickerScoreUpdatingResult) obj).scoreDelta;
    }

    public int hashCode() {
        return this.scoreDelta;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreshownStickerScoreUpdatingResult(scoreDelta=");
        sbLIZ.append(this.scoreDelta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getScoreDelta() {
        return this.scoreDelta;
    }

    public PreshownStickerScoreUpdatingResult(int i) {
        this.scoreDelta = i;
    }
}
