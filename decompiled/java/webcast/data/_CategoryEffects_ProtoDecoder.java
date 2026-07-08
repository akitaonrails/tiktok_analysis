package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CategoryEffects_ProtoDecoder implements C0IMD<CategoryEffects> {
    public static CategoryEffects LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CategoryEffects categoryEffects = new CategoryEffects();
        categoryEffects.effects = new ArrayList();
        categoryEffects.bindEffects = new ArrayList();
        categoryEffects.collection = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        categoryEffects.categoryKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        categoryEffects.version = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        categoryEffects.hasMore = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        categoryEffects.cursor = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        categoryEffects.sortingPosition = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        categoryEffects.effects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        categoryEffects.collection.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        categoryEffects.bindEffects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return categoryEffects;
            }
        }
    }

    public static void LJ(CategoryEffects categoryEffects) {
        List<EffectStruct> list = categoryEffects.effects;
        if (list == null) {
            categoryEffects.effects = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EffectStruct effectStruct : categoryEffects.effects) {
                if (effectStruct != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct);
                }
            }
        }
        List<EffectStruct> list2 = categoryEffects.collection;
        if (list2 == null) {
            categoryEffects.collection = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (EffectStruct effectStruct2 : categoryEffects.collection) {
                if (effectStruct2 != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct2);
                }
            }
        }
        List<EffectStruct> list3 = categoryEffects.bindEffects;
        if (list3 == null) {
            categoryEffects.bindEffects = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (EffectStruct effectStruct3 : categoryEffects.bindEffects) {
            if (effectStruct3 != null) {
                _EffectStruct_ProtoDecoder.LJ(effectStruct3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CategoryEffects categoryEffects) {
        LJ(categoryEffects);
    }

    @Override // X.C0IMD
    public final CategoryEffects LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CategoryEffects categoryEffects, List list) {
    }
}
