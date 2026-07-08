package com.bytedance.android.livesdk.live.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomStatsModel_ProtoDecoder implements C0IMD<RoomStatsModel> {
    @Override // X.C0IMD
    public final void LIZ(RoomStatsModel roomStatsModel) {
    }

    @Override // X.C0IMD
    public final RoomStatsModel LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomStatsModel roomStatsModel = new RoomStatsModel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            roomStatsModel.filterInfo = _FilterInfoData_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roomStatsModel.alive = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    roomStatsModel.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomStatsModel;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomStatsModel roomStatsModel, List list) {
    }
}
