package com.bytedance.android.livesdk.grouplive.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfoParams;

/* JADX INFO: loaded from: classes.dex */
public interface CompetitionApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/info/")
    C11NZ<C470590Icr<CompetitionInfo>> getCompetitionInfo(@InterfaceC1485405rg CompetitionInfoParams competitionInfoParams);
}
