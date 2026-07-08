package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageOrderInfo;
import com.bytedance.android.live.liveinteract.competition.model._TakeTheStageOrderInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.CompetitionScoreChange;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionScoreChange_TakeTheStageBiz_ProtoDecoder implements C0IMD<CompetitionScoreChange.TakeTheStageBiz> {
    public static CompetitionScoreChange.TakeTheStageBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionScoreChange.TakeTheStageBiz takeTheStageBiz = new CompetitionScoreChange.TakeTheStageBiz();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            takeTheStageBiz.orderInfo = _TakeTheStageOrderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        takeTheStageBiz.performanceStartTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    takeTheStageBiz.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageBiz;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionScoreChange.TakeTheStageBiz takeTheStageBiz) {
        TakeTheStageOrderInfo takeTheStageOrderInfo = takeTheStageBiz.orderInfo;
        if (takeTheStageOrderInfo != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final CompetitionScoreChange.TakeTheStageBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionScoreChange.TakeTheStageBiz takeTheStageBiz, List list) {
    }
}
