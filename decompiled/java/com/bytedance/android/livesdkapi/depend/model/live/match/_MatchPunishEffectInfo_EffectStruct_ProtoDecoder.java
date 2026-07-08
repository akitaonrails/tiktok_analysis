package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchPunishEffectInfo_EffectStruct_ProtoDecoder implements C0IMD<MatchPunishEffectInfo.EffectStruct> {
    public static MatchPunishEffectInfo.EffectStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchPunishEffectInfo.EffectStruct effectStruct = new MatchPunishEffectInfo.EffectStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    effectStruct.effectResourceId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final MatchPunishEffectInfo.EffectStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MatchPunishEffectInfo.EffectStruct effectStruct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchPunishEffectInfo.EffectStruct effectStruct, List list) {
    }
}
