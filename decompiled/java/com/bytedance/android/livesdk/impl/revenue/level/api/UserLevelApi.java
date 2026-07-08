package com.bytedance.android.livesdk.impl.revenue.level.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.google.gson.n;
import tikcast.api.user_level.GradeInfoResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface UserLevelApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/privilege/grade_info/")
    AbstractC19484711Kz<C470590Icr<GradeInfoResponse.Data>> getUserLevelInfo(@InterfaceC1501050pAF("need_config") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/privilege/grade_info/")
    AbstractC19484711Kz<C470590Icr<n>> getUserLevelInfoJson(@InterfaceC1501050pAF("need_config") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/privilege/grade_info/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    AbstractC19484711Kz<C470590Icr<n>> getUserLevelInfoJsonWithParameter(@InterfaceC1501050pAF("need_config") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/privilege/grade_info/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    AbstractC19484711Kz<C470590Icr<GradeInfoResponse.Data>> getUserLevelInfoWithParameter(@InterfaceC1501050pAF("need_config") boolean z);
}
