package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PictionaryStatistics_ProtoDecoder implements C0IMD<PictionaryStatistics> {
    public static PictionaryStatistics LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PictionaryStatistics pictionaryStatistics = new PictionaryStatistics();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            pictionaryStatistics.firstUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        pictionaryStatistics.guessTotalPv = c1516680pZS.LJIIJJI();
                    }
                } else {
                    pictionaryStatistics.guessCorrectUv = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pictionaryStatistics;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PictionaryStatistics pictionaryStatistics) {
        User user = pictionaryStatistics.firstUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final PictionaryStatistics LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PictionaryStatistics pictionaryStatistics, List list) {
    }
}
