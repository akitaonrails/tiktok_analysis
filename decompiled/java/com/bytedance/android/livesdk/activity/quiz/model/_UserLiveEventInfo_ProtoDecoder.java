package com.bytedance.android.livesdk.activity.quiz.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserLiveEventInfo_ProtoDecoder implements C0IMD<UserLiveEventInfo> {
    public static UserLiveEventInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserLiveEventInfo userLiveEventInfo = new UserLiveEventInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userLiveEventInfo.isSubscribed = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        userLiveEventInfo.quizId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    userLiveEventInfo.liveEventId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userLiveEventInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final UserLiveEventInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserLiveEventInfo userLiveEventInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserLiveEventInfo userLiveEventInfo, List list) {
    }
}
