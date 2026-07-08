package com.bytedance.android.livesdk.goody_bag.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoodyBagWinnerInfo_ProtoDecoder implements C0IMD<GoodyBagWinnerInfo> {
    public static GoodyBagWinnerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoodyBagWinnerInfo goodyBagWinnerInfo = new GoodyBagWinnerInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        goodyBagWinnerInfo.coins = c1516680pZS.LJIIJ();
                    }
                } else {
                    goodyBagWinnerInfo.userInfo = _GoodyBagUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goodyBagWinnerInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GoodyBagWinnerInfo goodyBagWinnerInfo) {
        ImageModel imageModel;
        GoodyBagUserInfo goodyBagUserInfo = goodyBagWinnerInfo.userInfo;
        if (goodyBagUserInfo != null && (imageModel = goodyBagUserInfo.avatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GoodyBagWinnerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoodyBagWinnerInfo goodyBagWinnerInfo, List list) {
    }
}
