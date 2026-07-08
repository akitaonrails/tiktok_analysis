package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OfficialChannelModifyMessage_ProtoDecoder implements C0IMD<OfficialChannelModifyMessage> {
    @Override // X.C0IMD
    public final void LIZ(OfficialChannelModifyMessage officialChannelModifyMessage) {
        CommonMessageData commonMessageData = officialChannelModifyMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final OfficialChannelModifyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OfficialChannelModifyMessage officialChannelModifyMessage = new OfficialChannelModifyMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            officialChannelModifyMessage.channelUid = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        officialChannelModifyMessage.endTimeStamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    officialChannelModifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return officialChannelModifyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OfficialChannelModifyMessage officialChannelModifyMessage, List list) {
    }
}
