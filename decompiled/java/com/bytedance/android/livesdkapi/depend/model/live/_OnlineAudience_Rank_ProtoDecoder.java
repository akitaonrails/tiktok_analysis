package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.OnlineAudience;
import java.io.IOException;
import java.util.List;
import webcast.data.RankUser;
import webcast.data._RankUser_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _OnlineAudience_Rank_ProtoDecoder implements C0IMD<OnlineAudience.Rank> {
    public static OnlineAudience.Rank LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OnlineAudience.Rank rank = new OnlineAudience.Rank();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rank.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        rank.score = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        rank.rank = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        rank.gapDescription = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        rank.userRestrictionLevel = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        rank.rankUser = _RankUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rank;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OnlineAudience.Rank rank) {
        OnlineAudience.Rank rank2 = rank;
        User user = rank2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        RankUser rankUser = rank2.rankUser;
        if (rankUser != null) {
            _RankUser_ProtoDecoder.LJ(rankUser);
        }
    }

    @Override // X.C0IMD
    public final OnlineAudience.Rank LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OnlineAudience.Rank rank, List list) {
    }
}
