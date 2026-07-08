package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankUser;
import webcast.data._RankUser_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EcomRankInfo_ProtoDecoder implements C0IMD<EcomRankInfo> {
    public static EcomRankInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcomRankInfo ecomRankInfo = new EcomRankInfo();
        ecomRankInfo.ranks = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        ecomRankInfo.ranks.add(_EcomRankInfo_Rank_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        ecomRankInfo.selfInfo = _EcomRankInfo_Rank_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        ecomRankInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        ecomRankInfo.displayConfig = _EcomRankInfo_DisplayConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        ecomRankInfo.anonymous = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        ecomRankInfo.rankType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        ecomRankInfo.canShowRank = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecomRankInfo;
            }
        }
    }

    public static void LJ(EcomRankInfo ecomRankInfo) {
        List<EcomRankInfo.Rank> list = ecomRankInfo.ranks;
        if (list == null) {
            ecomRankInfo.ranks = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EcomRankInfo.Rank rank : ecomRankInfo.ranks) {
                if (rank != null) {
                    User user = rank.user;
                    if (user != null) {
                        _User_ProtoDecoder.LJ(user);
                    }
                    RankUser rankUser = rank.rankUser;
                    if (rankUser != null) {
                        _RankUser_ProtoDecoder.LJ(rankUser);
                    }
                }
            }
        }
        EcomRankInfo.Rank rank2 = ecomRankInfo.selfInfo;
        if (rank2 != null) {
            User user2 = rank2.user;
            if (user2 != null) {
                _User_ProtoDecoder.LJ(user2);
            }
            RankUser rankUser2 = rank2.rankUser;
            if (rankUser2 != null) {
                _RankUser_ProtoDecoder.LJ(rankUser2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcomRankInfo ecomRankInfo) {
        LJ(ecomRankInfo);
    }

    @Override // X.C0IMD
    public final EcomRankInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcomRankInfo ecomRankInfo, List list) {
    }
}
