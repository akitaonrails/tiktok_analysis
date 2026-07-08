package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _PlayTogetherBasicInfo_ProtoDecoder implements C0IMD<PlayTogetherBasicInfo> {
    public static PlayTogetherBasicInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherBasicInfo playTogetherBasicInfo = new PlayTogetherBasicInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        playTogetherBasicInfo.playTogetherId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        playTogetherBasicInfo.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        playTogetherBasicInfo.applyNote = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        playTogetherBasicInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        playTogetherBasicInfo.applyLimitType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        playTogetherBasicInfo.applyUserNum = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        playTogetherBasicInfo.isApplying = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        playTogetherBasicInfo.creatorId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        playTogetherBasicInfo.creatorAvatar = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        playTogetherBasicInfo.creatorNickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        playTogetherBasicInfo.businessVersion = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        playTogetherBasicInfo.templateInfo = _PlayTogetherTemplateV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        playTogetherBasicInfo.isOpenBulletinBoard = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherBasicInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PlayTogetherBasicInfo playTogetherBasicInfo) {
    }

    @Override // X.C0IMD
    public final PlayTogetherBasicInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherBasicInfo playTogetherBasicInfo, List list) {
    }
}
