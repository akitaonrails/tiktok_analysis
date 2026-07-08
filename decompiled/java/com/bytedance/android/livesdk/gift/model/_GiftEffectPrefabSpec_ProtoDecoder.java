package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectPrefabSpec_ProtoDecoder implements C0IMD<GiftEffectPrefabSpec> {
    public static GiftEffectPrefabSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectPrefabSpec giftEffectPrefabSpec = new GiftEffectPrefabSpec();
        giftEffectPrefabSpec.prefabAssetIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftEffectPrefabSpec.prefabAssetIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    giftEffectPrefabSpec.templateAssetId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffectPrefabSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftEffectPrefabSpec giftEffectPrefabSpec) {
        GiftEffectPrefabSpec giftEffectPrefabSpec2 = giftEffectPrefabSpec;
        if (giftEffectPrefabSpec2.prefabAssetIds == null) {
            giftEffectPrefabSpec2.prefabAssetIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftEffectPrefabSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectPrefabSpec giftEffectPrefabSpec, List list) {
    }
}
