package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CompetitionPlatformMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionPlatformMessage_CompetitionRotateInfo_ProtoDecoder implements C0IMD<CompetitionPlatformMessage.CompetitionRotateInfo> {
    public static CompetitionPlatformMessage.CompetitionRotateInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionPlatformMessage.CompetitionRotateInfo competitionRotateInfo = new CompetitionPlatformMessage.CompetitionRotateInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionRotateInfo.nextPerformerId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionRotateInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionPlatformMessage.CompetitionRotateInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionPlatformMessage.CompetitionRotateInfo competitionRotateInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionPlatformMessage.CompetitionRotateInfo competitionRotateInfo, List list) {
    }
}
