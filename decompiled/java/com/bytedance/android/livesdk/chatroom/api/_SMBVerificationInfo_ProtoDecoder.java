package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBVerificationInfo_ProtoDecoder implements C0IMD<SMBVerificationInfo> {
    public static SMBVerificationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBVerificationInfo sMBVerificationInfo = new SMBVerificationInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                sMBVerificationInfo.selectedIndustryBadgeName = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            sMBVerificationInfo.industryVerificationInfo = _SMBIndustryVerificationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        sMBVerificationInfo.kybInfo = _SMBKYBInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sMBVerificationInfo.kycInfo = _SMBKYCInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBVerificationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBVerificationInfo sMBVerificationInfo) {
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo = sMBVerificationInfo.industryVerificationInfo;
        if (sMBIndustryVerificationInfo != null && sMBIndustryVerificationInfo.blockedReasons == null) {
            sMBIndustryVerificationInfo.blockedReasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final SMBVerificationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBVerificationInfo sMBVerificationInfo, List list) {
    }
}
