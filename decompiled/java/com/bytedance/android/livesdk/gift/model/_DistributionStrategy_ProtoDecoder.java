package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DistributionStrategy_ProtoDecoder implements C0IMD<DistributionStrategy> {
    public static DistributionStrategy LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DistributionStrategy distributionStrategy = new DistributionStrategy();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        distributionStrategy.resourceType = c1516680pZS.LJIIJ();
                    }
                } else {
                    distributionStrategy.assetBase = _AssetBase_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return distributionStrategy;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DistributionStrategy distributionStrategy) {
        AssetBase assetBase = distributionStrategy.assetBase;
        if (assetBase != null) {
            _AssetBase_ProtoDecoder.LJ(assetBase);
        }
    }

    @Override // X.C0IMD
    public final DistributionStrategy LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DistributionStrategy distributionStrategy, List list) {
    }
}
