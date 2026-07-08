package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsListExtra_LogPbBean_ProtoDecoder implements C0IMD<RivalsListExtra.LogPbBean> {
    public static RivalsListExtra.LogPbBean LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsListExtra.LogPbBean logPbBean = new RivalsListExtra.LogPbBean();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        logPbBean.clientLogId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    logPbBean.imprId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return logPbBean;
            }
        }
    }

    @Override // X.C0IMD
    public final RivalsListExtra.LogPbBean LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RivalsListExtra.LogPbBean logPbBean) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsListExtra.LogPbBean logPbBean, List list) {
    }
}
