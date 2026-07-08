package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageOrderInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionResultsTeamInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._TakeTheStageOrderInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.CompetitionScoreChange;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleEffectInfos_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionScoreChange_ProtoDecoder implements C0IMD<CompetitionScoreChange> {
    public static CompetitionScoreChange LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionScoreChange competitionScoreChange = new CompetitionScoreChange();
        competitionScoreChange.teamInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 50) {
                            if (iLJI != 100) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                competitionScoreChange.takeTheStageBiz = _CompetitionScoreChange_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            competitionScoreChange.effectInfos = _BattleEffectInfos_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        competitionScoreChange.triggerReason = c1516680pZS.LJIIJ();
                    }
                } else {
                    competitionScoreChange.teamInfos.add(_CompetitionResultsTeamInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionScoreChange;
            }
        }
    }

    public static void LJ(CompetitionScoreChange competitionScoreChange) {
        TakeTheStageOrderInfo takeTheStageOrderInfo;
        List<CompetitionResultsTeamInfo> list = competitionScoreChange.teamInfos;
        if (list == null) {
            competitionScoreChange.teamInfos = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionScoreChange.teamInfos) {
                if (competitionResultsTeamInfo != null) {
                    _CompetitionResultsTeamInfo_ProtoDecoder.LJ(competitionResultsTeamInfo);
                }
            }
        }
        BattleEffectInfos battleEffectInfos = competitionScoreChange.effectInfos;
        if (battleEffectInfos != null) {
            _BattleEffectInfos_ProtoDecoder.LJ(battleEffectInfos);
        }
        CompetitionScoreChange.TakeTheStageBiz takeTheStageBiz = competitionScoreChange.takeTheStageBiz;
        if (takeTheStageBiz != null && (takeTheStageOrderInfo = takeTheStageBiz.orderInfo) != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionScoreChange competitionScoreChange) {
        LJ(competitionScoreChange);
    }

    @Override // X.C0IMD
    public final CompetitionScoreChange LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionScoreChange competitionScoreChange, List list) {
    }
}
