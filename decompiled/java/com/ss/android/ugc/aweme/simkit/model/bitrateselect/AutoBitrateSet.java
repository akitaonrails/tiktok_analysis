package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1475360oUo;

/* JADX INFO: loaded from: classes24.dex */
public class AutoBitrateSet implements InterfaceC1475360oUo {

    @C09CT("param_a")
    public double firstParam;

    @C09CT("param_d")
    public double fourthParam;

    @C09CT("min_bitrate")
    public double minBitrate;

    @C09CT("param_b")
    public double secondParam;

    @C09CT("param_c")
    public double thirdParam;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoBitrateSet{firstParam=");
        sbLIZ.append(this.firstParam);
        sbLIZ.append(", secondParam=");
        sbLIZ.append(this.secondParam);
        sbLIZ.append(", thirdParam=");
        sbLIZ.append(this.thirdParam);
        sbLIZ.append(", fourthParam=");
        sbLIZ.append(this.fourthParam);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.minBitrate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZ() {
        return this.minBitrate;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZIZ() {
        return this.fourthParam;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZJ() {
        return this.secondParam;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LIZLLL() {
        return this.firstParam;
    }

    @Override // X.InterfaceC1475360oUo
    public final double LJ() {
        return this.thirdParam;
    }
}
