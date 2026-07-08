package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CompetitionPlatformMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionPlatformMessage_CompetitionInitiateInfo_ProtoDecoder implements C0IMD<CompetitionPlatformMessage.CompetitionInitiateInfo> {
    public static CompetitionPlatformMessage.CompetitionInitiateInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionPlatformMessage.CompetitionInitiateInfo competitionInitiateInfo = new CompetitionPlatformMessage.CompetitionInitiateInfo();
        competitionInitiateInfo.performanceOrder = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            competitionInitiateInfo.inviterPrompt = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        competitionInitiateInfo.performanceDurationSec = c1516680pZS.LJIIJJI();
                    }
                } else {
                    competitionInitiateInfo.performanceOrder.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionInitiateInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionPlatformMessage.CompetitionInitiateInfo competitionInitiateInfo) {
        CompetitionPlatformMessage.CompetitionInitiateInfo competitionInitiateInfo2 = competitionInitiateInfo;
        if (competitionInitiateInfo2.performanceOrder == null) {
            competitionInitiateInfo2.performanceOrder = new ArrayList();
        }
        Text text = competitionInitiateInfo2.inviterPrompt;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final CompetitionPlatformMessage.CompetitionInitiateInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionPlatformMessage.CompetitionInitiateInfo competitionInitiateInfo, List list) {
    }
}
