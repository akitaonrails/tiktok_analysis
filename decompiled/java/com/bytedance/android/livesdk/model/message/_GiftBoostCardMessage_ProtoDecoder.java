package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftBoostCardMessage_ProtoDecoder implements C0IMD<GiftBoostCardMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftBoostCardMessage giftBoostCardMessage) {
        GiftBoostCardMessage giftBoostCardMessage2 = giftBoostCardMessage;
        CommonMessageData commonMessageData = giftBoostCardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<BoostCard> list = giftBoostCardMessage2.mCards;
        if (list == null) {
            giftBoostCardMessage2.mCards = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BoostCard> it2 = giftBoostCardMessage2.mCards.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final GiftBoostCardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftBoostCardMessage giftBoostCardMessage = new GiftBoostCardMessage();
        giftBoostCardMessage.mCards = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftBoostCardMessage.mCards.add(_BoostCard_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    giftBoostCardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftBoostCardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftBoostCardMessage giftBoostCardMessage, List list) {
    }
}
