package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollUpdateVotesContent_ProtoDecoder implements C0IMD<PollUpdateVotesContent> {
    public static PollUpdateVotesContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
        pollUpdateVotesContent.optionList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    if (iLJI != 3) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        pollUpdateVotesContent.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    pollUpdateVotesContent.optionList.add(_PollOptionInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollUpdateVotesContent;
            }
        }
    }

    public static void LJ(PollUpdateVotesContent pollUpdateVotesContent) {
        List<PollOptionInfo> list = pollUpdateVotesContent.optionList;
        if (list == null) {
            pollUpdateVotesContent.optionList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PollOptionInfo pollOptionInfo : pollUpdateVotesContent.optionList) {
                if (pollOptionInfo != null) {
                    _PollOptionInfo_ProtoDecoder.LJ(pollOptionInfo);
                }
            }
        }
        User user = pollUpdateVotesContent.operator;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollUpdateVotesContent pollUpdateVotesContent) {
        LJ(pollUpdateVotesContent);
    }

    @Override // X.C0IMD
    public final PollUpdateVotesContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollUpdateVotesContent pollUpdateVotesContent, List list) {
    }
}
