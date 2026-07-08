package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.PanelInfoResponse;
import webcast.data.Category;
import webcast.data.CategoryEffects;
import webcast.data.EffectAPIExtra;
import webcast.data.EffectStruct;
import webcast.data.Panel;
import webcast.data.UrlDataStruct;
import webcast.data._CategoryEffects_ProtoDecoder;
import webcast.data._Category_ProtoDecoder;
import webcast.data._EffectAPIExtra_ProtoDecoder;
import webcast.data._EffectStruct_ProtoDecoder;
import webcast.data._Panel_ProtoDecoder;
import webcast.data._UrlDataStruct_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelInfoResponse_Data_ProtoDecoder implements C0IMD<PanelInfoResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(PanelInfoResponse.Data data) {
        PanelInfoResponse.Data data2 = data;
        List<Category> list = data2.categoryList;
        if (list == null) {
            data2.categoryList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Category category : data2.categoryList) {
                if (category != null) {
                    UrlDataStruct urlDataStruct = category.icon;
                    if (urlDataStruct != null) {
                        _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct);
                    }
                    UrlDataStruct urlDataStruct2 = category.iconSelected;
                    if (urlDataStruct2 != null) {
                        _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct2);
                    }
                    if (category.tags == null) {
                        category.tags = new ArrayList();
                    }
                }
            }
        }
        EffectStruct effectStruct = data2.frontEffect;
        if (effectStruct != null) {
            _EffectStruct_ProtoDecoder.LJ(effectStruct);
        }
        EffectStruct effectStruct2 = data2.rearEffect;
        if (effectStruct2 != null) {
            _EffectStruct_ProtoDecoder.LJ(effectStruct2);
        }
        if (data2.urlPrefix == null) {
            data2.urlPrefix = new ArrayList();
        }
        Panel panel = data2.panel;
        if (panel != null) {
            _Panel_ProtoDecoder.LJ(panel);
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
    public final PanelInfoResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PanelInfoResponse.Data data = new PanelInfoResponse.Data();
        data.categoryList = new ArrayList();
        data.urlPrefix = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.updated = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        data.version = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        data.categoryList.add(_Category_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        data.frontEffect = _EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        data.rearEffect = _EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        data.urlPrefix.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        data.panel = _Panel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        data.categoryEffects = _CategoryEffects_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        data.extra = _EffectAPIExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelInfoResponse.Data data, List list) {
    }
}
