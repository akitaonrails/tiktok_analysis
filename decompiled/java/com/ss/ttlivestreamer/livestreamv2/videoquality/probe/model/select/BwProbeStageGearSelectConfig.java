package com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes36.dex */
public class BwProbeStageGearSelectConfig extends BwProbeBaseGearSelectConfig {

    @C09CT("BottomLine540p")
    public long bottomLine540p;

    @C09CT("BottomLine540pBwe")
    public long bottomLine540pBwe;

    @C09CT("BWProbeAimLevel")
    public int bwProbeAimLevel = 4;

    @C09CT("BWProbeBottomLevel")
    public int bwProbeBottomLevel = 1;

    @C09CT("BottomLine480pBwe")
    public long bottomLine480pBwe = 1;

    @C09CT("BottomLine720pBwe")
    public long bottomLine720pBwe = 2500;

    @C09CT("BottomLine1080pBwe")
    public long bottomLine1080pBwe = 7000;

    @C09CT("BottomLine480p")
    public long bottomLine480p = 1;

    @C09CT("BottomLine720p")
    public long bottomLine720p = 2500;

    @C09CT("BottomLine1080p")
    public long bottomLine1080p = 7000;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BwProbeStageGearSelectConfig{bwProbeAimLevel=");
        sbLIZ.append(this.bwProbeAimLevel);
        sbLIZ.append(", bwProbeBottomLevel=");
        sbLIZ.append(this.bwProbeBottomLevel);
        sbLIZ.append(", bottomLine480pBwe=");
        sbLIZ.append(this.bottomLine480pBwe);
        sbLIZ.append(", bottomLine540pBwe=");
        sbLIZ.append(this.bottomLine540pBwe);
        sbLIZ.append(", bottomLine720pBwe=");
        sbLIZ.append(this.bottomLine720pBwe);
        sbLIZ.append(", bottomLine1080pBwe=");
        sbLIZ.append(this.bottomLine1080pBwe);
        sbLIZ.append(", bottomLine480p=");
        sbLIZ.append(this.bottomLine480p);
        sbLIZ.append(", bottomLine540p=");
        sbLIZ.append(this.bottomLine540p);
        sbLIZ.append(", bottomLine720p=");
        sbLIZ.append(this.bottomLine720p);
        sbLIZ.append(", bottomLine1080p=");
        sbLIZ.append(this.bottomLine1080p);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeBaseGearSelectConfig
    public final int LIZ() {
        return this.bwProbeAimLevel;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeBaseGearSelectConfig
    public final int LIZIZ() {
        return this.bwProbeBottomLevel;
    }
}
