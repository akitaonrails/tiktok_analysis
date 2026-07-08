package com.ss.android.ugc.gamora.recorder.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordButtonOnEffectPanelCoverTipsFixConfig {

    @C09CT("bottom_margin")
    public final int bottomMargin;

    @C09CT("enable_fix")
    public final boolean enableFix;

    public RecordButtonOnEffectPanelCoverTipsFixConfig() {
        this(true, -20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordButtonOnEffectPanelCoverTipsFixConfig)) {
            return false;
        }
        RecordButtonOnEffectPanelCoverTipsFixConfig recordButtonOnEffectPanelCoverTipsFixConfig = (RecordButtonOnEffectPanelCoverTipsFixConfig) obj;
        return this.enableFix == recordButtonOnEffectPanelCoverTipsFixConfig.enableFix && this.bottomMargin == recordButtonOnEffectPanelCoverTipsFixConfig.bottomMargin;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableFix) * 31) + this.bottomMargin;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordButtonOnEffectPanelCoverTipsFixConfig(enableFix=");
        sbLIZ.append(this.enableFix);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.bottomMargin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecordButtonOnEffectPanelCoverTipsFixConfig(boolean z, int i) {
        this.enableFix = z;
        this.bottomMargin = i;
    }
}
