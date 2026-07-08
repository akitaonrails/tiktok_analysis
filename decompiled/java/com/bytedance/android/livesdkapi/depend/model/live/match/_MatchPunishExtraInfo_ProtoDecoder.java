package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchPunishExtraInfo_ProtoDecoder implements C0IMD<MatchPunishExtraInfo> {
    public static MatchPunishExtraInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchPunishExtraInfo matchPunishExtraInfo = new MatchPunishExtraInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            matchPunishExtraInfo.recommendedPlaybookInfo = _RecommendedPlaybookInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        matchPunishExtraInfo.cohostContentGuideInfo = _CohostContentGuideInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    matchPunishExtraInfo.matchPunishEffectInfo = _MatchPunishEffectInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchPunishExtraInfo;
            }
        }
    }

    public static void LJ(MatchPunishExtraInfo matchPunishExtraInfo) {
        MatchPunishEffectInfo matchPunishEffectInfo = matchPunishExtraInfo.matchPunishEffectInfo;
        if (matchPunishEffectInfo != null) {
            _MatchPunishEffectInfo_ProtoDecoder.LJ(matchPunishEffectInfo);
        }
        RecommendedPlaybookInfo recommendedPlaybookInfo = matchPunishExtraInfo.recommendedPlaybookInfo;
        if (recommendedPlaybookInfo != null) {
            _RecommendedPlaybookInfo_ProtoDecoder.LJ(recommendedPlaybookInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MatchPunishExtraInfo matchPunishExtraInfo) {
        LJ(matchPunishExtraInfo);
    }

    @Override // X.C0IMD
    public final MatchPunishExtraInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchPunishExtraInfo matchPunishExtraInfo, List list) {
    }
}
