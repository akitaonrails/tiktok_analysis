package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionContributorInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BeansAvatar_ProtoDecoder implements C0IMD<BeansAvatar> {
    public static BeansAvatar LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BeansAvatar beansAvatar = new BeansAvatar();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            beansAvatar.incrementalAvatarCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        beansAvatar.contributor = _CompetitionContributorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    beansAvatar.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beansAvatar;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BeansAvatar beansAvatar) {
        CompetitionContributorInfo competitionContributorInfo = beansAvatar.contributor;
        if (competitionContributorInfo != null) {
            _CompetitionContributorInfo_ProtoDecoder.LJ(competitionContributorInfo);
        }
    }

    @Override // X.C0IMD
    public final BeansAvatar LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BeansAvatar beansAvatar, List list) {
    }
}
