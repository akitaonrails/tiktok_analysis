package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.rank.model._RankTabInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankListTabInfo_ProtoDecoder implements C0IMD<RankListTabInfo> {
    public static RankListTabInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankListTabInfo rankListTabInfo = new RankListTabInfo();
        rankListTabInfo.tabs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        rankListTabInfo.supportedVersion = c1516680pZS.LJIIJJI();
                    }
                } else {
                    rankListTabInfo.tabs.add(_RankTabInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankListTabInfo;
            }
        }
    }

    public static void LJ(RankListTabInfo rankListTabInfo) {
        Text text;
        List<RankTabInfo> list = rankListTabInfo.tabs;
        if (list == null) {
            rankListTabInfo.tabs = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RankTabInfo rankTabInfo : rankListTabInfo.tabs) {
            if (rankTabInfo != null && (text = rankTabInfo.title) != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankListTabInfo rankListTabInfo) {
        LJ(rankListTabInfo);
    }

    @Override // X.C0IMD
    public final RankListTabInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankListTabInfo rankListTabInfo, List list) {
    }
}
