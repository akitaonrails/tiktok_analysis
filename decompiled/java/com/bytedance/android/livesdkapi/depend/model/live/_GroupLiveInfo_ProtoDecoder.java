package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLiveInfo_ProtoDecoder implements C0IMD<GroupLiveInfo> {
    public static GroupLiveInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupLiveInfo groupLiveInfo = new GroupLiveInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    groupLiveInfo.groupShow = _CompetitionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLiveInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupLiveInfo groupLiveInfo) {
        CompetitionInfo competitionInfo = groupLiveInfo.groupShow;
        if (competitionInfo != null) {
            _CompetitionInfo_ProtoDecoder.LJ(competitionInfo);
        }
    }

    @Override // X.C0IMD
    public final GroupLiveInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLiveInfo groupLiveInfo, List list) {
    }
}
