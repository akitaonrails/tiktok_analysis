package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WalletLiveRewardsRatioImMsgNotification_ProtoDecoder implements C0IMD<WalletLiveRewardsRatioImMsgNotification> {
    public static WalletLiveRewardsRatioImMsgNotification LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WalletLiveRewardsRatioImMsgNotification walletLiveRewardsRatioImMsgNotification = new WalletLiveRewardsRatioImMsgNotification();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            walletLiveRewardsRatioImMsgNotification.showIcon = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        walletLiveRewardsRatioImMsgNotification.isIncrease = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    walletLiveRewardsRatioImMsgNotification.displayText = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return walletLiveRewardsRatioImMsgNotification;
            }
        }
    }

    @Override // X.C0IMD
    public final WalletLiveRewardsRatioImMsgNotification LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(WalletLiveRewardsRatioImMsgNotification walletLiveRewardsRatioImMsgNotification) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WalletLiveRewardsRatioImMsgNotification walletLiveRewardsRatioImMsgNotification, List list) {
    }
}
