package com.bytedance.android.livesdk.gift.assets;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AssetsListResult_ProtoDecoder implements C0IMD<AssetsListResult> {
    @Override // X.C0IMD
    public final void LIZ(AssetsListResult assetsListResult) {
        AssetsListResult assetsListResult2 = assetsListResult;
        List<AssetsModel> list = assetsListResult2.assets;
        if (list == null) {
            assetsListResult2.assets = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (AssetsModel assetsModel : assetsListResult2.assets) {
            if (assetsModel != null) {
                _AssetsModel_ProtoDecoder.LJ(assetsModel);
            }
        }
    }

    @Override // X.C0IMD
    public final AssetsListResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AssetsListResult assetsListResult = new AssetsListResult();
        assetsListResult.assets = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    assetsListResult.assets.add(_AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return assetsListResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AssetsListResult assetsListResult, List list) {
    }
}
