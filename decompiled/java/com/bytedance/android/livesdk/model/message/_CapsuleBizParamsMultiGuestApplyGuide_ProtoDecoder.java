package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsMultiGuestApplyGuide_ProtoDecoder implements C0IMD<CapsuleBizParamsMultiGuestApplyGuide> {
    public static CapsuleBizParamsMultiGuestApplyGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide = new CapsuleBizParamsMultiGuestApplyGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    capsuleBizParamsMultiGuestApplyGuide.applyNoticeGuide = _LinkmicAudienceApplyGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                capsuleBizParamsMultiGuestApplyGuide.noticeType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            capsuleBizParamsMultiGuestApplyGuide.linkmicAudienceApplyNoticeReason = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        capsuleBizParamsMultiGuestApplyGuide.displayStrategy = c1516680pZS.LJIIJ();
                    }
                } else {
                    capsuleBizParamsMultiGuestApplyGuide.applyUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsMultiGuestApplyGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide) {
        User user;
        CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide2 = capsuleBizParamsMultiGuestApplyGuide;
        User user2 = capsuleBizParamsMultiGuestApplyGuide2.applyUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide = capsuleBizParamsMultiGuestApplyGuide2.applyNoticeGuide;
        if (linkmicAudienceApplyGuide != null && (user = linkmicAudienceApplyGuide.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsMultiGuestApplyGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsMultiGuestApplyGuide capsuleBizParamsMultiGuestApplyGuide, List list) {
    }
}
