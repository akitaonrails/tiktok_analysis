package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdk.model.message._PictionaryInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PictionaryFullInfo_ProtoDecoder implements C0IMD<PictionaryFullInfo> {
    public static PictionaryFullInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PictionaryFullInfo pictionaryFullInfo = new PictionaryFullInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            pictionaryFullInfo.guessCorrect = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        pictionaryFullInfo.pictionaryStatistics = _PictionaryStatistics_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    pictionaryFullInfo.pictionaryInfo = _PictionaryInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pictionaryFullInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PictionaryFullInfo pictionaryFullInfo) {
        User user;
        ImageModel imageModel;
        PictionaryFullInfo pictionaryFullInfo2 = pictionaryFullInfo;
        PictionaryInfo pictionaryInfo = pictionaryFullInfo2.pictionaryInfo;
        if (pictionaryInfo != null && (imageModel = pictionaryInfo.drawUrl) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        PictionaryStatistics pictionaryStatistics = pictionaryFullInfo2.pictionaryStatistics;
        if (pictionaryStatistics != null && (user = pictionaryStatistics.firstUser) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final PictionaryFullInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PictionaryFullInfo pictionaryFullInfo, List list) {
    }
}
