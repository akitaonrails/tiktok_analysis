package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_tool.EffectRewardResponse;
import webcast.data.EffectStruct;
import webcast.data._EffectStruct_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectRewardResponse_Data_ProtoDecoder implements C0IMD<EffectRewardResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(EffectRewardResponse.Data data) {
        EffectRewardResponse.Data data2 = data;
        List<EffectStruct> list = data2.rewardEffects;
        if (list == null) {
            data2.rewardEffects = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EffectStruct effectStruct : data2.rewardEffects) {
                if (effectStruct != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct);
                }
            }
        }
        if (data2.urlPrefix == null) {
            data2.urlPrefix = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final EffectRewardResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EffectRewardResponse.Data data = new EffectRewardResponse.Data();
        data.rewardEffects = new ArrayList();
        data.urlPrefix = new ArrayList();
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
                                data.urlPrefix.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            data.rewardEffects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        data.nextCursor = c1516680pZS.LJIIJ();
                    }
                } else {
                    data.hasMore = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectRewardResponse.Data data, List list) {
    }
}
