package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FinishChannelContent_ProtoDecoder implements C0IMD<FinishChannelContent> {
    public static FinishChannelContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FinishChannelContent finishChannelContent = new FinishChannelContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        finishChannelContent.finishReason = c1516680pZS.LJIIJJI();
                    }
                } else {
                    finishChannelContent.owner = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return finishChannelContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FinishChannelContent finishChannelContent) {
    }

    @Override // X.C0IMD
    public final FinishChannelContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FinishChannelContent finishChannelContent, List list) {
    }
}
