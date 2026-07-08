package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C909120ZlW;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PreshownStickerConfigResolvingResult extends IBusinessConfig {
    public static final C909120ZlW Companion = new Object() { // from class: X.0ZlW
    };

    @C09CT("config")
    public final PreshownStickerSceneConfig config;

    @C09CT("resetted")
    public final boolean resetted;

    @C09CT("resetted_score")
    public final int resettedScore;

    public final PreshownStickerConfigResolvingResult copy(boolean z, int i, PreshownStickerSceneConfig preshownStickerSceneConfig) {
        return new PreshownStickerConfigResolvingResult(z, i, preshownStickerSceneConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreshownStickerConfigResolvingResult)) {
            return false;
        }
        PreshownStickerConfigResolvingResult preshownStickerConfigResolvingResult = (PreshownStickerConfigResolvingResult) obj;
        return this.resetted == preshownStickerConfigResolvingResult.resetted && this.resettedScore == preshownStickerConfigResolvingResult.resettedScore && Intrinsics.LJFF(this.config, preshownStickerConfigResolvingResult.config);
    }

    public int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.resetted) * 31) + this.resettedScore) * 31;
        PreshownStickerSceneConfig preshownStickerSceneConfig = this.config;
        return iZ2 + (preshownStickerSceneConfig == null ? 0 : preshownStickerSceneConfig.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreshownStickerConfigResolvingResult(resetted=");
        sbLIZ.append(this.resetted);
        sbLIZ.append(", resettedScore=");
        sbLIZ.append(this.resettedScore);
        sbLIZ.append(", config=");
        sbLIZ.append(this.config);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PreshownStickerSceneConfig getConfig() {
        return this.config;
    }

    public final boolean getResetted() {
        return this.resetted;
    }

    public final int getResettedScore() {
        return this.resettedScore;
    }

    public PreshownStickerConfigResolvingResult(boolean z, int i, PreshownStickerSceneConfig preshownStickerSceneConfig) {
        this.resetted = z;
        this.resettedScore = i;
        this.config = preshownStickerSceneConfig;
    }
}
