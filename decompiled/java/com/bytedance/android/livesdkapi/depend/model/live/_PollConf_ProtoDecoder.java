package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollConf_ProtoDecoder implements C0IMD<PollConf> {
    public static PollConf LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollConf pollConf = new PollConf();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            pollConf.pollTemplateOptimizeGroup = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        pollConf.useNewGiftPoll = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    pollConf.giftPollLimit = _PollCountLimit_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollConf;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollConf pollConf) {
    }

    @Override // X.C0IMD
    public final PollConf LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollConf pollConf, List list) {
    }
}
