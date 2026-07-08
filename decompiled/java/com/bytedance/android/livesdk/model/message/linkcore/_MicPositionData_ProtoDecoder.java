package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MicPositionData_ProtoDecoder implements C0IMD<MicPositionData> {
    public static MicPositionData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MicPositionData micPositionData = new MicPositionData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        micPositionData.linkPosition = _LinkPosition_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    micPositionData.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return micPositionData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MicPositionData micPositionData) {
    }

    @Override // X.C0IMD
    public final MicPositionData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MicPositionData micPositionData, List list) {
    }
}
