package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BillboardPromotionConfig_ProtoDecoder implements C0IMD<BillboardPromotionConfig> {
    public static BillboardPromotionConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BillboardPromotionConfig billboardPromotionConfig = new BillboardPromotionConfig();
        billboardPromotionConfig.activityConfigItems = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        billboardPromotionConfig.activityConfigItems.add(_ActivityConfigItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    billboardPromotionConfig.maxChosenActivityNum = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboardPromotionConfig;
            }
        }
    }

    public static void LJ(BillboardPromotionConfig billboardPromotionConfig) {
        List<ActivityConfigItem> list = billboardPromotionConfig.activityConfigItems;
        if (list == null) {
            billboardPromotionConfig.activityConfigItems = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ActivityConfigItem activityConfigItem : billboardPromotionConfig.activityConfigItems) {
            if (activityConfigItem != null && activityConfigItem.activitySubValue == null) {
                activityConfigItem.activitySubValue = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BillboardPromotionConfig billboardPromotionConfig) {
        LJ(billboardPromotionConfig);
    }

    @Override // X.C0IMD
    public final BillboardPromotionConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BillboardPromotionConfig billboardPromotionConfig, List list) {
    }
}
