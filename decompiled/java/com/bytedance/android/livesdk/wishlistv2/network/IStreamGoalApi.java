package com.bytedance.android.livesdk.wishlistv2.network;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributorsResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IStreamGoalApi {
    @InterfaceC1501160pAQ("/webcast/goal/contributors/")
    C11NZ<C470590Icr<LiveStreamGoalContributorsResponse>> getContributors(@InterfaceC1501070pAH("sec_owner_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("offset") long j2, @InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("limit") long j3, @InterfaceC1501070pAH("goal_id") long j4);
}
