package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollInfo_ProtoDecoder implements C0IMD<PollInfo> {
    public static PollInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollInfo pollInfo = new PollInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        pollInfo.userVoteInfo = _UserVoteInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    pollInfo.pollData = _PollData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollInfo pollInfo) {
        PollInfo pollInfo2 = pollInfo;
        PollData pollData = pollInfo2.pollData;
        if (pollData != null) {
            _PollData_ProtoDecoder.LJ(pollData);
        }
        UserVoteInfo userVoteInfo = pollInfo2.userVoteInfo;
        if (userVoteInfo != null) {
            _UserVoteInfo_ProtoDecoder.LJ(userVoteInfo);
        }
    }

    @Override // X.C0IMD
    public final PollInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollInfo pollInfo, List list) {
    }
}
