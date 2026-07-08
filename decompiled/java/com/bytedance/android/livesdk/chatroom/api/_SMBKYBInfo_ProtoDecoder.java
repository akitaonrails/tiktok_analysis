package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBKYBInfo_ProtoDecoder implements C0IMD<SMBKYBInfo> {
    public static SMBKYBInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBKYBInfo sMBKYBInfo = new SMBKYBInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sMBKYBInfo.userId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        sMBKYBInfo.enabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        sMBKYBInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        sMBKYBInfo.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        sMBKYBInfo.updateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        sMBKYBInfo.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        sMBKYBInfo.identification = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBKYBInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SMBKYBInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SMBKYBInfo sMBKYBInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBKYBInfo sMBKYBInfo, List list) {
    }
}
