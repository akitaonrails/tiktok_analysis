package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicAudienceApplyGuide_ProtoDecoder implements C0IMD<LinkmicAudienceApplyGuide> {
    public static LinkmicAudienceApplyGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide = new LinkmicAudienceApplyGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkmicAudienceApplyGuide.content = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkmicAudienceApplyGuide.buttonContent = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        linkmicAudienceApplyGuide.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkmicAudienceApplyGuide.displayStrategy = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        linkmicAudienceApplyGuide.linkmicAudienceApplyNoticeReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkmicAudienceApplyGuide.displayPosition = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkmicAudienceApplyGuide.triggerType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkmicAudienceApplyGuide.requestId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkmicAudienceApplyGuide.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicAudienceApplyGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkmicAudienceApplyGuide linkmicAudienceApplyGuide) {
        User user = linkmicAudienceApplyGuide.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final LinkmicAudienceApplyGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicAudienceApplyGuide linkmicAudienceApplyGuide, List list) {
    }
}
