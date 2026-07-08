package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftNotice;
import com.bytedance.android.livesdk.gift.model._GiftNotice_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftNoticeMessage_ProtoDecoder implements C0IMD<GiftNoticeMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftNoticeMessage giftNoticeMessage) {
        ImageModel imageModel;
        GiftNoticeMessage giftNoticeMessage2 = giftNoticeMessage;
        CommonMessageData commonMessageData = giftNoticeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GiftNotice giftNotice = giftNoticeMessage2.giftNotice;
        if (giftNotice != null && (imageModel = giftNotice.effect) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiftNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftNoticeMessage giftNoticeMessage = new GiftNoticeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftNoticeMessage.giftNotice = _GiftNotice_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftNoticeMessage giftNoticeMessage, List list) {
    }
}
