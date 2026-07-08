package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _VerificationWarningInfo_ProtoDecoder implements C0IMD<VerificationWarningInfo> {
    public static VerificationWarningInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VerificationWarningInfo verificationWarningInfo = new VerificationWarningInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        verificationWarningInfo.hasWarning = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        verificationWarningInfo.warningType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        verificationWarningInfo.bubbleText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        verificationWarningInfo.schemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        verificationWarningInfo.leadUserCount7d = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        verificationWarningInfo.firstWarningTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        verificationWarningInfo.expectRevokeTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        verificationWarningInfo.actualRevokeTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        verificationWarningInfo.endLivePageTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        verificationWarningInfo.endLivePageDesc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        verificationWarningInfo.endLivePageSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        verificationWarningInfo.dayToRevoke = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return verificationWarningInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final VerificationWarningInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(VerificationWarningInfo verificationWarningInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VerificationWarningInfo verificationWarningInfo, List list) {
    }
}
