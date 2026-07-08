package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserRankLeadContributor_ProtoDecoder implements C0IMD<UserRankLeadContributor> {
    public static UserRankLeadContributor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserRankLeadContributor userRankLeadContributor = new UserRankLeadContributor();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                userRankLeadContributor.rank = c1516680pZS.LJIIJ();
                            }
                        } else {
                            userRankLeadContributor.score = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userRankLeadContributor.userInfo = _CustomActivityUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    userRankLeadContributor.uid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userRankLeadContributor;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserRankLeadContributor userRankLeadContributor) {
        UserAvatar userAvatar;
        CustomActivityUserInfo customActivityUserInfo = userRankLeadContributor.userInfo;
        if (customActivityUserInfo != null && (userAvatar = customActivityUserInfo.avatar) != null && userAvatar.urlList == null) {
            userAvatar.urlList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final UserRankLeadContributor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserRankLeadContributor userRankLeadContributor, List list) {
    }
}
