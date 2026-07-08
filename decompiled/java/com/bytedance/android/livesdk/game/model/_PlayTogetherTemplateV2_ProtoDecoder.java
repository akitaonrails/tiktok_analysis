package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _PlayTogetherTemplateV2_ProtoDecoder implements C0IMD<PlayTogetherTemplateV2> {
    public static PlayTogetherTemplateV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherTemplateV2 playTogetherTemplateV2 = new PlayTogetherTemplateV2();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        playTogetherTemplateV2.templateId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        playTogetherTemplateV2.templateType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        playTogetherTemplateV2.templateConfigId = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        playTogetherTemplateV2.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        playTogetherTemplateV2.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        playTogetherTemplateV2.applyNote = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        playTogetherTemplateV2.sendMessage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        playTogetherTemplateV2.connectType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        playTogetherTemplateV2.status = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        playTogetherTemplateV2.applyLimitType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        playTogetherTemplateV2.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        playTogetherTemplateV2.iconUrlDarkMode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        playTogetherTemplateV2.reviewNotPassFields = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherTemplateV2;
            }
        }
    }

    @Override // X.C0IMD
    public final PlayTogetherTemplateV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlayTogetherTemplateV2 playTogetherTemplateV2) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherTemplateV2 playTogetherTemplateV2, List list) {
    }
}
