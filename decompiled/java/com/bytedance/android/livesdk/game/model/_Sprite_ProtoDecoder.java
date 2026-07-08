package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Sprite_ProtoDecoder implements C0IMD<Sprite> {
    public static Sprite LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Sprite sprite = new Sprite();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sprite.spriteUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        sprite.totalNum = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        sprite.xNum = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        sprite.yNum = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        sprite.imageHeight = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        sprite.imageWidth = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        sprite.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        sprite.spriteNum = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        sprite.imageXNum = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        sprite.imageYNum = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        sprite.fps = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sprite;
            }
        }
    }

    @Override // X.C0IMD
    public final Sprite LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Sprite sprite) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Sprite sprite, List list) {
    }
}
