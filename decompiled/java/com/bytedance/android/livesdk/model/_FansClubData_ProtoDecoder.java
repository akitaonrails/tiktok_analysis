package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.FansClubData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansClubData_ProtoDecoder implements C0IMD<FansClubData> {
    public static FansClubData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansClubData fansClubData = new FansClubData();
        fansClubData.availableGiftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        fansClubData.clubName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        fansClubData.level = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        fansClubData.badge = _FansClubData_UserBadge_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        fansClubData.availableGiftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 6:
                        fansClubData.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansClubData;
            }
        }
    }

    public static void LJ(FansClubData fansClubData) {
        FansClubData.UserBadge userBadge = fansClubData.badge;
        if (userBadge != null) {
            _FansClubData_UserBadge_ProtoDecoder.LJ(userBadge);
        }
        if (fansClubData.availableGiftIds == null) {
            fansClubData.availableGiftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FansClubData fansClubData) {
        LJ(fansClubData);
    }

    @Override // X.C0IMD
    public final FansClubData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansClubData fansClubData, List list) {
    }
}
