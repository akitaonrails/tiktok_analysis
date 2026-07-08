package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BillboardSizeGuidanceConfig_ProtoDecoder implements C0IMD<BillboardSizeGuidanceConfig> {
    public static BillboardSizeGuidanceConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BillboardSizeGuidanceConfig billboardSizeGuidanceConfig = new BillboardSizeGuidanceConfig();
        billboardSizeGuidanceConfig.sizeGuidanceConfigItems = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        billboardSizeGuidanceConfig.sizeGuidanceConfigItems.add(_BillboardSizeGuidanceConfigItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    billboardSizeGuidanceConfig.maxInputItem = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboardSizeGuidanceConfig;
            }
        }
    }

    public static void LJ(BillboardSizeGuidanceConfig billboardSizeGuidanceConfig) {
        List<BillboardSizeGuidanceConfigItem> list = billboardSizeGuidanceConfig.sizeGuidanceConfigItems;
        if (list == null) {
            billboardSizeGuidanceConfig.sizeGuidanceConfigItems = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BillboardSizeGuidanceConfigItem> it2 = billboardSizeGuidanceConfig.sizeGuidanceConfigItems.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BillboardSizeGuidanceConfig billboardSizeGuidanceConfig) {
        LJ(billboardSizeGuidanceConfig);
    }

    @Override // X.C0IMD
    public final BillboardSizeGuidanceConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BillboardSizeGuidanceConfig billboardSizeGuidanceConfig, List list) {
    }
}
