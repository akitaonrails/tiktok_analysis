package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BillboardSizeGuidanceConfigItem_ProtoDecoder implements C0IMD<BillboardSizeGuidanceConfigItem> {
    public static BillboardSizeGuidanceConfigItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BillboardSizeGuidanceConfigItem billboardSizeGuidanceConfigItem = new BillboardSizeGuidanceConfigItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        billboardSizeGuidanceConfigItem.value = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    billboardSizeGuidanceConfigItem.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboardSizeGuidanceConfigItem;
            }
        }
    }

    @Override // X.C0IMD
    public final BillboardSizeGuidanceConfigItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BillboardSizeGuidanceConfigItem billboardSizeGuidanceConfigItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BillboardSizeGuidanceConfigItem billboardSizeGuidanceConfigItem, List list) {
    }
}
