package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CustomTab_ProtoDecoder implements C0IMD<CustomTab> {
    public static CustomTab LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CustomTab customTab = new CustomTab();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        customTab.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        customTab.tabTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        customTab.tabSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        customTab.tabSchemaType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        customTab.tabPriority = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        customTab.tabBizName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return customTab;
            }
        }
    }

    @Override // X.C0IMD
    public final CustomTab LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CustomTab customTab) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CustomTab customTab, List list) {
    }
}
