package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BaseSyncMessage_ProtoDecoder implements C0IMD<BaseSyncMessage> {
    @Override // X.C0IMD
    public final void LIZ(BaseSyncMessage baseSyncMessage) {
    }

    @Override // X.C0IMD
    public final BaseSyncMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BaseSyncMessage baseSyncMessage = new BaseSyncMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        baseSyncMessage.common = _Common_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        baseSyncMessage.methodType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        baseSyncMessage.group = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        baseSyncMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        baseSyncMessage.dataType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        baseSyncMessage.data = c1516680pZS.LJII();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return baseSyncMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BaseSyncMessage baseSyncMessage, List list) {
    }
}
