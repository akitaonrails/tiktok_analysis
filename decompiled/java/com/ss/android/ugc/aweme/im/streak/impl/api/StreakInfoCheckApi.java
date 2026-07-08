package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C06GF;
import X.C0X9S;
import X.C2226871CDt;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes3.dex */
public interface StreakInfoCheckApi {
    public static final C06GF LIZ = C06GF.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/im/streaks/compare")
    C0X9S<C2226871CDt> checkStreakInfo(@InterfaceC1485405rg StreakCompareParams streakCompareParams);
}
