package webcast.data.multi_guest_social_data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _SoundWareEffect_ProtoDecoder implements C0IMD<SoundWareEffect> {
    public static SoundWareEffect LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SoundWareEffect soundWareEffect = new SoundWareEffect();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        soundWareEffect.userRightId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        soundWareEffect.rightId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        soundWareEffect.rightTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        soundWareEffect.rightDesc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        soundWareEffect.staticImageName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        soundWareEffect.dynamicImageName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        soundWareEffect.status = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        soundWareEffect.btnStatus = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        soundWareEffect.btnTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        soundWareEffect.obtainSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        soundWareEffect.expireTs = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        soundWareEffect.rightBtnDisable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return soundWareEffect;
            }
        }
    }

    @Override // X.C0IMD
    public final SoundWareEffect LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SoundWareEffect soundWareEffect) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SoundWareEffect soundWareEffect, List list) {
    }
}
