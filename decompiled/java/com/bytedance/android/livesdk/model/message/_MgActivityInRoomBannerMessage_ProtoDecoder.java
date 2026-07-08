package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MgActivityInRoomBannerMessage_ProtoDecoder implements C0IMD<MgActivityInRoomBannerMessage> {
    @Override // X.C0IMD
    public final void LIZ(MgActivityInRoomBannerMessage mgActivityInRoomBannerMessage) {
        MgActivityInRoomBannerMessage mgActivityInRoomBannerMessage2 = mgActivityInRoomBannerMessage;
        CommonMessageData commonMessageData = mgActivityInRoomBannerMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        MgActivityBannerContent mgActivityBannerContent = mgActivityInRoomBannerMessage2.content;
        if (mgActivityBannerContent != null) {
            _MgActivityBannerContent_ProtoDecoder.LJ(mgActivityBannerContent);
        }
    }

    @Override // X.C0IMD
    public final MgActivityInRoomBannerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MgActivityInRoomBannerMessage mgActivityInRoomBannerMessage = new MgActivityInRoomBannerMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        mgActivityInRoomBannerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        mgActivityInRoomBannerMessage.content = _MgActivityBannerContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        mgActivityInRoomBannerMessage.featureType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        mgActivityInRoomBannerMessage.featureName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        mgActivityInRoomBannerMessage.stateName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        mgActivityInRoomBannerMessage.stateId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mgActivityInRoomBannerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MgActivityInRoomBannerMessage mgActivityInRoomBannerMessage, List list) {
    }
}
