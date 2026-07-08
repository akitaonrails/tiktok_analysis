package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.EffectSearchResponse;
import webcast.data.EffectStruct;
import webcast.data._EffectStruct_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectSearchResponse_ResponseData_ProtoDecoder implements C0IMD<EffectSearchResponse.ResponseData> {
    public static EffectSearchResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectSearchResponse.ResponseData responseData = new EffectSearchResponse.ResponseData();
        responseData.effects = new ArrayList();
        responseData.collections = new ArrayList();
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
                                responseData.collections.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            responseData.hasMore = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        responseData.nextOffset = c1516680pZS.LJIIJJI();
                    }
                } else {
                    responseData.effects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(EffectSearchResponse.ResponseData responseData) {
        List<EffectStruct> list = responseData.effects;
        if (list == null) {
            responseData.effects = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EffectStruct effectStruct : responseData.effects) {
                if (effectStruct != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct);
                }
            }
        }
        List<EffectStruct> list2 = responseData.collections;
        if (list2 == null) {
            responseData.collections = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (EffectStruct effectStruct2 : responseData.collections) {
            if (effectStruct2 != null) {
                _EffectStruct_ProtoDecoder.LJ(effectStruct2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EffectSearchResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final EffectSearchResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectSearchResponse.ResponseData responseData, List list) {
    }
}
