package com.bytedance.android.livesdk.revenue.level.impl.fansclub.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.sub.GetSubGoalResponse;

/* JADX INFO: loaded from: classes.dex */
public interface SuperFansGoalApi {
    @InterfaceC1501160pAQ("/webcast/sub/goal/get/")
    AbstractC19484711Kz<C470590Icr<GetSubGoalResponse.Data>> getSuperFansGoalInfo(@InterfaceC1501070pAH("sec_owner_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("goal_scene") int i);
}
