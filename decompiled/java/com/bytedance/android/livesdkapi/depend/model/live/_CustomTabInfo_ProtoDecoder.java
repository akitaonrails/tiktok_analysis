package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CustomTabInfo_ProtoDecoder implements C0IMD<CustomTabInfo> {
    public static CustomTabInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CustomTabInfo customTabInfo = new CustomTabInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    customTabInfo.customTabs = _CustomTabs_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return customTabInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CustomTabInfo customTabInfo) {
        CustomTabs customTabs = customTabInfo.customTabs;
        if (customTabs != null) {
            _CustomTabs_ProtoDecoder.LJ(customTabs);
        }
    }

    @Override // X.C0IMD
    public final CustomTabInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CustomTabInfo customTabInfo, List list) {
    }
}
