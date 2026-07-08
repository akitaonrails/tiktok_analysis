package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftCollectionUpdateMessage_ProtoDecoder implements C0IMD<GiftCollectionUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftCollectionUpdateMessage giftCollectionUpdateMessage) {
        Gift gift;
        GiftCollectionUpdateMessage giftCollectionUpdateMessage2 = giftCollectionUpdateMessage;
        CommonMessageData commonMessageData = giftCollectionUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GiftCollection giftCollection = giftCollectionUpdateMessage2.giftCollection;
        if (giftCollection != null && (gift = giftCollection.gift) != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final GiftCollectionUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftCollectionUpdateMessage giftCollectionUpdateMessage = new GiftCollectionUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftCollectionUpdateMessage.giftCollection = _GiftCollection_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftCollectionUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftCollectionUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftCollectionUpdateMessage giftCollectionUpdateMessage, List list) {
    }
}
