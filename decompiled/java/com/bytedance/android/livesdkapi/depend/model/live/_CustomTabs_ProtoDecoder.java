package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CustomTabs_ProtoDecoder implements C0IMD<CustomTabs> {
    public static CustomTabs LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CustomTabs customTabs = new CustomTabs();
        customTabs.customTabList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        customTabs.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        customTabs.beginTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        customTabs.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        customTabs.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        customTabs.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        customTabs.defaultTabIndex = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        customTabs.customTabList.add(_CustomTab_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return customTabs;
            }
        }
    }

    public static void LJ(CustomTabs customTabs) {
        List<CustomTab> list = customTabs.customTabList;
        if (list == null) {
            customTabs.customTabList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CustomTab> it2 = customTabs.customTabList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CustomTabs customTabs) {
        LJ(customTabs);
    }

    @Override // X.C0IMD
    public final CustomTabs LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CustomTabs customTabs, List list) {
    }
}
