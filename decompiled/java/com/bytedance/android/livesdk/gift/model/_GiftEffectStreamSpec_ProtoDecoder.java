package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectStreamSpec_ProtoDecoder implements C0IMD<GiftEffectStreamSpec> {
    public static GiftEffectStreamSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectStreamSpec giftEffectStreamSpec = new GiftEffectStreamSpec();
        giftEffectStreamSpec.extraAssetIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftEffectStreamSpec.extraAssetIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    giftEffectStreamSpec.basicAssetId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffectStreamSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftEffectStreamSpec giftEffectStreamSpec) {
        GiftEffectStreamSpec giftEffectStreamSpec2 = giftEffectStreamSpec;
        if (giftEffectStreamSpec2.extraAssetIds == null) {
            giftEffectStreamSpec2.extraAssetIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftEffectStreamSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectStreamSpec giftEffectStreamSpec, List list) {
    }
}
