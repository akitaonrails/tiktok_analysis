package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipGameOfflineMessage_ProtoDecoder implements C0IMD<PartnershipGameOfflineMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipGameOfflineMessage partnershipGameOfflineMessage) {
        PartnershipGameOfflineMessage partnershipGameOfflineMessage2 = partnershipGameOfflineMessage;
        CommonMessageData commonMessageData = partnershipGameOfflineMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<PartnershipGameOfflineMessage.OfflineGameInfo> list = partnershipGameOfflineMessage2.offlineGameList;
        if (list == null) {
            partnershipGameOfflineMessage2.offlineGameList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PartnershipGameOfflineMessage.OfflineGameInfo> it2 = partnershipGameOfflineMessage2.offlineGameList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final PartnershipGameOfflineMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipGameOfflineMessage partnershipGameOfflineMessage = new PartnershipGameOfflineMessage();
        partnershipGameOfflineMessage.offlineGameList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        partnershipGameOfflineMessage.offlineGameList.add(_PartnershipGameOfflineMessage_OfflineGameInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    partnershipGameOfflineMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipGameOfflineMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipGameOfflineMessage partnershipGameOfflineMessage, List list) {
    }
}
