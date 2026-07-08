package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivityConfigItem_ProtoDecoder implements C0IMD<ActivityConfigItem> {
    public static ActivityConfigItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActivityConfigItem activityConfigItem = new ActivityConfigItem();
        activityConfigItem.activitySubValue = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        activityConfigItem.chosen = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        activityConfigItem.activityType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        activityConfigItem.activitySubType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        activityConfigItem.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        activityConfigItem.extraText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        activityConfigItem.activitySubValue.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        activityConfigItem.activityTypeInt = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        activityConfigItem.activitySubTypeInt = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activityConfigItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActivityConfigItem activityConfigItem) {
        ActivityConfigItem activityConfigItem2 = activityConfigItem;
        if (activityConfigItem2.activitySubValue == null) {
            activityConfigItem2.activitySubValue = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ActivityConfigItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivityConfigItem activityConfigItem, List list) {
    }
}
