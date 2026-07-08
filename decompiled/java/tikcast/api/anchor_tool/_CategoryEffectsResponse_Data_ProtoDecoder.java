package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.CategoryEffectsResponse;
import webcast.data.CategoryEffects;
import webcast.data.EffectAPIExtra;
import webcast.data._CategoryEffects_ProtoDecoder;
import webcast.data._EffectAPIExtra_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CategoryEffectsResponse_Data_ProtoDecoder implements C0IMD<CategoryEffectsResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(CategoryEffectsResponse.Data data) {
        CategoryEffectsResponse.Data data2 = data;
        if (data2.urlPrefix == null) {
            data2.urlPrefix = new ArrayList();
        }
        CategoryEffects categoryEffects = data2.categoryEffects;
        if (categoryEffects != null) {
            _CategoryEffects_ProtoDecoder.LJ(categoryEffects);
        }
        EffectAPIExtra effectAPIExtra = data2.extra;
        if (effectAPIExtra != null) {
            _EffectAPIExtra_ProtoDecoder.LJ(effectAPIExtra);
        }
    }

    @Override // X.C0IMD
    public final CategoryEffectsResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CategoryEffectsResponse.Data data = new CategoryEffectsResponse.Data();
        data.urlPrefix = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            data.extra = _EffectAPIExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        data.categoryEffects = _CategoryEffects_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    data.urlPrefix.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CategoryEffectsResponse.Data data, List list) {
    }
}
