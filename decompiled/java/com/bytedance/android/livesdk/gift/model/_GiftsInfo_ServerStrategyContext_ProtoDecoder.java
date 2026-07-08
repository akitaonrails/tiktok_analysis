package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_ServerStrategyContext_ProtoDecoder implements C0IMD<GiftsInfo.ServerStrategyContext> {
    public static GiftsInfo.ServerStrategyContext LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.ServerStrategyContext serverStrategyContext = new GiftsInfo.ServerStrategyContext();
        serverStrategyContext.previousSentGiftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    serverStrategyContext.previousSentGiftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return serverStrategyContext;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftsInfo.ServerStrategyContext serverStrategyContext) {
        GiftsInfo.ServerStrategyContext serverStrategyContext2 = serverStrategyContext;
        if (serverStrategyContext2.previousSentGiftIds == null) {
            serverStrategyContext2.previousSentGiftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.ServerStrategyContext LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.ServerStrategyContext serverStrategyContext, List list) {
    }
}
