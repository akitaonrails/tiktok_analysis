package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerUpdateMessage_ProtoDecoder implements C0IMD<BannerUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(BannerUpdateMessage bannerUpdateMessage) {
        BannerUpdateMessage bannerUpdateMessage2 = bannerUpdateMessage;
        CommonMessageData commonMessageData = bannerUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        BannerInRoomCollection bannerInRoomCollection = bannerUpdateMessage2.data;
        if (bannerInRoomCollection != null) {
            _BannerInRoomCollection_ProtoDecoder.LJ(bannerInRoomCollection);
        }
    }

    @Override // X.C0IMD
    public final BannerUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BannerUpdateMessage bannerUpdateMessage = new BannerUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            bannerUpdateMessage.data = _BannerInRoomCollection_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bannerUpdateMessage.position = Integer.valueOf(c1516680pZS.LJIIJ());
                    }
                } else {
                    bannerUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerUpdateMessage bannerUpdateMessage, List list) {
    }
}
