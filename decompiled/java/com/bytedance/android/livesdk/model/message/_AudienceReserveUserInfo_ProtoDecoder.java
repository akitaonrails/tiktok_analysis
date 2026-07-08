package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudienceReserveUserInfo_ProtoDecoder implements C0IMD<AudienceReserveUserInfo> {
    public static AudienceReserveUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AudienceReserveUserInfo audienceReserveUserInfo = new AudienceReserveUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        audienceReserveUserInfo.reserveId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    audienceReserveUserInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audienceReserveUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AudienceReserveUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AudienceReserveUserInfo audienceReserveUserInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudienceReserveUserInfo audienceReserveUserInfo, List list) {
    }
}
