package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoAudioDuckingConfig {

    @C09CT("attackTimeS")
    public final double attackTimeS;

    @C09CT("compressorRatio")
    public final double compressorRatio;

    @C09CT("gainDb")
    public final double gainDb;

    @C09CT("holdTimeS")
    public final double holdTimeS;

    @C09CT("mixedOutput")
    public final boolean mixedOutput;

    @C09CT("releaseTimeS")
    public final double releaseTimeS;

    @C09CT("rmsSmoothTimeS")
    public final double rmsSmoothTimeS;

    @C09CT("speechThresDbfs")
    public final double speechThresDbfs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoAudioDuckingConfig)) {
            return false;
        }
        TakoAudioDuckingConfig takoAudioDuckingConfig = (TakoAudioDuckingConfig) obj;
        return Double.compare(this.speechThresDbfs, takoAudioDuckingConfig.speechThresDbfs) == 0 && Double.compare(this.gainDb, takoAudioDuckingConfig.gainDb) == 0 && Double.compare(this.holdTimeS, takoAudioDuckingConfig.holdTimeS) == 0 && Double.compare(this.attackTimeS, takoAudioDuckingConfig.attackTimeS) == 0 && Double.compare(this.releaseTimeS, takoAudioDuckingConfig.releaseTimeS) == 0 && Double.compare(this.rmsSmoothTimeS, takoAudioDuckingConfig.rmsSmoothTimeS) == 0 && Double.compare(this.compressorRatio, takoAudioDuckingConfig.compressorRatio) == 0 && this.mixedOutput == takoAudioDuckingConfig.mixedOutput;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.X2(this.speechThresDbfs) * 31) + C786410Ut5.X2(this.gainDb)) * 31) + C786410Ut5.X2(this.holdTimeS)) * 31) + C786410Ut5.X2(this.attackTimeS)) * 31) + C786410Ut5.X2(this.releaseTimeS)) * 31) + C786410Ut5.X2(this.rmsSmoothTimeS)) * 31) + C786410Ut5.X2(this.compressorRatio)) * 31) + C786410Ut5.Z2(this.mixedOutput);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAudioDuckingConfig(speechThresDbfs=");
        sbLIZ.append(this.speechThresDbfs);
        sbLIZ.append(", gainDb=");
        sbLIZ.append(this.gainDb);
        sbLIZ.append(", holdTimeS=");
        sbLIZ.append(this.holdTimeS);
        sbLIZ.append(", attackTimeS=");
        sbLIZ.append(this.attackTimeS);
        sbLIZ.append(", releaseTimeS=");
        sbLIZ.append(this.releaseTimeS);
        sbLIZ.append(", rmsSmoothTimeS=");
        sbLIZ.append(this.rmsSmoothTimeS);
        sbLIZ.append(", compressorRatio=");
        sbLIZ.append(this.compressorRatio);
        sbLIZ.append(", mixedOutput=");
        sbLIZ.append(this.mixedOutput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAudioDuckingConfig() {
        this(-20.0d, -30.0d, 1.0d, 0.001d, 1.0d, 0.01d, 1.0d, false);
    }

    public TakoAudioDuckingConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z) {
        this.speechThresDbfs = d;
        this.gainDb = d2;
        this.holdTimeS = d3;
        this.attackTimeS = d4;
        this.releaseTimeS = d5;
        this.rmsSmoothTimeS = d6;
        this.compressorRatio = d7;
        this.mixedOutput = z;
    }
}
