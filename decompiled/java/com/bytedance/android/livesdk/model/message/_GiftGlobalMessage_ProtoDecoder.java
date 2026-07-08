package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftGlobalMessage_ProtoDecoder implements C0IMD<GiftGlobalMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftGlobalMessage giftGlobalMessage) {
        GiftGlobalMessage giftGlobalMessage2 = giftGlobalMessage;
        CommonMessageData commonMessageData = giftGlobalMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = giftGlobalMessage2.mLeftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        RoomNotifyMessage roomNotifyMessage = giftGlobalMessage2.mNotifyMessage;
        if (roomNotifyMessage != null) {
            _RoomNotifyMessage_ProtoDecoder.LJ(roomNotifyMessage);
        }
    }

    @Override // X.C0IMD
    public final GiftGlobalMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftGlobalMessage giftGlobalMessage = new GiftGlobalMessage();
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
                                giftGlobalMessage.mNotifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftGlobalMessage.mLeftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftGlobalMessage.mFromUserId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftGlobalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGlobalMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftGlobalMessage giftGlobalMessage, List list) {
    }
}
