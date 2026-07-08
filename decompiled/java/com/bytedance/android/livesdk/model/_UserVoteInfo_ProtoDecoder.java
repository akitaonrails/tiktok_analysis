package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserVoteInfo_ProtoDecoder implements C0IMD<UserVoteInfo> {
    public static UserVoteInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserVoteInfo userVoteInfo = new UserVoteInfo();
        userVoteInfo.voteOptionList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userVoteInfo.voteOptionList.add(_UserVoteOptionInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        userVoteInfo.voteOptionIndex = (int) c1516680pZS.LJIIJJI();
                    }
                } else {
                    userVoteInfo.hasVoted = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userVoteInfo;
            }
        }
    }

    public static void LJ(UserVoteInfo userVoteInfo) {
        List<UserVoteOptionInfo> list = userVoteInfo.voteOptionList;
        if (list == null) {
            userVoteInfo.voteOptionList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UserVoteOptionInfo> it2 = userVoteInfo.voteOptionList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserVoteInfo userVoteInfo) {
        LJ(userVoteInfo);
    }

    @Override // X.C0IMD
    public final UserVoteInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserVoteInfo userVoteInfo, List list) {
    }
}
