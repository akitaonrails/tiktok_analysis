package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.EffectGetResponse;
import webcast.data.EffectAPIExtra;
import webcast.data.EffectStruct;
import webcast.data._EffectAPIExtra_ProtoDecoder;
import webcast.data._EffectStruct_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectGetResponse_Data_ProtoDecoder implements C0IMD<EffectGetResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(EffectGetResponse.Data data) {
        EffectGetResponse.Data data2 = data;
        EffectStruct effectStruct = data2.effect;
        if (effectStruct != null) {
            _EffectStruct_ProtoDecoder.LJ(effectStruct);
        }
        List<EffectStruct> list = data2.collection;
        if (list == null) {
            data2.collection = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EffectStruct effectStruct2 : data2.collection) {
                if (effectStruct2 != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct2);
                }
            }
        }
        EffectAPIExtra effectAPIExtra = data2.extra;
        if (effectAPIExtra != null) {
            _EffectAPIExtra_ProtoDecoder.LJ(effectAPIExtra);
        }
    }

    @Override // X.C0IMD
    public final EffectGetResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectGetResponse.Data data = new EffectGetResponse.Data();
        data.collection = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                data.extra = _EffectAPIExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            data.urlPrefix = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        data.collection.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    data.effect = _EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectGetResponse.Data data, List list) {
    }
}
