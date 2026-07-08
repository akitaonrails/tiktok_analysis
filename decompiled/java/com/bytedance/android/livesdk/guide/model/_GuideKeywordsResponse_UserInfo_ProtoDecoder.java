package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideKeywordsResponse_UserInfo_ProtoDecoder implements C0IMD<GuideKeywordsResponse.UserInfo> {
    public static GuideKeywordsResponse.UserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideKeywordsResponse.UserInfo userInfo = new GuideKeywordsResponse.UserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    userInfo.coinExchangePrompt = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                userInfo.suggestedMaxCoins = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            userInfo.suggestedMinCoins = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userInfo.hasEverRecharged = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    userInfo.isInEea = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GuideKeywordsResponse.UserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuideKeywordsResponse.UserInfo userInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideKeywordsResponse.UserInfo userInfo, List list) {
    }
}
