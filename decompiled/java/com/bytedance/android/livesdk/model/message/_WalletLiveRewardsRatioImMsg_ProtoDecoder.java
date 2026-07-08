package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WalletLiveRewardsRatioImMsg_ProtoDecoder implements C0IMD<WalletLiveRewardsRatioImMsg> {
    public static WalletLiveRewardsRatioImMsg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WalletLiveRewardsRatioImMsg walletLiveRewardsRatioImMsg = new WalletLiveRewardsRatioImMsg();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        walletLiveRewardsRatioImMsg.notificationData = _WalletLiveRewardsRatioImMsgNotification_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    walletLiveRewardsRatioImMsg.msgType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return walletLiveRewardsRatioImMsg;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WalletLiveRewardsRatioImMsg walletLiveRewardsRatioImMsg) {
    }

    @Override // X.C0IMD
    public final WalletLiveRewardsRatioImMsg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WalletLiveRewardsRatioImMsg walletLiveRewardsRatioImMsg, List list) {
    }
}
