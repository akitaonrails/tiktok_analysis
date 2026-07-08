package com.bytedance.android.livesdk.revenue.level.impl.fansclub.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import tikcast.api.fans.FansConfigResponse;
import tikcast.api.fans.FansGetCustomBenefitsResponse;
import tikcast.api.fans.FansGetTaskInfoResponse;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.SuperFanCancelContractResult;

/* JADX INFO: loaded from: classes8.dex */
public interface FansClubApi {
    @InterfaceC1501170pAR("/webcast/privilege/super_fan_cancel/")
    AbstractC19484711Kz<C470590Icr<SuperFanCancelContractResult>> cancelRenewal(@InterfaceC1501070pAH("to_uid") String str);

    @InterfaceC1501160pAQ("/webcast/privilege/fans_get_custom_benefits/")
    AbstractC19484711Kz<C470590Icr<FansGetCustomBenefitsResponse.Data>> getCustomBenefits(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("include_templates") boolean z);

    @InterfaceC1501170pAR("/webcast/privilege/fans_config/")
    AbstractC19484711Kz<C470590Icr<FansConfigResponse.Data>> getFansConfig();

    @InterfaceC1501170pAR("/webcast/privilege/fans_config/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    AbstractC19484711Kz<C470590Icr<FansConfigResponse.Data>> getFansConfigWithParameter();

    @InterfaceC1501160pAQ("/webcast/privilege/non_fans_get_user_data/")
    AbstractC19484711Kz<C470590Icr<GetNonFansUserDataResponse.Data>> getFansUserData(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("anchor_id") String str2);

    @InterfaceC1501160pAQ("/webcast/privilege/fans_get_task_info/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    C11NZ<String> getJoinFansTaskInfo(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("is_pre_render") String str3);

    @InterfaceC1501160pAQ("/webcast/privilege/fans_get_task_info/")
    AbstractC19484711Kz<C470590Icr<FansGetTaskInfoResponse.Data>> getTaskInfo(@InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/privilege/fans_get_task_info/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    AbstractC19484711Kz<C470590Icr<FansGetTaskInfoResponse.Data>> getTaskInfoWithParameter(@InterfaceC1501070pAH("sec_anchor_id") String str);
}
