package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _BizApplyParams_ProtoDecoder implements C0IMD<BizApplyParams> {
    public static BizApplyParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizApplyParams bizApplyParams = new BizApplyParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bizApplyParams.linkType = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        bizApplyParams.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        bizApplyParams.userReturnType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        bizApplyParams.follow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        bizApplyParams.shareRevenueSetting = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        bizApplyParams.inviterRole = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        bizApplyParams.inviterUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        bizApplyParams.requestParam = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bizApplyParams.joinGameSessionId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bizApplyParams.shareRevenueSettingRatio = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bizApplyParams.mgEnterParamsProtoJson = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        bizApplyParams.enterAction = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        bizApplyParams.enterActionReason = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        bizApplyParams.lineupResumeLink = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizApplyParams;
            }
        }
    }

    @Override // X.C0IMD
    public final BizApplyParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizApplyParams bizApplyParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizApplyParams bizApplyParams, List list) {
    }
}
