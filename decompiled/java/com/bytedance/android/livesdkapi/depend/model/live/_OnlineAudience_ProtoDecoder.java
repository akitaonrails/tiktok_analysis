package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.OnlineAudience;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankUser;
import webcast.data._RankUser_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _OnlineAudience_ProtoDecoder implements C0IMD<OnlineAudience> {
    public static OnlineAudience LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OnlineAudience onlineAudience = new OnlineAudience();
        onlineAudience.ranks = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        onlineAudience.ranks.add(_OnlineAudience_Rank_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        onlineAudience.selfInfo = _OnlineAudience_Rank_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        onlineAudience.currency = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        onlineAudience.anchorShowContribution = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        onlineAudience.deprecated = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        onlineAudience.total = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        onlineAudience.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        onlineAudience.displayConfig = _OnlineAudience_DisplayConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        onlineAudience.anonymous = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        onlineAudience.previewCount = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return onlineAudience;
            }
        }
    }

    public static void LJ(OnlineAudience onlineAudience) {
        List<OnlineAudience.Rank> list = onlineAudience.ranks;
        if (list == null) {
            onlineAudience.ranks = new ArrayList();
        } else if (!list.isEmpty()) {
            for (OnlineAudience.Rank rank : onlineAudience.ranks) {
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
        OnlineAudience.Rank rank2 = onlineAudience.selfInfo;
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
    public final void LIZ(OnlineAudience onlineAudience) {
        LJ(onlineAudience);
    }

    @Override // X.C0IMD
    public final OnlineAudience LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OnlineAudience onlineAudience, List list) {
    }
}
