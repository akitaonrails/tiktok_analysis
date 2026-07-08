package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1477690oYZ;

/* JADX INFO: loaded from: classes4.dex */
public class BandwidthSet implements InterfaceC1477690oYZ {

    @C09CT("bitrate")
    public double bitRate;

    @C09CT("speed")
    public double speed;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BandwidthSet{speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1477690oYZ
    public double getBitrate() {
        return this.bitRate;
    }

    @Override // X.InterfaceC1477690oYZ
    public double getSpeed() {
        return this.speed;
    }

    public void setBitRate(long j) {
        this.bitRate = j;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }
}
