package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model._PlayTogetherBasicInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlayTogetherWidgetsData_ProtoDecoder implements C0IMD<PlayTogetherWidgetsData> {
    public static PlayTogetherWidgetsData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherWidgetsData playTogetherWidgetsData = new PlayTogetherWidgetsData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        playTogetherWidgetsData.basicInfo = _PlayTogetherBasicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    playTogetherWidgetsData.messageType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherWidgetsData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PlayTogetherWidgetsData playTogetherWidgetsData) {
    }

    @Override // X.C0IMD
    public final PlayTogetherWidgetsData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherWidgetsData playTogetherWidgetsData, List list) {
    }
}
