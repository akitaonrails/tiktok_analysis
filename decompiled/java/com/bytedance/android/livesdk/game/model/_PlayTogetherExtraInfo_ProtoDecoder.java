package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlayTogetherExtraInfo_ProtoDecoder implements C0IMD<PlayTogetherExtraInfo> {
    public static PlayTogetherExtraInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherExtraInfo playTogetherExtraInfo = new PlayTogetherExtraInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    playTogetherExtraInfo.lastPickedTimeStr = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherExtraInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PlayTogetherExtraInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlayTogetherExtraInfo playTogetherExtraInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherExtraInfo playTogetherExtraInfo, List list) {
    }
}
