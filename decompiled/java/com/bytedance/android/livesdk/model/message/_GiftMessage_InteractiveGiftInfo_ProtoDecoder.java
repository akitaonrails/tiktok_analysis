package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMessage_InteractiveGiftInfo_ProtoDecoder implements C0IMD<GiftMessage.InteractiveGiftInfo> {
    public static GiftMessage.InteractiveGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo = new GiftMessage.InteractiveGiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        interactiveGiftInfo.crossScreenDelay = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        interactiveGiftInfo.crossScreenRole = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        interactiveGiftInfo.ignoreConfig = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        interactiveGiftInfo.uniqId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        interactiveGiftInfo.toUserTeamId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        interactiveGiftInfo.ignoreComponent = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return interactiveGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftMessage.InteractiveGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftMessage.InteractiveGiftInfo interactiveGiftInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftMessage.InteractiveGiftInfo interactiveGiftInfo, List list) {
    }
}
