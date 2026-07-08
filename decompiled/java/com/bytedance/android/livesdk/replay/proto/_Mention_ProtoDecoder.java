package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Mention_ProtoDecoder implements C0IMD<Mention> {
    public static Mention LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Mention mention = new Mention();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        mention.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    mention.userId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mention;
            }
        }
    }

    @Override // X.C0IMD
    public final Mention LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Mention mention) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Mention mention, List list) {
    }
}
