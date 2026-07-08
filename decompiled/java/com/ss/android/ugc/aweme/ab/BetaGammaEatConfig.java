package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public final class BetaGammaEatConfig {

    @C09CT("beta")
    public final double beta;

    @C09CT("eta")
    public final double eta;

    @C09CT("gamma")
    public final double gamma;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BetaGammaEatConfig(gamma=");
        sbLIZ.append(this.gamma);
        sbLIZ.append(", beta=");
        sbLIZ.append(this.beta);
        sbLIZ.append(", eta=");
        sbLIZ.append(this.eta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BetaGammaEatConfig() {
        this(0.0d, 0.0d, 0.0d);
    }

    public BetaGammaEatConfig(double d, double d2, double d3) {
        this.gamma = d;
        this.beta = d2;
        this.eta = d3;
    }
}
