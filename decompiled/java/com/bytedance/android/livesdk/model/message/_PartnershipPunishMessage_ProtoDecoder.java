package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipPunishMessage_ProtoDecoder implements C0IMD<PartnershipPunishMessage> {
    @Override // X.C0IMD
    public final void LIZ(PartnershipPunishMessage partnershipPunishMessage) {
        CommonMessageData commonMessageData = partnershipPunishMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final PartnershipPunishMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PartnershipPunishMessage partnershipPunishMessage = new PartnershipPunishMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        partnershipPunishMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    partnershipPunishMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipPunishMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipPunishMessage partnershipPunishMessage, List list) {
    }
}
