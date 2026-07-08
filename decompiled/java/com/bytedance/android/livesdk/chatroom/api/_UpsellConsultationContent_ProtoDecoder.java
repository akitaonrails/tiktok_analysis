package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpsellConsultationContent_ProtoDecoder implements C0IMD<UpsellConsultationContent> {
    public static UpsellConsultationContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UpsellConsultationContent upsellConsultationContent = new UpsellConsultationContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        upsellConsultationContent.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        upsellConsultationContent.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        upsellConsultationContent.createTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        upsellConsultationContent.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        upsellConsultationContent.autoReply = _UpsellConsultationAutoReply_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        upsellConsultationContent.leadsForm = _LeadsForm_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return upsellConsultationContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UpsellConsultationContent upsellConsultationContent) {
    }

    @Override // X.C0IMD
    public final UpsellConsultationContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpsellConsultationContent upsellConsultationContent, List list) {
    }
}
