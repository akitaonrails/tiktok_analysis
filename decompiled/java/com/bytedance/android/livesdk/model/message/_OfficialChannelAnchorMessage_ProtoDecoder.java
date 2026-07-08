package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OfficialChannelAnchorMessage_ProtoDecoder implements C0IMD<OfficialChannelAnchorMessage> {
    @Override // X.C0IMD
    public final void LIZ(OfficialChannelAnchorMessage officialChannelAnchorMessage) {
        CommonMessageData commonMessageData = officialChannelAnchorMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final OfficialChannelAnchorMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OfficialChannelAnchorMessage officialChannelAnchorMessage = new OfficialChannelAnchorMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        officialChannelAnchorMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        officialChannelAnchorMessage.startTimeStamp = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        officialChannelAnchorMessage.endTimeStamp = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        officialChannelAnchorMessage.roleType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        officialChannelAnchorMessage.existLinkmic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        officialChannelAnchorMessage.linkmicType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return officialChannelAnchorMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OfficialChannelAnchorMessage officialChannelAnchorMessage, List list) {
    }
}
