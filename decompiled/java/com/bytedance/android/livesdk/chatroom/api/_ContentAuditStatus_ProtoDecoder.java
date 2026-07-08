package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class _ContentAuditStatus_ProtoDecoder implements C0IMD<ContentAuditStatus> {
    public static ContentAuditStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ContentAuditStatus contentAuditStatus = new ContentAuditStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        contentAuditStatus.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        contentAuditStatus.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        contentAuditStatus.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        contentAuditStatus.violationId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        contentAuditStatus.piiContentType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        contentAuditStatus.isDefaultContent = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contentAuditStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final ContentAuditStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ContentAuditStatus contentAuditStatus) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ContentAuditStatus contentAuditStatus, List list) {
    }
}
