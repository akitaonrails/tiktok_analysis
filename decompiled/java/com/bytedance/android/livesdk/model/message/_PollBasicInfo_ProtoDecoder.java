package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollBasicInfo_ProtoDecoder implements C0IMD<PollBasicInfo> {
    public static PollBasicInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollBasicInfo pollBasicInfo = new PollBasicInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        pollBasicInfo.pollSponsor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        pollBasicInfo.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        pollBasicInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        pollBasicInfo.isSuggestedQuestion = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        pollBasicInfo.userCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        pollBasicInfo.gift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        pollBasicInfo.pollIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        pollBasicInfo.suggestedQuestionKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        pollBasicInfo.pollDuration = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        pollBasicInfo.timeRemain = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        pollBasicInfo.pollIndex = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        pollBasicInfo.templateId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollBasicInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollBasicInfo pollBasicInfo) {
        Gift gift = pollBasicInfo.gift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final PollBasicInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollBasicInfo pollBasicInfo, List list) {
    }
}
