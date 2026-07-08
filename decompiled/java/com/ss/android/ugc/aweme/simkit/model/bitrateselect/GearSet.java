package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1477700oYa;

/* JADX INFO: loaded from: classes24.dex */
public class GearSet implements InterfaceC1477700oYa {

    @C09CT("bit_rate")
    public int bitRate;

    @C09CT("network_lower")
    public int networkLower;

    @C09CT("network_upper")
    public int networkUpper;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GearSet{networkUpper=");
        sbLIZ.append(this.networkUpper);
        sbLIZ.append(", networkLower=");
        sbLIZ.append(this.networkLower);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1477700oYa
    public int getBitRate() {
        return this.bitRate;
    }

    @Override // X.InterfaceC1477700oYa
    public int getNetworkLower() {
        return this.networkLower;
    }

    @Override // X.InterfaceC1477700oYa
    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setNetworkLower(int i) {
        this.networkLower = i;
    }

    public void setNetworkUpper(int i) {
        this.networkUpper = i;
    }
}
