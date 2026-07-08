package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlayTogetherMember_ProtoDecoder implements C0IMD<PlayTogetherMember> {
    public static PlayTogetherMember LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherMember playTogetherMember = new PlayTogetherMember();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        playTogetherMember.userId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        playTogetherMember.avatar = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        playTogetherMember.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        playTogetherMember.applyMessage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        playTogetherMember.applyTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        playTogetherMember.acceptTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        playTogetherMember.relationTag = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        playTogetherMember.relationTagEnum = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        playTogetherMember.isSendGift = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        playTogetherMember.rankPoint = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        playTogetherMember.isRecentPicked = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        playTogetherMember.applicationId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        playTogetherMember.isCreatorFollow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 14:
                        playTogetherMember.applicationIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherMember;
            }
        }
    }

    @Override // X.C0IMD
    public final PlayTogetherMember LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlayTogetherMember playTogetherMember) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherMember playTogetherMember, List list) {
    }
}
