package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBIndustryVerificationInfo_ProtoDecoder implements C0IMD<SMBIndustryVerificationInfo> {
    public static SMBIndustryVerificationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo = new SMBIndustryVerificationInfo();
        sMBIndustryVerificationInfo.blockedReasons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sMBIndustryVerificationInfo.enabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        sMBIndustryVerificationInfo.industryEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        sMBIndustryVerificationInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        sMBIndustryVerificationInfo.rejectionReasonCode = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        sMBIndustryVerificationInfo.industryL2Type = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        sMBIndustryVerificationInfo.canAppeal = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        sMBIndustryVerificationInfo.source = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        sMBIndustryVerificationInfo.approvedIndustryBadgeName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        sMBIndustryVerificationInfo.canInstantApply = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        sMBIndustryVerificationInfo.blockedReasons.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBIndustryVerificationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBIndustryVerificationInfo sMBIndustryVerificationInfo) {
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo2 = sMBIndustryVerificationInfo;
        if (sMBIndustryVerificationInfo2.blockedReasons == null) {
            sMBIndustryVerificationInfo2.blockedReasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final SMBIndustryVerificationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBIndustryVerificationInfo sMBIndustryVerificationInfo, List list) {
    }
}
