package com.bytedance.android.livesdk.impl.revenue.crm;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.creator_succ.ChangeInteractionHubGoalResponse;
import webcast.api.creator_succ.GetInteractionHubGoalResponse;

/* JADX INFO: loaded from: classes.dex */
public interface CRMGoalApi {
    @InterfaceC1501160pAQ("/webcast/creator_succ/get_interaction_hub_goal/")
    Object getCRMGoal(@InterfaceC1501070pAH("room_id") long j, InterfaceC1364105Vn<? super C470590Icr<GetInteractionHubGoalResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/creator_succ/change_interaction_hub_goal/")
    Object postCRMGoal(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("new_interaction_hub_goal") int i, InterfaceC1364105Vn<? super C470590Icr<ChangeInteractionHubGoalResponse.Data>> interfaceC1364105Vn);
}
