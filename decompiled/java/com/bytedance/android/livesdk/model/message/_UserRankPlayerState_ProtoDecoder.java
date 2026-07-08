package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserRankPlayerState_ProtoDecoder implements C0IMD<UserRankPlayerState> {
    public static UserRankPlayerState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserRankPlayerState userRankPlayerState = new UserRankPlayerState();
        userRankPlayerState.leadContributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 10) {
                    if (iLJI != 11) {
                        switch (iLJI) {
                            case 1:
                                userRankPlayerState.uid = c1516680pZS.LJIIJJI();
                                break;
                            case 2:
                                userRankPlayerState.userInfo = _CustomActivityUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                userRankPlayerState.rank = c1516680pZS.LJIIJ();
                                break;
                            case 4:
                                userRankPlayerState.score = c1516680pZS.LJIIJJI();
                                break;
                            case 5:
                                userRankPlayerState.comparison = _UserRankComparison_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                userRankPlayerState.leadContributors.add(_UserRankLeadContributor_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        userRankPlayerState.stateId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    userRankPlayerState.featureMeta = _FeatureMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userRankPlayerState;
            }
        }
    }

    public static void LJ(UserRankPlayerState userRankPlayerState) {
        CustomActivityUserInfo customActivityUserInfo;
        UserAvatar userAvatar;
        UserAvatar userAvatar2;
        CustomActivityUserInfo customActivityUserInfo2 = userRankPlayerState.userInfo;
        if (customActivityUserInfo2 != null && (userAvatar2 = customActivityUserInfo2.avatar) != null && userAvatar2.urlList == null) {
            userAvatar2.urlList = new ArrayList();
        }
        List<UserRankLeadContributor> list = userRankPlayerState.leadContributors;
        if (list == null) {
            userRankPlayerState.leadContributors = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (UserRankLeadContributor userRankLeadContributor : userRankPlayerState.leadContributors) {
            if (userRankLeadContributor != null && (customActivityUserInfo = userRankLeadContributor.userInfo) != null && (userAvatar = customActivityUserInfo.avatar) != null && userAvatar.urlList == null) {
                userAvatar.urlList = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserRankPlayerState userRankPlayerState) {
        LJ(userRankPlayerState);
    }

    @Override // X.C0IMD
    public final UserRankPlayerState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserRankPlayerState userRankPlayerState, List list) {
    }
}
