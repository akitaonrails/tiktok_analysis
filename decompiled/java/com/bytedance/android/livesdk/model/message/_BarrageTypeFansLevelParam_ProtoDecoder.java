package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageTypeFansLevelParam_ProtoDecoder implements C0IMD<BarrageTypeFansLevelParam> {
    public static BarrageTypeFansLevelParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BarrageTypeFansLevelParam barrageTypeFansLevelParam = new BarrageTypeFansLevelParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            barrageTypeFansLevelParam.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        barrageTypeFansLevelParam.displayConfig = c1516680pZS.LJIIJ();
                    }
                } else {
                    barrageTypeFansLevelParam.currentGrade = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return barrageTypeFansLevelParam;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BarrageTypeFansLevelParam barrageTypeFansLevelParam) {
        User user = barrageTypeFansLevelParam.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final BarrageTypeFansLevelParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageTypeFansLevelParam barrageTypeFansLevelParam, List list) {
    }
}
