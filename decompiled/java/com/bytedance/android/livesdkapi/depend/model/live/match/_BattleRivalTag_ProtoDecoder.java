package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleRivalTag_ProtoDecoder implements C0IMD<BattleRivalTag> {
    public static BattleRivalTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleRivalTag battleRivalTag = new BattleRivalTag();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            battleRivalTag.content = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleRivalTag.iconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleRivalTag.bgImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleRivalTag;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleRivalTag battleRivalTag) {
        BattleRivalTag battleRivalTag2 = battleRivalTag;
        ImageModel imageModel = battleRivalTag2.bgImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = battleRivalTag2.iconImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final BattleRivalTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleRivalTag battleRivalTag, List list) {
    }
}
