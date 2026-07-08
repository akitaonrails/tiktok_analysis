package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpsellConsultationAutoReply_ProtoDecoder implements C0IMD<UpsellConsultationAutoReply> {
    public static UpsellConsultationAutoReply LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UpsellConsultationAutoReply upsellConsultationAutoReply = new UpsellConsultationAutoReply();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    upsellConsultationAutoReply.replyContent = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return upsellConsultationAutoReply;
            }
        }
    }

    @Override // X.C0IMD
    public final UpsellConsultationAutoReply LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UpsellConsultationAutoReply upsellConsultationAutoReply) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpsellConsultationAutoReply upsellConsultationAutoReply, List list) {
    }
}
