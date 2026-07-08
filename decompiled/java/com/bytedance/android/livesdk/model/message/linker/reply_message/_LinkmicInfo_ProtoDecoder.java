package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicInfo_ProtoDecoder implements C0IMD<LinkmicInfo> {
    public static LinkmicInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicInfo linkmicInfo = new LinkmicInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkmicInfo.accessKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkmicInfo.linkmicId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkmicInfo.joinable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        linkmicInfo.confluenceType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        linkmicInfo.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkmicInfo.rtcAppId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkmicInfo.rtcAppSign = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkmicInfo.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkmicInfo.vendor = (int) c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkmicInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkmicInfo linkmicInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicInfo linkmicInfo, List list) {
    }
}
