package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftInfoInBox_ProtoDecoder implements C0IMD<GiftInfoInBox> {
    public static GiftInfoInBox LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftInfoInBox giftInfoInBox = new GiftInfoInBox();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    giftInfoInBox.asset = _AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                giftInfoInBox.remainTimes = c1516680pZS.LJIIJ();
                            }
                        } else {
                            giftInfoInBox.colorId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftInfoInBox.effectId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftInfoInBox.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftInfoInBox;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftInfoInBox giftInfoInBox) {
        AssetsModel assetsModel = giftInfoInBox.asset;
        if (assetsModel != null) {
            _AssetsModel_ProtoDecoder.LJ(assetsModel);
        }
    }

    @Override // X.C0IMD
    public final GiftInfoInBox LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftInfoInBox giftInfoInBox, List list) {
    }
}
