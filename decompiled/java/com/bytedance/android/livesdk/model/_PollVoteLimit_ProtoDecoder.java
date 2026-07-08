package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollVoteLimit_ProtoDecoder implements C0IMD<PollVoteLimit> {
    public static PollVoteLimit LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollVoteLimit pollVoteLimit = new PollVoteLimit();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        pollVoteLimit.voteCountLimit = c1516680pZS.LJIIJJI();
                    }
                } else {
                    pollVoteLimit.limitType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollVoteLimit;
            }
        }
    }

    @Override // X.C0IMD
    public final PollVoteLimit LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PollVoteLimit pollVoteLimit) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollVoteLimit pollVoteLimit, List list) {
    }
}
