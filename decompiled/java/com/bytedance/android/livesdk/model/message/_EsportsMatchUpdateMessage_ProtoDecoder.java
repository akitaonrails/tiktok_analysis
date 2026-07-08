package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.EsportsMatchUpdateMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EsportsMatchUpdateMessage_ProtoDecoder implements C0IMD<EsportsMatchUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(EsportsMatchUpdateMessage esportsMatchUpdateMessage) {
        EsportsMatchUpdateMessage esportsMatchUpdateMessage2 = esportsMatchUpdateMessage;
        CommonMessageData commonMessageData = esportsMatchUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<EsportsMatchUpdateMessage.MatchInfo> list = esportsMatchUpdateMessage2.matchList;
        if (list == null) {
            esportsMatchUpdateMessage2.matchList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EsportsMatchUpdateMessage.MatchInfo matchInfo : esportsMatchUpdateMessage2.matchList) {
            if (matchInfo != null) {
                _EsportsMatchUpdateMessage_MatchInfo_ProtoDecoder.LJ(matchInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final EsportsMatchUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EsportsMatchUpdateMessage esportsMatchUpdateMessage = new EsportsMatchUpdateMessage();
        esportsMatchUpdateMessage.matchList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        esportsMatchUpdateMessage.matchList.add(_EsportsMatchUpdateMessage_MatchInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    esportsMatchUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return esportsMatchUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EsportsMatchUpdateMessage esportsMatchUpdateMessage, List list) {
    }
}
