package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Category_ProtoDecoder implements C0IMD<Category> {
    public static Category LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Category category = new Category();
        category.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        category.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        category.key = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        category.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        category.icon = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        category.iconSelected = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        category.tags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        category.tagsUpdatedAt = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        category.isDefault = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        category.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        category.isRecommend = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return category;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Category category) {
        Category category2 = category;
        UrlDataStruct urlDataStruct = category2.icon;
        if (urlDataStruct != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct);
        }
        UrlDataStruct urlDataStruct2 = category2.iconSelected;
        if (urlDataStruct2 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct2);
        }
        if (category2.tags == null) {
            category2.tags = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final Category LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Category category, List list) {
    }
}
