package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftGalleryMessage_GiftInfo_ProtoDecoder implements C0IMD<GiftGalleryMessage.GiftInfo> {
    public static GiftGalleryMessage.GiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftGalleryMessage.GiftInfo giftInfo = new GiftGalleryMessage.GiftInfo();
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
                                giftInfo.unlightedGiftIcon = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftInfo.gift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftInfo.highValue = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    giftInfo.lightedUpGiftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftGalleryMessage.GiftInfo giftInfo) {
        Gift gift = giftInfo.gift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final GiftGalleryMessage.GiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftGalleryMessage.GiftInfo giftInfo, List list) {
    }
}
