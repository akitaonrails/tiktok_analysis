package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _PunishEventInfo_ProtoDecoder implements C0IMD<PunishEventInfo> {
    public static PunishEventInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PunishEventInfo punishEventInfo = new PunishEventInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        punishEventInfo.punishType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        punishEventInfo.punishReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        punishEventInfo.punishId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        punishEventInfo.violationUid = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        punishEventInfo.punishTypeId = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 6:
                        punishEventInfo.duration = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        punishEventInfo.punishPerceptionCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        punishEventInfo.violationUidStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        punishEventInfo.showReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        punishEventInfo.endTimeV2 = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return punishEventInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PunishEventInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PunishEventInfo punishEventInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PunishEventInfo punishEventInfo, List list) {
    }
}
