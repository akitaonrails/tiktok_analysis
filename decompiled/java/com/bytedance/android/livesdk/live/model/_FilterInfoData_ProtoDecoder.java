package com.bytedance.android.livesdk.live.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FilterInfoData_ProtoDecoder implements C0IMD<FilterInfoData> {
    public static FilterInfoData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FilterInfoData filterInfoData = new FilterInfoData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        filterInfoData.reason = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    filterInfoData.isFiltered = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return filterInfoData;
            }
        }
    }

    @Override // X.C0IMD
    public final FilterInfoData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FilterInfoData filterInfoData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FilterInfoData filterInfoData, List list) {
    }
}
