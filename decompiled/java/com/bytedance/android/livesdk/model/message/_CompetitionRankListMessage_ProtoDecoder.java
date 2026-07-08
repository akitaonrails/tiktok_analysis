package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.MemberRankInfo;
import com.bytedance.android.live.liveinteract.competition.model._MemberRankInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionRankListMessage_ProtoDecoder implements C0IMD<CompetitionRankListMessage> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionRankListMessage competitionRankListMessage) {
        CompetitionRankListMessage competitionRankListMessage2 = competitionRankListMessage;
        CommonMessageData commonMessageData = competitionRankListMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<MemberRankInfo> list = competitionRankListMessage2.memberRankInfo;
        if (list == null) {
            competitionRankListMessage2.memberRankInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<MemberRankInfo> it2 = competitionRankListMessage2.memberRankInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<AnnouncementEvent> list2 = competitionRankListMessage2.annonuncementEvents;
        if (list2 == null) {
            competitionRankListMessage2.annonuncementEvents = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<AnnouncementEvent> it3 = competitionRankListMessage2.annonuncementEvents.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionRankListMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionRankListMessage competitionRankListMessage = new CompetitionRankListMessage();
        competitionRankListMessage.memberRankInfo = new ArrayList();
        competitionRankListMessage.annonuncementEvents = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        competitionRankListMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        competitionRankListMessage.hostUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        competitionRankListMessage.dataVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        competitionRankListMessage.competitionId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        competitionRankListMessage.memberRankInfo.add(_MemberRankInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        competitionRankListMessage.annonuncementEvents.add(_AnnouncementEvent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionRankListMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionRankListMessage competitionRankListMessage, List list) {
    }
}
