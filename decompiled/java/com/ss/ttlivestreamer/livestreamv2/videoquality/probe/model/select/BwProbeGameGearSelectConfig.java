package com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes36.dex */
public class BwProbeGameGearSelectConfig extends BwProbeBaseGearSelectConfig {

    @C09CT("BWProbeAimLevel")
    public int bwProbeAimLevel = 6;

    @C09CT("BWProbeBottomLevel")
    public int bwProbeBottomLevel = 1;

    @C09CT("BottomLine480p25Bwe")
    public long bottomLine480p25Bwe = 512;

    @C09CT("BottomLine540p25Bwe")
    public long bottomLine540p25Bwe = 1536;

    @C09CT("BottomLine720p30Bwe")
    public long bottomLine720p30Bwe = 2560;

    @C09CT("BottomLine720p60Bwe")
    public long bottomLine720p60Bwe = 4096;

    @C09CT("BottomLine1080p30Bwe")
    public long bottomLine1080p30Bwe = 6144;

    @C09CT("BottomLine1080p60Bwe")
    public long bottomLine1080p60Bwe = 6144;

    @C09CT("BottomLine480p25")
    public long bottomLine480p25 = 512;

    @C09CT("BottomLine540p25")
    public long bottomLine540p25 = 1536;

    @C09CT("BottomLine720p30")
    public long bottomLine720p30 = 2560;

    @C09CT("BottomLine720p60")
    public long bottomLine720p60 = 4096;

    @C09CT("BottomLine1080p30")
    public long bottomLine1080p30 = 6144;

    @C09CT("BottomLine1080p60")
    public long bottomLine1080p60 = 6144;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BwProbeGameGearSelectConfig{bottomLine480p25Bwe=");
        sbLIZ.append(this.bottomLine480p25Bwe);
        sbLIZ.append(", bottomLine540p25Bwe=");
        sbLIZ.append(this.bottomLine540p25Bwe);
        sbLIZ.append(", bottomLine720p30Bwe=");
        sbLIZ.append(this.bottomLine720p30Bwe);
        sbLIZ.append(", bottomLine720p60Bwe=");
        sbLIZ.append(this.bottomLine720p60Bwe);
        sbLIZ.append(", bottomLine1080p30Bwe=");
        sbLIZ.append(this.bottomLine1080p30Bwe);
        sbLIZ.append(", bottomLine1080p60Bwe=");
        sbLIZ.append(this.bottomLine1080p60Bwe);
        sbLIZ.append(", bottomLine480p25=");
        sbLIZ.append(this.bottomLine480p25);
        sbLIZ.append(", bottomLine540p25=");
        sbLIZ.append(this.bottomLine540p25);
        sbLIZ.append(", bottomLine720p30=");
        sbLIZ.append(this.bottomLine720p30);
        sbLIZ.append(", bottomLine720p60=");
        sbLIZ.append(this.bottomLine720p60);
        sbLIZ.append(", bottomLine1080p30=");
        sbLIZ.append(this.bottomLine1080p30);
        sbLIZ.append(", bottomLine1080p60=");
        sbLIZ.append(this.bottomLine1080p60);
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
