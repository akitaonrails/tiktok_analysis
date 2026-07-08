package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionResultsTeamInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionContributorMessage_ProtoDecoder implements C0IMD<CompetitionContributorMessage> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionContributorMessage competitionContributorMessage) {
        CompetitionContributorMessage competitionContributorMessage2 = competitionContributorMessage;
        CommonMessageData commonMessageData = competitionContributorMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<CompetitionResultsTeamInfo> list = competitionContributorMessage2.teamInfos;
        if (list == null) {
            competitionContributorMessage2.teamInfos = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionContributorMessage2.teamInfos) {
            if (competitionResultsTeamInfo != null) {
                _CompetitionResultsTeamInfo_ProtoDecoder.LJ(competitionResultsTeamInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionContributorMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionContributorMessage competitionContributorMessage = new CompetitionContributorMessage();
        competitionContributorMessage.teamInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    competitionContributorMessage.teamInfos.add(_CompetitionResultsTeamInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                competitionContributorMessage.competitionId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            competitionContributorMessage.channelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        competitionContributorMessage.battleType = c1516680pZS.LJIIJ();
                    }
                } else {
                    competitionContributorMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionContributorMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionContributorMessage competitionContributorMessage, List list) {
    }
}
