package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PopularCardMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PopularCardMessage_PopularCardInfo_ProtoDecoder implements C0IMD<PopularCardMessage.PopularCardInfo> {
    public static PopularCardMessage.PopularCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopularCardMessage.PopularCardInfo popularCardInfo = new PopularCardMessage.PopularCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            popularCardInfo.enterNumber = c1516680pZS.LJIIJ();
                        }
                    } else {
                        popularCardInfo.endTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    popularCardInfo.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popularCardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PopularCardMessage.PopularCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PopularCardMessage.PopularCardInfo popularCardInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopularCardMessage.PopularCardInfo popularCardInfo, List list) {
    }
}
