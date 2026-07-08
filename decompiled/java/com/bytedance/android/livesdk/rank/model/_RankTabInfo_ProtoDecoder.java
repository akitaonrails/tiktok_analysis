package com.bytedance.android.livesdk.rank.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankTabInfo_ProtoDecoder implements C0IMD<RankTabInfo> {
    public static RankTabInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankTabInfo rankTabInfo = new RankTabInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            rankTabInfo.listLynxType = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        rankTabInfo.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    rankTabInfo.rankType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankTabInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankTabInfo rankTabInfo) {
        Text text = rankTabInfo.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final RankTabInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankTabInfo rankTabInfo, List list) {
    }
}
