package com.bytedance.android.livesdk.model.message;

import X.C004W;
import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InRoomBannerMessage_ProtoDecoder implements C0IMD<InRoomBannerMessage> {
    @Override // X.C0IMD
    public final void LIZ(InRoomBannerMessage inRoomBannerMessage) {
        CommonMessageData commonMessageData = inRoomBannerMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final InRoomBannerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        InRoomBannerMessage inRoomBannerMessage = new InRoomBannerMessage();
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
                                inRoomBannerMessage.actionType = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        } else {
                            inRoomBannerMessage.position = c1516680pZS.LJIIJ();
                        }
                    } else {
                        inRoomBannerMessage.extra = GsonProtectorUtils.parse(C004W.LIZ, C1516700pZU.LIZLLL(c1516680pZS)).LJIILIIL();
                    }
                } else {
                    inRoomBannerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inRoomBannerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InRoomBannerMessage inRoomBannerMessage, List list) {
    }
}
