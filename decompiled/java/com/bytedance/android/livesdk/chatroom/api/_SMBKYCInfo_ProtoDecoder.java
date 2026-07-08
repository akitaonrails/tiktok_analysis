package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBKYCInfo_ProtoDecoder implements C0IMD<SMBKYCInfo> {
    public static SMBKYCInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBKYCInfo sMBKYCInfo = new SMBKYCInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sMBKYCInfo.userId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        sMBKYCInfo.enabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        sMBKYCInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        sMBKYCInfo.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        sMBKYCInfo.updateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        sMBKYCInfo.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        sMBKYCInfo.identificationType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBKYCInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SMBKYCInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SMBKYCInfo sMBKYCInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBKYCInfo sMBKYCInfo, List list) {
    }
}
