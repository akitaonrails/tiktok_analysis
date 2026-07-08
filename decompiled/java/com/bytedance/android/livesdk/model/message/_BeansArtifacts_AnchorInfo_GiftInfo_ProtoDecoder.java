package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.BeansArtifacts;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BeansArtifacts_AnchorInfo_GiftInfo_ProtoDecoder implements C0IMD<BeansArtifacts.AnchorInfo.GiftInfo> {
    public static BeansArtifacts.AnchorInfo.GiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BeansArtifacts.AnchorInfo.GiftInfo giftInfo = new BeansArtifacts.AnchorInfo.GiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                giftInfo.numberBeans = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            giftInfo.coinsPerGift = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftInfo.numberGifts = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftInfo.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BeansArtifacts.AnchorInfo.GiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BeansArtifacts.AnchorInfo.GiftInfo giftInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BeansArtifacts.AnchorInfo.GiftInfo giftInfo, List list) {
    }
}
