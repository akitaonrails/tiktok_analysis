package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftUnlockMessage_ProtoDecoder implements C0IMD<GiftUnlockMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftUnlockMessage giftUnlockMessage) {
        GiftUnlockMessage giftUnlockMessage2 = giftUnlockMessage;
        CommonMessageData commonMessageData = giftUnlockMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<Gift> list = giftUnlockMessage2.gifts;
        if (list == null) {
            giftUnlockMessage2.gifts = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Gift gift : giftUnlockMessage2.gifts) {
                if (gift != null) {
                    _Gift_ProtoDecoder.LJ(gift);
                }
            }
        }
        Text text = giftUnlockMessage2.bubbleText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        StyleDictateParams styleDictateParams = giftUnlockMessage2.styleDictateParams;
        if (styleDictateParams != null) {
            _StyleDictateParams_ProtoDecoder.LJ(styleDictateParams);
        }
    }

    @Override // X.C0IMD
    public final GiftUnlockMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftUnlockMessage giftUnlockMessage = new GiftUnlockMessage();
        giftUnlockMessage.gifts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 18) {
                                if (iLJI != 19) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    giftUnlockMessage.styleDictateParams = _StyleDictateParams_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                giftUnlockMessage.styleDictate = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            giftUnlockMessage.bubbleText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftUnlockMessage.gifts.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    giftUnlockMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftUnlockMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftUnlockMessage giftUnlockMessage, List list) {
    }
}
