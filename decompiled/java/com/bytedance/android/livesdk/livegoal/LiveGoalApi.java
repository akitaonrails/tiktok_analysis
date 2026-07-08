package com.bytedance.android.livesdk.livegoal;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.goal.model.CommitV2RequestParams;
import com.bytedance.android.livesdk.goal.model.CommitV2Response;
import com.bytedance.android.livesdk.goal.model.PinRequestParams;
import com.bytedance.android.livesdk.goal.model.PinResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface LiveGoalApi {
    @InterfaceC1501170pAR("/webcast/goal/commit_v2/")
    C11NZ<C470590Icr<CommitV2Response.Data>> requestCommitV2Goal(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1485405rg CommitV2RequestParams commitV2RequestParams);

    @InterfaceC1501170pAR("/webcast/goal/pin/")
    C11NZ<C470590Icr<PinResponse.Data>> requestPinGoal(@InterfaceC1501070pAH("goal_id") long j, @InterfaceC1501070pAH("sub_goal_id") long j2, @InterfaceC1501070pAH("room_id") long j3, @InterfaceC1501070pAH("type") int i, @InterfaceC1485405rg PinRequestParams pinRequestParams);
}
