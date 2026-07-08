package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectSerialSpec_ProtoDecoder implements C0IMD<GiftEffectSerialSpec> {
    public static GiftEffectSerialSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectSerialSpec giftEffectSerialSpec = new GiftEffectSerialSpec();
        giftEffectSerialSpec.serialAssetIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftEffectSerialSpec.serialAssetIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffectSerialSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftEffectSerialSpec giftEffectSerialSpec) {
        GiftEffectSerialSpec giftEffectSerialSpec2 = giftEffectSerialSpec;
        if (giftEffectSerialSpec2.serialAssetIds == null) {
            giftEffectSerialSpec2.serialAssetIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftEffectSerialSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectSerialSpec giftEffectSerialSpec, List list) {
    }
}
