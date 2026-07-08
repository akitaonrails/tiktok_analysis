package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskDoneData {

    @C09CT("anti_cheating_block_type")
    public Integer antiCheatingBlockType;

    @C09CT("balance")
    public Balance balance;

    @C09CT("inapp_push")
    public InAppPush inAppPush;

    @C09CT("mact_no_claimable")
    public boolean mactNoClaimable;

    @C09CT("pet_health_status")
    public Integer petHealthStatus;

    @C09CT("refresh_touchpoint")
    public boolean refreshTouchPoint;

    @C09CT("round_time")
    public Integer roundTime;

    @C09CT("task_done_response_data")
    public RoundTimeDoneData roundTimeDoneData;

    @C09CT("touchpoint_datas")
    public List<TouchPoint> touchPointData;

    @C09CT("watch_time")
    public Integer watchTime;
}
