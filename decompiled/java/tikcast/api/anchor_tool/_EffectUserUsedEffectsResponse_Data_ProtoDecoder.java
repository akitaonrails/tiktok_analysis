package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.EffectUserUsedEffectsResponse;
import webcast.data.DefaultEffectListItemStruct;
import webcast.data._DefaultEffectListItemStruct_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectUserUsedEffectsResponse_Data_ProtoDecoder implements C0IMD<EffectUserUsedEffectsResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(EffectUserUsedEffectsResponse.Data data) {
        EffectUserUsedEffectsResponse.Data data2 = data;
        List<DefaultEffectListItemStruct> list = data2.listItem;
        if (list == null) {
            data2.listItem = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (DefaultEffectListItemStruct defaultEffectListItemStruct : data2.listItem) {
            if (defaultEffectListItemStruct != null) {
                _DefaultEffectListItemStruct_ProtoDecoder.LJ(defaultEffectListItemStruct);
            }
        }
    }

    @Override // X.C0IMD
    public final EffectUserUsedEffectsResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectUserUsedEffectsResponse.Data data = new EffectUserUsedEffectsResponse.Data();
        data.listItem = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    data.listItem.add(_DefaultEffectListItemStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectUserUsedEffectsResponse.Data data, List list) {
    }
}
