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
public final class _EffectCategory_ProtoDecoder implements C0IMD<EffectCategory> {
    public static EffectCategory LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectCategory effectCategory = new EffectCategory();
        effectCategory.effects = new ArrayList();
        effectCategory.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        effectCategory.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        effectCategory.key = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        effectCategory.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        effectCategory.icon = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        effectCategory.iconSelected = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        effectCategory.effects.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        effectCategory.tags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        effectCategory.tagsUpdatedAt = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        effectCategory.isDefault = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        effectCategory.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectCategory;
            }
        }
    }

    public static void LJ(EffectCategory effectCategory) {
        UrlDataStruct urlDataStruct = effectCategory.icon;
        if (urlDataStruct != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct);
        }
        UrlDataStruct urlDataStruct2 = effectCategory.iconSelected;
        if (urlDataStruct2 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct2);
        }
        if (effectCategory.effects == null) {
            effectCategory.effects = new ArrayList();
        }
        if (effectCategory.tags == null) {
            effectCategory.tags = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EffectCategory effectCategory) {
        LJ(effectCategory);
    }

    @Override // X.C0IMD
    public final EffectCategory LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectCategory effectCategory, List list) {
    }
}
