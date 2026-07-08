package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.GameTag;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameTag_ProtoDecoder implements C0IMD<GameTag> {
    public static GameTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameTag gameTag = new GameTag();
        gameTag.hashtagList = new ArrayList();
        gameTag.gameCategory = new ArrayList();
        gameTag.gar = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameTag.id = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        gameTag.showName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        gameTag.shortName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        gameTag.fullName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 6:
                        gameTag.hashtagList.add(_Hashtag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        gameTag.gameCategory.add(_GameTagCategory_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        gameTag.landscape = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        gameTag.packageName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        gameTag.bundleId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        gameTag.isNewGame = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        gameTag.gar.add(_GameTag_GameAgeRating_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameTag;
            }
        }
    }

    public static void LJ(GameTag gameTag) {
        ImageModel imageModel;
        List<Hashtag> list = gameTag.hashtagList;
        if (list == null) {
            gameTag.hashtagList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Hashtag hashtag : gameTag.hashtagList) {
                if (hashtag != null && (imageModel = hashtag.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<GameTagCategory> list2 = gameTag.gameCategory;
        if (list2 == null) {
            gameTag.gameCategory = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<GameTagCategory> it2 = gameTag.gameCategory.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<GameTag.GameAgeRating> list3 = gameTag.gar;
        if (list3 == null) {
            gameTag.gar = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<GameTag.GameAgeRating> it3 = gameTag.gar.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameTag gameTag) {
        LJ(gameTag);
    }

    @Override // X.C0IMD
    public final GameTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameTag gameTag, List list) {
    }
}
